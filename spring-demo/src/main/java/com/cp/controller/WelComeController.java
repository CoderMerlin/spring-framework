package com.cp.controller;

import com.cp.service.WelComeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author Coder编程
 * @Title: WelComeController
 * @ProjectName spring
 * @Description: TODO
 * @date 2021/5/8 11:59
 */
@Controller
public class WelComeController {

	@Autowired
	private WelComeService welComeService;


	public void handleRequest(){
		welComeService.sayHello("来自Controller的请求！");
	}
}
