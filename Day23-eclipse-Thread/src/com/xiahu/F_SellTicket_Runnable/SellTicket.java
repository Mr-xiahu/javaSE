package com.xiahu.F_SellTicket_Runnable;
/*
 * 
 */
public class SellTicket implements Runnable {
	private int tickets = 100;

	@Override
	public void run() {
		while (true) {
			if (tickets > 0) {
				System.out.println(Thread.currentThread().getName() + "���ڳ��۵�"
						+ (tickets--) + "��Ʊ");
			}
		}

	}

}
