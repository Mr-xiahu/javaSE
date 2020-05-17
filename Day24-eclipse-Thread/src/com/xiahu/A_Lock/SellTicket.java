package com.xiahu.A_Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable {

	// ����100��Ʊ
	private int tickets = 100;

	// ����������
	// private Object obj = new Object();

	// ����������
	private Lock lock = new ReentrantLock();



	@Override
	public void run() {
		while (true) {
			try {
				lock.lock();
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()
							+ "���ڳ��۵�" + (tickets--) + "��Ʊ");

				}
			} catch (Exception e) {
			}finally{
				lock.unlock();
			}

		}

	}

}
