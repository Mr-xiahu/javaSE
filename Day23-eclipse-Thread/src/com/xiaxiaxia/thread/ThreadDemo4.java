package com.xiaxiaxia.thread;

/*
 * public final void join():等待该线程终止。 其他线程菜开始执行
 */
public class ThreadDemo4 {
	public static void main(String[] args) {
		ThreadJoin tj1 = new ThreadJoin();
		ThreadJoin tj2 = new ThreadJoin();
		ThreadJoin tj3 = new ThreadJoin();

		tj1.setName("李渊");
		tj2.setName("李世民");
		tj3.setName("李元霸");

		tj1.start();
		try {
			tj1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		tj2.start();
		try {
			tj2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tj3.start();
	}
}
