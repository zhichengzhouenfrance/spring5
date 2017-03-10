package com.example.effectivejava.lesson1staticfactory;

public class SingletonExample {
	
	private static final SingletonExample SINGLETON_EXAMPLE = new SingletonExample();
	
	private SingletonExample() {
		
	}

	public static SingletonExample newInstance() {
		return SINGLETON_EXAMPLE;
	}
}
