package com.cp;


import com.cp.controller.WelComeController;
import com.cp.service.WelComeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@Configuration
@ComponentScan("com.cp")
public class Entrance {

	public static void main1(String[] args) {
		System.out.println("Hello World!");
		String xmlPath = "E://WorkProject/spring-framework/spring-framework-5.2.0.RELEASE/spring-demo/src/main/resources/spring/spring-config.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);
		WelComeService welComeService = (WelComeService)applicationContext.getBean("welcomeService");
		welComeService.sayHello("Hello Spring");
	}


	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Entrance.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}

		WelComeService welComeService = (WelComeService)applicationContext.getBean("welComeServiceImpl");
		welComeService.sayHello("Hello Spring框架2");

		WelComeController welComeController = (WelComeController)applicationContext.getBean("welComeController");
		welComeController.handleRequest();
	}

}
