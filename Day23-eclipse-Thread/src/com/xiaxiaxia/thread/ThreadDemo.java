package com.xiaxiaxia.thread;

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		MyThread myThread2 = new MyThread();
		myThread.start();
		myThread2.start();
	}
}
