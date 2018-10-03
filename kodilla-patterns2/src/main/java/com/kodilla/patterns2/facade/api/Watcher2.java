package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Watcher2 {
    public static final Logger LOGGER = LoggerFactory.getLogger(Watcher2.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logEvent() {
        LOGGER.info("Logging the event");
    }
    @After("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logEnding() {
        LOGGER.info("End of the event");
    }
    @Around("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public Object measureTimes(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result2;
        try {
            long begin2 = System.currentTimeMillis();
            result2 = proceedingJoinPoint.proceed();
            long end2 = System.currentTimeMillis();
            LOGGER.info("Time consumed : " + (end2 - begin2) + " [ms]");
        } catch (Throwable throwable2) {
            LOGGER.error(throwable2.getMessage());
            throw throwable2;
        }
        return result2;
    }
}
