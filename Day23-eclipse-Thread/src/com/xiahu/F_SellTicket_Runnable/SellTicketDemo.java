package com.xiahu.F_SellTicket_Runnable;
/*
 * ��Runnable�ӿ�ʵ��
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket st=new SellTicket();
		
		Thread th1=new Thread(st, "����1");
		Thread th2=new Thread(st, "����2");
		Thread th3=new Thread(st, "����3");
		
		th1.start();
		th2.start();
		th3.start();
		
	}

}
