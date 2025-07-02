package com.wu.brwallet.customer.profile.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wu.brwallet.customer.profile.constants.BusinessConstants;
import com.wu.brwallet.customer.profile.model.response.registerDevice.DataResponse;
import com.wu.era.library.exception.exceptiontype.WUExceptionType;
import com.wu.era.library.exception.exceptiontype.WUServiceException;
import com.wu.era.library.exception.utils.WUServiceExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ControllerAdvice {

    @Autowired
    private WUServiceExceptionUtils wuServiceExceptionUtils;

    @Autowired
    private ObjectMapper objectMapper;

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public ResponseEntity<DataResponse> handleException(MethodArgumentNotValidException m) throws JsonProcessingException {

        List<FieldError> result = m.getBindingResult().getFieldErrors();
        System.out.println(result);
       Set<String> listOfFields=new  LinkedHashSet<>();
        for (FieldError fieldError:result) {
            listOfFields.add(fieldError.getField());
        }
        WUServiceException wuServi = wuServiceExceptionUtils.prepareWuException(BusinessConstants.INVALID_DATA, new RuntimeException(), WUExceptionType.BUSINESS,new String[]{"required key"+listOfFields+" not found or null"});

        DataResponse dataResponse = new DataResponse();
        dataResponse.setCode(wuServi.getCode());
        dataResponse.setMessage(wuServi.getErrorMessage());
        dataResponse.setPriority(wuServi.getPriority());
        dataResponse.setName(wuServi.getName());
        return ResponseEntity.badRequest().body(dataResponse);
    }

}
