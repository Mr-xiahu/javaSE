package com.xiaxiaxia.thread;

/*
 * public final void setDaemon(boolean on):�����̱߳��Ϊ�ػ��̻߳��û��̡߳�----����ִ��
 *     ���������е��̶߳����ػ��߳�ʱ��Java ������˳��� �÷��������������߳�ǰ���á�   
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
		ThreadDaemon daemon1 = new ThreadDaemon();
		ThreadDaemon daemon2 = new ThreadDaemon();

		// �����ջ��߳�
		daemon1.setName("�ŷ�");
		daemon2.setName("����");

		// �����ջ��߳�
		daemon1.setDaemon(true);
		daemon2.setDaemon(true);

		// �����߳�
		daemon1.start();
		daemon2.start();

		Thread.currentThread().setName("liubei");
		for (int x = 0; x < 5; x++) {
			System.out.println(Thread.currentThread().getName() + ":" + x);
		}
	}
}
