package com.wu.brwallet.customer.profile.service.validatepin;

import com.wu.brwallet.customer.profile.aop.LoggingAnnotation;
import com.wu.brwallet.customer.profile.constants.AppConstants;
import com.wu.brwallet.customer.profile.constants.BusinessConstants;
import com.wu.era.library.exception.exceptiontype.WUExceptionType;
import com.wu.era.library.exception.exceptiontype.WUServiceException;
import com.wu.era.library.exception.utils.WUServiceExceptionUtils;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Base64;

@Service
public class EncryptionService {
    private static final Logger log = LogManager.getLogger(EncryptionService.class);

    @Value("${mambu.encryption.key}")
    private String mambuEncryptionKey;

    @Autowired
    private WUServiceExceptionUtils wuServiceExceptionUtils;

    public String decrypt(String encryptedText) {
        log.info("Encrypted PIN: {}", encryptedText);
        byte[] decode = Base64.getDecoder().decode(encryptedText);
        byte[] decrypt = null;
        try {
            decrypt = decrypt(IOUtils.toByteArray(new ByteArrayInputStream(decode)));
        } catch (Exception ex) {
            log.info(ex.getMessage());
            throw wuServiceExceptionUtils.prepareWuException(BusinessConstants.GENERIC_EXCEPTION, ex, WUExceptionType.SERVER);
        }
        String de = new String(decrypt, StandardCharsets.UTF_8);
        log.info("Decrypted PIN: {}", de);
        return de;
    }

    public byte[] encrypt(byte[] content) throws NoSuchAlgorithmException, InvalidKeySpecException, InvalidAlgorithmParameterException, IllegalBlockSizeException, NoSuchPaddingException, BadPaddingException, InvalidKeyException {
        return runCipher(content, getKeyFromPassword(mambuEncryptionKey, AppConstants.MAMBU_ENCRYPTION_ALGORITHM), 1);
    }

    public byte[] decrypt(byte[] content) throws NoSuchAlgorithmException, InvalidKeySpecException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException, NoSuchPaddingException {
        return runCipher(content, getKeyFromPassword(mambuEncryptionKey, AppConstants.MAMBU_ENCRYPTION_ALGORITHM), 2);
    }

    private Cipher getCipher() throws NoSuchPaddingException, NoSuchAlgorithmException {
            return Cipher.getInstance(AppConstants.MAMBU_ENCRYPTION_ALGORITHM);
    }

    protected AlgorithmParameterSpec getAlgorithmParameterSpec(IvParameterSpec ivParam) {
        return new PBEParameterSpec("12345678".getBytes(), 20, ivParam);
    }

    private Key getKeyFromPassword(String password, String name) throws NoSuchAlgorithmException, InvalidKeySpecException {
            PBEKeySpec keySpec = new PBEKeySpec(password.toCharArray());
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(name);
            log.info("Key factory: {}", keyFactory.toString());
            return keyFactory.generateSecret(keySpec);
    }
    private byte[] runCipher(byte[] content, Key key, int mode) throws InvalidAlgorithmParameterException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, NoSuchPaddingException, NoSuchAlgorithmException {
            Cipher cipher = getCipher();
            SecureRandom secureRandom = new SecureRandom();
            byte[] ivInByteArray = new byte[cipher.getBlockSize()];
            ivInByteArray = Arrays.copyOfRange(key.getEncoded(), 0, ivInByteArray.length);

            cipher.init(mode, key, getAlgorithmParameterSpec(new IvParameterSpec(ivInByteArray)), secureRandom);
            log.info("Cipher: " + cipher.toString());
            return cipher.doFinal(content);

    }
    @LoggingAnnotation
    public String encryption(String plainText) {
        log.info("Plain text to encrypt: {}", plainText);
        byte[] textBytes = plainText.getBytes(StandardCharsets.UTF_8);
        byte[] encrypted = null;
        try {
            encrypted = encrypt(textBytes);
        } catch (Exception ex) {
            log.error("Error encrypting text: {}", ex.getMessage());
            throw wuServiceExceptionUtils.prepareWuException(BusinessConstants.GENERIC_EXCEPTION, ex, WUExceptionType.SERVER);
        }
        String encryptedBase64 = Base64.getEncoder().encodeToString(encrypted);
        log.info("Encrypted text: {}", encryptedBase64);
        return encryptedBase64;
    }

}
