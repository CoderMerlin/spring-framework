package com.cp.entity.factory;

import com.cp.entity.User;

/**
 * @author Coder编程
 * @Title: StaticFactory
 * @ProjectName spring
 * @Description: TODO
 * @date 2021/5/8 14:00
 */
public class StaticFactory {

	public static User getUser(){
		return new User();
	}
}
