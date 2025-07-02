package com.wu.brwallet.customer.profile.config;

import com.wu.brwallet.customer.profile.aop.LoggingAnnotation;
import com.wu.brwallet.customer.profile.constants.BusinessConstants;
import com.wu.era.library.auth.*;
import com.wu.era.library.exception.exceptiontype.WUExceptionType;
import com.wu.era.library.exception.utils.WUServiceExceptionUtils;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutionException;

@Component
public class SecurityConfig {

	@Value("${auth.token.username}")
	private String clientId;
	@Value("${auth.token.password}")
	private String clientSecret;
	@Value("${auth.token.url}")
	private String tokenEndpoint;
	@Value("${auth.token.scope}")
	private String scope;
	@Autowired
	private WUServiceExceptionUtils wuserviceExceptionUtils;

	@LoggingAnnotation
	public String generateToken() {
		AuthMethod oauthClient = AuthManager.getInstance(AuthType.OAUTH);

		try {
			return oauthClient.getAuthToken(getAuthConfig());
		} catch (AuthException | ExecutionException e) {
			throw wuserviceExceptionUtils.prepareWuException(BusinessConstants.JWT_GENERATION_ERROR, e, WUExceptionType.SERVER);
		}
	}

	private AuthConfig getAuthConfig() {

		AuthConfig config = AuthConfig.builder().clientId(clientId).clientSecret(clientSecret)
				.tokenEndpoint(tokenEndpoint).grantType(GrantType.CLIENT_CREDENTIALS).scope(scope).build();

		return config;
	}

}
