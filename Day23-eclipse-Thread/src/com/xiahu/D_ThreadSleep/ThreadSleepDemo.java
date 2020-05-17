package com.xiahu.D_ThreadSleep;

/*
 * 休眠线程
 */
public class ThreadSleepDemo {
	public static void main(String[] args) {
		//创建线程对象
		ThreadSleep ts1=new ThreadSleep();
		ThreadSleep ts2=new ThreadSleep();
		ThreadSleep ts3=new ThreadSleep();
		
	    //设置线程名称
		ts1.setName("张三");
		ts2.setName("李四");
		ts3.setName("王五");
		
		//启动线程
		ts1.start();
		ts2.start();
		ts3.start();
	}

}
