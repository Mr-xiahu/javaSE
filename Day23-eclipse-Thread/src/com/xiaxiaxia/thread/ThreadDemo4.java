package com.xiaxiaxia.thread;

/*
 * public final void join():�ȴ����߳���ֹ�� �����̲߳˿�ʼִ��
 */
public class ThreadDemo4 {
	public static void main(String[] args) {
		ThreadJoin tj1 = new ThreadJoin();
		ThreadJoin tj2 = new ThreadJoin();
		ThreadJoin tj3 = new ThreadJoin();

		tj1.setName("��Ԩ");
		tj2.setName("������");
		tj3.setName("��Ԫ��");

		tj1.start();
		try {
			tj1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		tj2.start();
		try {
			tj2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tj3.start();
	}
}
