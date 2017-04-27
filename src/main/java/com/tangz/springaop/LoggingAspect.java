package com.tangz.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.tangz.springaop.Calculator.*(..)) && args(a, ..)")
    private void arithmeticDoLog(JoinPoint jp, int a) {
        System.out.println(a + ": " + jp.toString());
    }
}
