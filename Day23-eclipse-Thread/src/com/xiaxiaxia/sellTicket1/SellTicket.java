package com.xiaxiaxia.sellTicket1;

/*
 * 
 */
public class SellTicket extends Thread {

	private int tickets = 100;

	@Override
	public void run() {
		while (tickets > 0) {
			System.out.println(getName() + "正在出售第" + tickets + "张票");
			tickets--;
		}
	}

}
