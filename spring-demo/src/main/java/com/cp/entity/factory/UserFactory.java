package com.cp.entity.factory;

import com.cp.entity.User;

/**
 * @author Coder编程
 * @Title: UserFactory
 * @ProjectName spring
 * @Description: 实例工厂调用
 * @date 2021/5/8 14:01
 */
public class UserFactory {

	//普通的方法，返回User对象
	//不能通过类名调用，需要通过对象调用
	public User getUser(){return new User();}

}
