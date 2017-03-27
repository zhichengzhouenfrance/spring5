package com.example.javamultithread.lesson2threadsafe;

public class Test {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1("T1");
		MyThread1 t2 = new MyThread1("T2");
		MyThread1 t3 = new MyThread1("T3");
		MyThread1 t4 = new MyThread1("T4");
		MyThread1 t5 = new MyThread1("T5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}
}
