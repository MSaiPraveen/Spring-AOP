package com.example.SpringBootRest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceMonitorAspect {
    private static  final Logger logger= LoggerFactory.getLogger(PerformanceMonitorAspect.class);

    @Around("execution(* com.example.SpringBootRest.service.JobService.getJob(..))")
    public Object monitorTime(ProceedingJoinPoint jp) throws Throwable {
        long startTime=System.currentTimeMillis();
        logger.info("Method started at "+startTime);

        Object obj=jp.proceed();

        long endTime=System.currentTimeMillis();
        logger.info("Method ended at "+endTime);
        logger.info("Time taken"+jp.getSignature().getName()+(endTime-startTime));

        return obj;
    }


}
