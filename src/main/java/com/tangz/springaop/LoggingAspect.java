package com.tangz.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.tangz.springaop.Calculator.*(..))")
    private void arithmeticDoLog(JoinPoint jp) {
        System.out.println(jp.toString());
    }
}
