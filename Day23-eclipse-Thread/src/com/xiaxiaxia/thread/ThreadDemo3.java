package com.xiaxiaxia.thread;

/*
 * public final void setDaemon(boolean on):将该线程标记为守护线程或用户线程。----最先执行
 *     当正在运行的线程都是守护线程时，Java 虚拟机退出。 该方法必须在启动线程前调用。   
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
		ThreadDaemon daemon1 = new ThreadDaemon();
		ThreadDaemon daemon2 = new ThreadDaemon();

		// 设置收获线程
		daemon1.setName("张飞");
		daemon2.setName("关羽");

		// 设置收获线程
		daemon1.setDaemon(true);
		daemon2.setDaemon(true);

		// 启动线程
		daemon1.start();
		daemon2.start();

		Thread.currentThread().setName("liubei");
		for (int x = 0; x < 5; x++) {
			System.out.println(Thread.currentThread().getName() + ":" + x);
		}
	}
}
