package com.xiaxiaxia.sellTicket1;

/*
 * 模拟影院卖票
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket sTicket1 = new SellTicket();
		SellTicket sTicket2 = new SellTicket();
		SellTicket sTicket3 = new SellTicket();
		
		sTicket1.setName("窗口一");
		sTicket2.setName("窗口二");
		sTicket3.setName("窗口三");
		
		sTicket1.start();
		sTicket2.start();
		sTicket3.start();
	}

}
