package com.xiahu.E_Runnable;

/*
 *  ��ʽ2��ʵ��Runnable�ӿ�
 * ���裺
 * 		A:�Զ�����MyRunnableʵ��Runnable�ӿ�
 * 		B:��дrun()����
 * 		C:����MyRunnable��Ķ���
 * 		D:����Thread��Ķ��󣬲���C����Ķ�����Ϊ�����������
 */
public class MyRunnableDemo {
	public static void main(String[] args) {
		// 3.����MyRunnable��Ķ���
		MyRunnable myRunnable = new MyRunnable();
		// 4.����Thread��Ķ��󣬲���C����Ķ�����Ϊ�����������
		Thread thread1 = new Thread(myRunnable);
		Thread thread2 = new Thread(myRunnable);
		
		//�����߳�����
		thread1.setName("������");
		thread2.setName("��԰��");
		
		//�����߳�
		thread1.start();
		thread2.start();
	}

}
