package com.xiaxiaxia.sellTicket1;

/*
 * 
 */
public class SellTicket extends Thread {

	private int tickets = 100;

	@Override
	public void run() {
		while (tickets > 0) {
			System.out.println(getName() + "���ڳ��۵�" + tickets + "��Ʊ");
			tickets--;
		}
	}

}
