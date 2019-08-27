package model;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect
public class dtaspect {
	@Pointcut("execution(public * select(..))")
    public void anyMethod() {    }
	
	@Around(value = "anyMethod()")
    public Object exe34(ProceedingJoinPoint p) throws Throwable{
		System.out.println(p.getTarget().getClass().getName()+"---h«∞÷√.......");
		Object o=p.proceed();
		System.out.println("h∫Û÷√.......");
		return o;
	}	
	
}
