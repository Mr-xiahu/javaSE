package com.xiahu.H_SellTicket_Runnable_ToAnswer;

/*
 * 
 */
public class SellTicket implements Runnable {

	// ����100��Ʊ
	private  int tickets = 100;

	// ����������
	private static  Object obj = new Object();

	@Override
	public void run() {
		while (true) {
			synchronized (obj) {
				if (tickets > 0) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println(Thread.currentThread().getName()
							+ "���ڳ��۵�" + (tickets--) + "��Ʊ");
				}
			}
		}
	}

}
