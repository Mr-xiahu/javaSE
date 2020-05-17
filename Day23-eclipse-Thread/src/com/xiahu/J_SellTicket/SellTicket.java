package com.xiahu.J_SellTicket;

public class SellTicket implements Runnable {
	// 定义100张票
	private static int tickets = 100;

	// 创建锁对象
	private Object obj = new Object();

	private Demo d = new Demo();

	private int i = 0;

	// //同步代码块用obj做锁
	// @Override
	// public void run() {
	// while (true) {
	// synchronized (obj) {
	// // if (tickets > 0) {
	// try {
	// Thread.sleep(100);
	// } catch (InterruptedException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// System.out.println(Thread.currentThread().getName()
	// + "正在出售第" + (tickets--) + "张票");
	// }
	//
	// }
	// }
	//
	// }

	// ////同步代码块用任意对象做锁
	// @Override
	// public void run() {
	// while (true) {
	// synchronized (d) {
	// if (tickets > 0) {
	// try {
	// Thread.sleep(100);
	// } catch (InterruptedException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// System.out.println(Thread.currentThread().getName()
	// + "正在出售第" + (tickets--) + "张票");
	// }
	//
	// }
	// }
	//
	// }

	@Override
	public void run() {
		while (true) {
			if (i % 2 == 0) {
				synchronized (SellTicket.class) {
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

				}
			} else {
				// synchronized (d) {
				// if (tickets > 0) {
				// try {
				// Thread.sleep(100);
				// } catch (InterruptedException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }
				// System.out.println(Thread.currentThread().getName()
				// + "正在出售第" + (tickets--) + "张票");
				// }
				//
				// }
				SellTicket();

			}
			i++;

		}

	}

	// //如果一个方法一进去就看到了代码被同步了，那么我就再想能不能把这个同步加在方法上呢?
	private static synchronized void SellTicket() {
		if (tickets > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "正在出售第"
					+ (tickets--) + "张票");

		}

	}

}

class Demo {

}
