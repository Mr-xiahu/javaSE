package com.xiahu.A_Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable {

	// 定义100张票
	private int tickets = 100;

	// 创建锁对象
	// private Object obj = new Object();

	// 定义锁对象
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
							+ "正在出售第" + (tickets--) + "张票");

				}
			} catch (Exception e) {
			}finally{
				lock.unlock();
			}

		}

	}

}
