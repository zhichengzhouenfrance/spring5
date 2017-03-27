package com.example.javamultithread.lesson2threadsafe;

public class Thread2 extends Thread {

	private int count = 5;


	public synchronized void run() {
		super.run();
		count--;
		System.out.println("Thread name is " + this.currentThread().getName() + " : " + count);

	}

}
