package com.example.application;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.example.course.FXNewsProvider;

public class BeanFactoryRegisterByXML {
	public static void main(String[] args) {
		DefaultListableBeanFactory listableBeanFactory = new DefaultListableBeanFactory();
		BeanFactory container = bindViaXMLFile(listableBeanFactory);
		FXNewsProvider newsProvider = (FXNewsProvider) container.getBean("djNewsProvider");
		newsProvider.getAndPersistNews();

	}

	public static BeanFactory bindViaXMLFile(BeanDefinitionRegistry registry)
	{ 
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(registry);
		reader.loadBeanDefinitions("classpath:Beanfactory.xml");
		return (BeanFactory)registry;
		// 或者直接  4
		//return new XmlBeanFactory(new ClassPathResource("../Beanfactory.xml"));
	}

}
