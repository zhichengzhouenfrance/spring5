package com.example.application;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.example.course.Profile;

public class FactoryBeanExample {
	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xmlBeanDefinitionReader =  new XmlBeanDefinitionReader((BeanDefinitionRegistry)beanFactory);
		xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("factorybean.xml"));
		Profile p = (Profile)beanFactory.getBean("profile");
		System.out.println(p.getUser().getId());
		
	}
}
