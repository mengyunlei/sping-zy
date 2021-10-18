package com.zhouyu.aspect;


import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class ZhouyuAspect {

//	@DeclareParents(value = "com.zhouyu.service.UserService", defaultImpl = UserImplement.class)
//	private UserInterface userInterface;

//	@Before("execution(* com.zhouyu.service..*.*(..))")
//	public void zhouyuBefore(JoinPoint joinPoint) {
//		System.out.println("zhouyuBefore");
//	}

//	@Before(value = "execution(public void com.zhouyu.service.UserService.test(..)) && args(a, b)", argNames = "a,b")
//	public void zhouyuBefore(String a, String b) {
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println("zhouyuBefore");
//	}


}
