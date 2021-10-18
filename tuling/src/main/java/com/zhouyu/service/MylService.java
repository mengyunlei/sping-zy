package com.zhouyu.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author 周瑜
 */
@Service
public class MylService {

	@Autowired
	private UserService userService;

	public void test() {
		System.out.println("myl-test");
	}


}
