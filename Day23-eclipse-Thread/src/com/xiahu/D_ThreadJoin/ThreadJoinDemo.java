package com.xiahu.D_ThreadJoin;

/*
 * 加入线程:
 *  	public final void join():等待该线程终止。 
 */
public class ThreadJoinDemo {
	public static void main(String[] args) {
		// 创建线程对象
		ThreadJoin tj1 = new ThreadJoin();
		ThreadJoin tj2 = new ThreadJoin();
		ThreadJoin tj3 = new ThreadJoin();

		// 设置线程名称
		tj1.setName("李渊");
		tj2.setName("李世民");
		tj3.setName("李元霸");

		// 启动线程
		tj1.start();
		// 加入线程
		try {
			tj1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tj2.start();
		tj3.start();
	}

}
