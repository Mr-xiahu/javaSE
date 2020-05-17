package com.xiaxiaxia.sellTicket2;

/*
 * 为了更加真实模拟卖票的场景,道理上讲是应该:
 *     窗口一:100
 *     窗口二:99
 *     窗口三:98
 *     ...
 *   所有应该加入睡眠
 */
public class SellTicket implements Runnable {

	private int tickets = 100;

	@Override
	public void run() {
		while (true) {
			// t1,t2,t3三个线程
			// 这一次的tickets = 1;
			if (tickets > 0) {
				// 为了模拟更真实的场景，我们稍作休息
				try {
					Thread.sleep(100); // t1进来了并休息，t2进来了并休息，t3进来了并休息，
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--) + "张票");
				// 窗口1正在出售第1张票,tickets=0
				// 窗口2正在出售第0张票,tickets=-1
				// 窗口3正在出售第-1张票,tickets=-2
			}
		}
	}

}
