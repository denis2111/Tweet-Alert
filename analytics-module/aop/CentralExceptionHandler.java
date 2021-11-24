package ro.uaic.info.tweetanalytics.handler;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.AfterThrowing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

@Component
@Aspect
public class CentralExceptionHandler {
	private static Logger errorLogger = LoggerFactory.getLogger("errors");
		
	@AfterThrowing(pointcut = "execution(* ro.uaic.info.tweetanalytics.controllers.*.*(..))", throwing = "ex")
    public void logError(Exception ex) {
		errorLogger.error(ex.getMessage());
    }
}
