package com.xiahu.D_ThreadGroup_new;

/*
 * 
 */
public class ThreadGroupDemo {

	private static MyRunnable runnable = new MyRunnable();

	public static void main(String[] args) {
		method();

		// ��������޸��߳����ڵ�����?
		// ����һ���߳���
		// ���������̵߳�ʱ�򣬰������̵߳���ָ��Ϊ�����Լ��½��߳���
		method2();

	}

	private static void method() {
		// �����߳�
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);

		// ��������
		thread1.setName("�Ļ�");
		thread2.setName("����");

		// �Ҳ�֪�����������Ǹ��߳���,����֪������ô��
		// �߳�������ķ�����public final ThreadGroup getThreadGroup()
		ThreadGroup threadGroup1 = thread1.getThreadGroup();
		ThreadGroup threadGroup2 = thread1.getThreadGroup();
		// �߳�������ķ�����public final String getName()
		String name1 = threadGroup1.getName();
		String name2 = threadGroup2.getName();
		System.out.println(name1);
		System.out.println(name2);
		// ͨ���������֪���ˣ��߳�Ĭ�����������main�߳���
		// ͨ������Ĳ��ԣ���Ӧ���ܹ�������Ĭ������£����е��̶߳�����ͬһ����
		System.out.println(Thread.currentThread().getThreadGroup().getName());

	}

	private static void method2() {
		// ����һ���߳���
		ThreadGroup group = new ThreadGroup("��˧431");

		Thread thread1 = new Thread(group, runnable);
		Thread thread2 = new Thread(group, runnable);

		thread1.setName("�Ļ�");
		thread2.setName("����");
		ThreadGroup threadGroup1 = thread1.getThreadGroup();
		ThreadGroup threadGroup2 = thread1.getThreadGroup();
		// �߳�������ķ�����public final String getName()
		String name1 = threadGroup1.getName();
		String name2 = threadGroup2.getName();
		System.out.println(name1);
		System.out.println(name2);
		// ͨ���������֪���ˣ��߳�Ĭ�����������main�߳���
		// ͨ������Ĳ��ԣ���Ӧ���ܹ�������Ĭ������£����е��̶߳�����ͬһ����
		System.out.println(Thread.currentThread().getThreadGroup().getName());

	}
}
