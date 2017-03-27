package com.example.javamultithread.lesson2threadsafe;

public class MyThread1 extends Thread{
	
	private int count = 5;
	
	public MyThread1(String name) {
		// TODO Auto-generated constructor stub
		super();
		this.setName(name);
	}
	
	public synchronized void run() {
		while(count > 0) {
			count--;
			System.out.println("Thread name is " + this.getName() + " : " +count);
		}
	}

}
