package com.cp.service.impl;

import com.cp.service.WelComeService;
import org.springframework.stereotype.Service;


@Service
public class WelComeServiceImpl implements WelComeService {



	@Override
	public String sayHello(String name) {

		System.out.println("欢迎你，"+name);

		return "success";
	}
}
