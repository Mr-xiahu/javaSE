package com.xiahu.A_Lock;

public class SellTicketDemo {
	public static void main(String[] args) {
		// 创建线程对象
		SellTicket st = new SellTicket();

		Thread th1 = new Thread(st, "窗口1");
		Thread th2 = new Thread(st, "窗口2");
		Thread th3 = new Thread(st, "窗口3");

		// 启动线程
		th1.start();
		th2.start();
		th3.start();
	}

}
