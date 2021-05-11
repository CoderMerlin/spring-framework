package com.cp.entity.factory;

import com.cp.entity.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Coder编程
 * @Title: UserFactoryBean
 * @ProjectName spring
 * @Description: TODO
 * @date 2021/5/8 15:17
 */
public class UserFactoryBean implements FactoryBean<User> {
	@Override
	public User getObject() throws Exception {
		return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}
}
