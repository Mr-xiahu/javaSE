package com.xiaxiaxia.sellTicket1;

/*
 * ģ��ӰԺ��Ʊ
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket sTicket1 = new SellTicket();
		SellTicket sTicket2 = new SellTicket();
		SellTicket sTicket3 = new SellTicket();
		
		sTicket1.setName("����һ");
		sTicket2.setName("���ڶ�");
		sTicket3.setName("������");
		
		sTicket1.start();
		sTicket2.start();
		sTicket3.start();
	}

}
