package com.example.testEnum.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExampleAspect {

  @Around("@annotation(MovieInterface)")
  public Object apply(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
    String string = null;
    System.out.println("Rozpoczynam procesowanie");
    Object proceed = proceedingJoinPoint.proceed();
    string.toUpperCase();
    System.out.println("Koncze procesowanie");
    return proceed;
  }
}
