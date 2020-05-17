package com.xiahu.E_Runnable;

/*
 * 线程的方式二:实现Runnable接口
 */
//1.实现Runnable接口
public class MyRunnable implements Runnable {

	//2.重写run()方法
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("现在正在运行的是:"+Thread.currentThread().getName()+"----"+i);
		}
	}


}
