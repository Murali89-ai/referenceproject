package com.wu.brwallet.customer.profile.config;

import com.wu.era.library.exception.exceptiontype.WUExceptionType;
import com.wu.era.library.exception.exceptiontype.WUServiceException;
import com.wu.era.library.exception.utils.WUServiceExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import static com.wu.brwallet.customer.profile.constants.BusinessConstants.*;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class WUExceptionConfig {

	@Autowired
	private WUServiceExceptionUtils exceptionUtils;

	public WUServiceException prepareErrorCode(Exception e, String upstreamService) {
		String errorCode;
		HttpStatus httpStatus;
		String issue;
		Map<String, String> errorDetails = null;
		if (e instanceof HttpClientErrorException.BadRequest) {
			errorCode = BAD_REQUEST;
			httpStatus = HttpStatus.BAD_REQUEST;
		} else if (e instanceof HttpClientErrorException.NotFound) {
			errorCode = NOT_FOUND;
			httpStatus = HttpStatus.NOT_FOUND;
		} else if (e instanceof HttpClientErrorException.MethodNotAllowed) {
			errorCode = METHOD_NOT_ALLOWED;
			httpStatus = HttpStatus.METHOD_NOT_ALLOWED;
		} else if (e instanceof HttpClientErrorException.NotAcceptable) {
			errorCode = NOT_ACCEPTABLE;
			httpStatus = HttpStatus.NOT_ACCEPTABLE;
		} else if (e instanceof HttpClientErrorException.UnsupportedMediaType) {
			errorCode = UNSUPPORTED_MEDIA_TYPE;
			httpStatus = HttpStatus.UNSUPPORTED_MEDIA_TYPE;
		} else if (e instanceof HttpClientErrorException.Unauthorized) {
			errorCode = UNAUTHORIZED;
			httpStatus = HttpStatus.UNAUTHORIZED;
		} else if (e instanceof HttpClientErrorException.Forbidden) {
			errorCode = FORBIDDEN;
			httpStatus = HttpStatus.FORBIDDEN;
		} else if (e instanceof HttpServerErrorException.BadGateway) {
			errorCode = BAD_GATEWAY;
			httpStatus = HttpStatus.BAD_GATEWAY;
		} else if (e instanceof HttpServerErrorException.InternalServerError) {
			errorCode = INTERNAL_SERVER_ERROR;
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		} else {
			errorCode = GENERIC_INTERNAL_SERVER_ERROR;
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		}

		// issue = e.getMessage();
		issue = e.getLocalizedMessage();
		errorDetails = new HashMap<String, String>();
		errorDetails.put(errorCode, issue);

		WUServiceException wuException = exceptionUtils.prepareWuException(errorCode, e,
				getWUErrorType(httpStatus.value()), errorDetails, new String[] { upstreamService });
		wuException.setHttpStatus(httpStatus);

		return wuException;
	}

	public WUServiceException prepareUcdError(Exception e) {
		String errorCode = GENERIC_EXCEPTION;
		HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		Map<String, String> errorDetails = new HashMap<String, String>();

		String issue = e.getLocalizedMessage();
		errorDetails = new HashMap<String, String>();
		errorDetails.put(errorCode, issue);

		WUServiceException wuException = exceptionUtils.prepareWuException(errorCode, e,
				getWUErrorType(httpStatus.value()), errorDetails, new String[] { UCD_UPDATE_DEVICE_UPSTREAM_SRV });
		wuException.setHttpStatus(httpStatus);
		return wuException;
	}

	public WUServiceException prepareValidationError(Exception e) {
		String errorCode = UCD_ERROR;
		HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
		Map<String, String> errorDetails = new HashMap<String, String>();


		String issue = e.getLocalizedMessage();
		errorDetails = new HashMap<String, String>();
		errorDetails.put(errorCode, issue);

		WUServiceException wuException = exceptionUtils.prepareWuException(errorCode, e,
				getWUErrorType(httpStatus.value()), errorDetails, new String[] { UCD_UPDATE_DEVICE_UPSTREAM_SRV });
		wuException.setHttpStatus(httpStatus);
		return wuException;
	}


	private WUExceptionType getWUErrorType(int httpStatusCode) {

		String httpStatusStr = String.valueOf(httpStatusCode);

		if (httpStatusStr.matches("2[0-9][0-9]")) {
			return WUExceptionType.SUCCESS;
		} else if (httpStatusStr.matches("4[0-9][0-9]")) {
			return WUExceptionType.BUSINESS;
		} else {
			return WUExceptionType.SERVER;
		}
	}

}
