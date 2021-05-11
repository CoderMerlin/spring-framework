package com.cp;


import com.cp.controller.WelComeController;
import com.cp.entity.User;
import com.cp.entity.factory.UserFactoryBean;
import com.cp.service.WelComeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@Configuration
@ComponentScan("com.cp")
public class Entrance {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		String xmlPath = "E://Github/spring-framework/spring-demo/src/main/resources/spring/spring-config.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);
		WelComeService welComeService = (WelComeService) applicationContext.getBean("welcomeService");
		welComeService.sayHello("Hello Spring");


		//得到无参构造函数创建的对象
		User user1a = (User) applicationContext.getBean("user1");
		User user1b = (User) applicationContext.getBean("user1");

		System.out.println("无参构造函数创建的对象" + user1a);
		System.out.println("无参构造函数创建的对象" + user1b);

		//得到静态工厂创建的对象
		User user2a = (User) applicationContext.getBean("user2");
		User user2b = (User) applicationContext.getBean("user2");
		System.out.println("静态工厂创建的对象" + user2a);
		System.out.println("静态工厂创建的对象" + user2b);

		//得到实例工厂创建的对象
		User user3a = (User) applicationContext.getBean("user3");
		User user3b = (User) applicationContext.getBean("user3");
		System.out.println("实例工厂创建的对象" + user3a);
		System.out.println("实例工厂创建的对象" + user3b);

		//BeanFactory创建对象
		User user4a = (User) applicationContext.getBean("userFactoryBean");
		User user4b = (User) applicationContext.getBean("userFactoryBean");
		UserFactoryBean userFactoryBean = (UserFactoryBean) applicationContext.getBean("&userFactoryBean"); //加前缀 &
		System.out.println("实例工厂创建的对象" + user4a);
		System.out.println("实例工厂创建的对象" + user4b);
		System.out.println("实例工厂对象" + userFactoryBean);
	}


	public static void main2(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Entrance.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}

		WelComeService welComeService = (WelComeService) applicationContext.getBean("welComeServiceImpl");
		welComeService.sayHello("Hello Spring框架2");

		WelComeController welComeController = (WelComeController) applicationContext.getBean("welComeController");
		welComeController.handleRequest();
	}

}
