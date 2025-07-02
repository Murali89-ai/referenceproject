package com.wu.brwallet.customer.profile.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;

import static com.wu.brwallet.customer.profile.constants.BusinessConstants.LOG_MESSSAGE;
import static com.wu.brwallet.customer.profile.constants.BusinessConstants.LOG_MESSSAGE_WITH_ELAPSED_TIME;

@Component
@Aspect
public class LoggingAspect {

    public static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Around("@annotation(loggingAnnotation)")
    public Object monitorTime(ProceedingJoinPoint point, LoggingAnnotation loggingAnnotation) throws Throwable {

        logger.info(LOG_MESSSAGE, point.getSignature().toShortString());

        Instant start = Instant.now();
        Object result  = point.proceed();
        Instant finish = Instant.now();

        logger.info(LOG_MESSSAGE_WITH_ELAPSED_TIME, point.getSignature().toShortString(), Duration.between(start, finish).toMillis() + " ms" );

        return result;
    }

}
