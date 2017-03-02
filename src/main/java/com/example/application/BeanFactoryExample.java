package com.example.application;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

import com.example.course.DowjonesNewsListener;
import com.example.course.DowjonesNewsPersister;
import com.example.course.FXNewsProvider;

public class BeanFactoryExample {
	public static void main(String[] args)  {
		DefaultListableBeanFactory listableBeanFactory = new DefaultListableBeanFactory();
		BeanFactory container =  bindViaCode(listableBeanFactory);
		FXNewsProvider newsProvider = 
				(FXNewsProvider)container.getBean("jdNewsProvider");
				newsProvider.getAndPersistNews();
		
	}
	
	public static BeanFactory bindViaCode(DefaultListableBeanFactory beanDefinitionRegistry) {
		// 1 实力化bean定义
		AbstractBeanDefinition newsProvider = new RootBeanDefinition(FXNewsProvider.class);
		AbstractBeanDefinition newsListener = new RootBeanDefinition(DowjonesNewsListener.class);
		AbstractBeanDefinition newsPersister = new RootBeanDefinition(DowjonesNewsPersister.class);
		
		// 将bean定义注册到容器中
		beanDefinitionRegistry.registerBeanDefinition("jdNewsProvider", newsProvider);
		beanDefinitionRegistry.registerBeanDefinition("jdNewsListener", newsListener);
		beanDefinitionRegistry.registerBeanDefinition("jdNewsPersister", newsPersister);
		
		//指定依赖关系
		//通过构造方法的方式注入
		ConstructorArgumentValues argumentValues = new ConstructorArgumentValues();
		argumentValues.addIndexedArgumentValue(0, newsPersister);
		argumentValues.addIndexedArgumentValue(1, newsListener);
		newsProvider.setConstructorArgumentValues(argumentValues);
		
		//通过setter方法注入
		MutablePropertyValues mutablePropertyValues = new MutablePropertyValues();
		mutablePropertyValues.addPropertyValue("newsListener", newsListener);
		mutablePropertyValues.addPropertyValue("newsPersister", newsPersister);
		newsProvider.setPropertyValues(mutablePropertyValues);
		
		return (BeanFactory)beanDefinitionRegistry;
	}
}
