package com.xiaxiaxia.thread;

/*
 * public final int getPriority():返回线程对象的优先级
 * public final void setPriority(int newPriority)：更改线程的优先级。    1-10
 * 
 * 优先级越高，越靠前
 */
public class ThreadDemo5 {
	public static void main(String[] args) {
		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		ThreadPriority tp3 = new ThreadPriority();

		tp1.setName("东方不败");
		tp2.setName("岳不群");
		tp3.setName("林平之");
		
		//查看三个线程的优先级
		System.out.println(tp1.getPriority());//5
		System.out.println(tp2.getPriority());//5
		System.out.println(tp3.getPriority());//5
		
		//分别设置三个线程的优先级不通
		tp1.setPriority(10);
		tp2.setPriority(4);
		tp3.setPriority(3);
		
		tp1.start();
		tp2.start();
		tp3.start();
	}
}
