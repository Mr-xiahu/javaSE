package com.xiaxiaxia.runnbale;

/*
 * ��ʽ2��ʵ��Runnable�ӿ�
 * ���裺
 * 		A:�Զ�����MyRunnableʵ��Runnable�ӿ�
 * 		B:��дrun()����
 * 		C:����MyRunnable��Ķ���
 * 		D:����Thread��Ķ��󣬲���C����Ķ�����Ϊ�����������
 */
public class ThreadDemo {
	public static void main(String[] args) {
		MyThreadImplementRunnable runnable = new MyThreadImplementRunnable();
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		thread1.setName("�Ļ�");
		thread2.setName("����");
		
		thread1.start();
		thread2.start();

	}
}
