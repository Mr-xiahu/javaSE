package com.xiaxiaxia.thread;

public class ThreadDemo2 {
	public static void main(String[] args) {
	MyThread m1 = new MyThread();
		MyThread m2 = new MyThread();
		m1.setName("�Ļ�");
		m2.setName("����");
		m1.start();
		m2.start();
		System.out.println(m1.getName());
		System.out.println(m2.getName());
		
		
		//��ȡ��ǰmain�������߳�����
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
	}
}
