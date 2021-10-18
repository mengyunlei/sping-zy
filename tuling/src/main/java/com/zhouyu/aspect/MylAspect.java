package com.zhouyu.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class MylAspect {

//	@DeclareParents(value = "com.zhouyu.service.UserService", defaultImpl = UserImplement.class)
//	private UserInterface userInterface;

//	@Pointcut("execution(execution(* com.zhouyu.service..*.*(..))")
//	public void myBefore(JoinPoint joinPoint) {
//		System.out.println("myBefore");
//	}

//	@Around(value = "execution(* com.zhouyu.service..*.*(..))")
//	public void zhouyuBefore(ProceedingJoinPoint joinPoint) throws Throwable{
//		System.out.println("------------前置增强-------------");
//		joinPoint.proceed();
//		System.out.println("------------后置增强-------------");
//	}

//	@Before(value = "execution(public void com.zhouyu.service.UserService.test(..)) && args(a, b)", argNames = "a,b")
//	public void zhouyuBefore(String a, String b) {
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println("zhouyuBefore");
//	}


}
