package com.xiaxiaxia.thread;

/*
 * public final int getPriority():�����̶߳�������ȼ�
 * public final void setPriority(int newPriority)�������̵߳����ȼ���    1-10
 * 
 * ���ȼ�Խ�ߣ�Խ��ǰ
 */
public class ThreadDemo5 {
	public static void main(String[] args) {
		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		ThreadPriority tp3 = new ThreadPriority();

		tp1.setName("��������");
		tp2.setName("����Ⱥ");
		tp3.setName("��ƽ֮");
		
		//�鿴�����̵߳����ȼ�
		System.out.println(tp1.getPriority());//5
		System.out.println(tp2.getPriority());//5
		System.out.println(tp3.getPriority());//5
		
		//�ֱ����������̵߳����ȼ���ͨ
		tp1.setPriority(10);
		tp2.setPriority(4);
		tp3.setPriority(3);
		
		tp1.start();
		tp2.start();
		tp3.start();
	}
}
