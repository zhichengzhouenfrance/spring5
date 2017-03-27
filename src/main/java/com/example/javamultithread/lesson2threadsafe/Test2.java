package com.example.javamultithread.lesson2threadsafe;

public class Test2 {
	public static void main(String[] args) {
		
		Thread2 thread2 = new Thread2();
		
		Thread t1 = new Thread(thread2,"T-----T1");
		Thread t2 = new Thread(thread2,"T-----T2");
		Thread t3 = new Thread(thread2,"T-----T3");
		Thread t4 = new Thread(thread2,"T-----T4");
		Thread t5 = new Thread(thread2,"T-----T5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
