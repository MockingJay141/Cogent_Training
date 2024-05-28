package com.demo.AOP.config;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import com.demo.AOP.model.Department;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GeneralInterceptorAspect {

    //@Pointcut("execution(* com.demo.AOP.controller.*.*(..))")
    @Pointcut("execution(* com.demo.AOP.service.DepartmentService.*(..))")
    //@Pointcut("@annotation(com.demo.AOP.annotation.CustomAnnotation)")
    public void loggingPointCut(){

    }

//    @Before("loggingPointCut()")
//    public void before(JoinPoint joinPoint){
//        System.out.println("Before Method Invoked:: " + joinPoint.getSignature());
//    }
//
//    @After("loggingPointCut()")
//    public void after(JoinPoint joinPoint){
//        System.out.println("After Method Invoked:: " + joinPoint.getSignature());
//    }

//    @AfterReturning(value = "loggingPointCut()", returning = "employee")
//    public void after(JoinPoint joinPoint, Employee employee){
//        System.out.println("After Method Invoked:: " + employee);
//    }

    @AfterThrowing(value = "loggingPointCut()", throwing = "e")
    public void after(JoinPoint joinPoint, Exception e){
        System.out.println("After Method Invoked with Exception:: " + e.getMessage());
    }

    @Around("loggingPointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("Before Method Invoked:: " + joinPoint.getArgs()[0]);
        Object object = joinPoint.proceed();

        if (object instanceof Department){
            System.out.println("After Method Invoked ... Employee" + joinPoint.getArgs()[0]);
        }
        else{
            System.out.println("After Method Invoked... " + joinPoint.getArgs()[0]);
        }
        return object;
    }

}
