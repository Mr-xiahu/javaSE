package com.xiaxiaxia.thread;

public class ThreadDemo2 {
	public static void main(String[] args) {
	MyThread m1 = new MyThread();
		MyThread m2 = new MyThread();
		m1.setName("夏虎");
		m2.setName("杨铭");
		m1.start();
		m2.start();
		System.out.println(m1.getName());
		System.out.println(m2.getName());
		
		
		//获取当前main方法的线程名称
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
	}
}
