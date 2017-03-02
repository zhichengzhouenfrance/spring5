package com.example.application;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.example.course.MockNewsPersister;

public class toulianghuanzhu {
	public static void main(String[] args) {
		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
		xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("toulianghuanzhu.xml"));
		MockNewsPersister mockNewsPersister = (MockNewsPersister)defaultListableBeanFactory.getBean("mocknewspersister");
		mockNewsPersister.persistNews();
		mockNewsPersister.persistNews();
	}
}
