package com.example.SpringBootRest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {

    private static  final Logger logger= LoggerFactory.getLogger(LoggingAspect.class);

    // return type ,class name ,method name ,args

   @Before("execution(* com.example.SpringBootRest.service.JobService.getJob(..))")
    public void logMethodCall(JoinPoint jp) {
        logger.info("Method called"+jp.getSignature().getName());
    }
    @After("execution(* com.example.SpringBootRest.service.JobService.getJob(..))")
    public void logMethodExecuted(JoinPoint jp) {
        logger.info("Method executed"+jp.getSignature().getName());
    }
    @AfterThrowing("execution(* com.example.SpringBootRest.service.JobService.getJob(..))")
    public void logMethodCrashed(JoinPoint jp) {
        logger.info("Method Crashed"+jp.getSignature().getName());
    }
    @AfterReturning("execution(* com.example.SpringBootRest.service.JobService.getJob(..))")
    public void logMethodExecutedSuccessfully(JoinPoint jp) {
        logger.info("Method  executed successfully "+jp.getSignature().getName());
    }

}
