package ro.uaic.info.tweetanalytics.handler;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;


@Aspect
@Component
@EnableAspectJAutoProxy
public class CentralLoggingHandler {
	private static Map<String, Integer> counter = new HashMap<>();
    private static Logger mainLogger = LoggerFactory.getLogger("Logging");
    
    @Before("execution(* ro.uaic.info.tweetanalytics.*.Tweets*.*(..)) && !execution(* ro.uaic.info.tweetanalytics.repositories.*.*(..))")
    public void logBeforeEachRequest(JoinPoint joinPoint)
    {
    	
       String methodName = joinPoint.getSignature().getName();
       if (!counter.containsKey(methodName)) {
    	   counter.put(methodName, 1);
       } else {
    	   counter.put(methodName, counter.get(methodName)+1);
       }
       StringBuilder sb = new StringBuilder('\n');
       sb.append("Method call: " + methodName + '\n');
       sb.append("Counter ").append(methodName).append(" : ").append(counter.get(methodName));

       mainLogger.info(sb.toString());
    }

    @AfterReturning(value = "execution(* ro.uaic.info.tweetanalytics.*.Tweets*.*(..)) && !execution(* ro.uaic.info.tweetanalytics.repositories.*.*(..))"
            + " && execution(* ro.uaic.info.tweetanalytics.*.Feedback*.*(..))",
            returning="returnValue")
    public void logAfterEachRequest(JoinPoint joinPoint, Object returnValue)
    {
       String methodName = joinPoint.getSignature().getName();
       StringBuilder sb = new StringBuilder('\n');
       sb.append("Method name: " + methodName + ", Return value: " + returnValue);
       mainLogger.info(sb.toString());

    }

    @Around(value = "execution(* ro.uaic.info.tweetanalytics.repositories.*.*(..))")
    public Object profileAroundEachRequest(ProceedingJoinPoint joinPoint) 
    throws Throwable
    {
       String methodName = joinPoint.getSignature().getName();
       long startTime = System.nanoTime();
       Object returnValue = joinPoint.proceed();
       long finishTime = System.nanoTime();
       mainLogger.info("Time for " + methodName +  ": " + (finishTime - startTime) / 1000000 + " miliseconds");
       return returnValue;
    }

}
