package com.xiahu.C_ThreadName;

/*
 * 
 * ��λ�ȡ�̶߳����������?
 * public final String getName():��ȡ�̵߳����ơ�
 * ��������̶߳����������?
 * public final void setName(String name):�����̵߳�����
 * 
 * ��Բ���Thread�����������λ�ȡ�̶߳���������?
 * public static Thread currentThread():���ص�ǰ����ִ�е��̶߳���
 * Thread.currentThread().getName()
 */
public class ThreadNameDemo {
	public static void main(String[] args) {
		// 1.�����̶߳���
		MyThread myThread1 = new MyThread();
		MyThread myThread2 = new MyThread();

		// 2.ͨ����Ա����Ϊ�̸߳�ֵ����
		myThread1.setName("�Ļ�");
		myThread2.setName("����ѽ");

		// 3.ͨ�����췽��Ϊ�̸߳�ֵ����
		MyThread myThread3 = new MyThread("�����");
		MyThread myThread4 = new MyThread("����");
		
		// 4.�����߳�
		myThread1.start();
		myThread2.start();
		myThread3.start();
		myThread4.start();
		
		//public static Thread currentThread():���ص�ǰ����ִ�е��̶߳���
		System.out.println("�����������е��߳�:"+Thread.currentThread().getName());

	}

}

/*
 * ����Ϊʲô�ǣ�Thread-? ���
 * 
 * class Thread { private char name[];
 * 
 * public Thread() { init(null, null, "Thread-" + nextThreadNum(), 0); }
 * 
 * private void init(ThreadGroup g, Runnable target, String name, long
 * stackSize) { init(g, target, name, stackSize, null); }
 * 
 * private void init(ThreadGroup g, Runnable target, String name, long
 * stackSize, AccessControlContext acc) { //�󲿷ִ��뱻ʡ���� this.name =
 * name.toCharArray(); }
 * 
 * public final void setName(String name) { this.name = name.toCharArray(); }
 * 
 * 
 * private static int threadInitNumber; //0,1,2 private static synchronized int
 * nextThreadNum() { return threadInitNumber++; //return 0,1 }
 * 
 * public final String getName() { return String.valueOf(name); } }
 * 
 * class MyThread extends Thread { public MyThread() { super(); } }
 */
