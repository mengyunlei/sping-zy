package com.zhouyu;

import com.zhouyu.service.MylService;
import com.zhouyu.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		MylService mylService = (MylService) applicationContext.getBean("mylService");
//		mylService.test();
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.test();
		//applicationContext.refresh();

	}
}
