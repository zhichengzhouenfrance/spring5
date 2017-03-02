package com.example.course;

import org.springframework.beans.factory.FactoryBean;

import com.example.data.bean.User;

public class FactoryBeanExample implements FactoryBean<User>{

	@Override
	public User getObject() throws Exception {
		return new User(2);
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}

}
