package com.xiahu.J_SellTicket;

/*
 * A:ͬ����������������˭��?
 * 		�������
 * 
 * B:ͬ�������ĸ�ʽ������������?
 * 		��ͬ���ؼ��ּ��ڷ����ϡ�
 * 
 * 		ͬ��������˭��?
 * 			this
 * 
 * C:��̬����������������?
 * 		��̬��������������˭��?
 * 			����ֽ����ļ�����(����ὲ)
 */
import com.xiahu.I_SellTicket_Runnable_Why.SellTicket;

public class SellTicketDemo {
	public static void main(String[] args) {
		// ������Դ����
		SellTicket st = new SellTicket();

		// ���������̶߳���
		Thread t1 = new Thread(st, "����1");
		Thread t2 = new Thread(st, "����2");
		Thread t3 = new Thread(st, "����3");

		// �����߳�
		t1.start();
		t2.start();
		t3.start();
	}

}
