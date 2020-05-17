package com.xiahu.D_ThreadGroup;

/*
 * 
 */
public class ThreadGroupDemo {
	public static void main(String[] args) {
		method();

		method2();

	}

	private static void method2() {
		// // ThreadGroup(String name)
		ThreadGroup tg = new ThreadGroup("����һ���µ��߳���");
		MyRunnable my = new MyRunnable();
		// Thread(ThreadGroup group, Runnable target, String name)
		Thread th1 = new Thread(tg,my, "����");
		Thread th2 = new Thread(tg,my, "����");
		
		System.out.println(th1.getThreadGroup().getName());
		System.out.println(th2.getThreadGroup().getName());
		

	}

	private static void method() {
		MyRunnable my = new MyRunnable();

		Thread th1 = new Thread(my, "����");
		Thread th2 = new Thread(my, "����");

		// �Ҳ�֪�����������Ǹ��߳���,����֪������ô��
		// �߳�������ķ�����public final ThreadGroup getThreadGroup()
		ThreadGroup tg1 = th1.getThreadGroup();
		ThreadGroup tg2 = th2.getThreadGroup();
		// �߳�������ķ�����public final String getName()
		System.out.println(tg1.getName());
		System.out.println(tg2.getName());

		System.out.println("-------");
		// ͨ���������֪���ˣ��߳�Ĭ�����������main�߳���
		// ͨ������Ĳ��ԣ���Ӧ���ܹ�������Ĭ������£����е��̶߳�����ͬһ����
		System.out.println(Thread.currentThread().getThreadGroup().getName());

	}
}
