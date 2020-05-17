package com.xiahu.D_ThreadGroup;

/*
 * 
 */
public class ThreadGroupDemo {
	public static void main(String[] args) {
		method();

		method2();

	}

	private static void method2() {
		// // ThreadGroup(String name)
		ThreadGroup tg = new ThreadGroup("这是一个新的线程组");
		MyRunnable my = new MyRunnable();
		// Thread(ThreadGroup group, Runnable target, String name)
		Thread th1 = new Thread(tg,my, "张三");
		Thread th2 = new Thread(tg,my, "李四");
		
		System.out.println(th1.getThreadGroup().getName());
		System.out.println(th2.getThreadGroup().getName());
		

	}

	private static void method() {
		MyRunnable my = new MyRunnable();

		Thread th1 = new Thread(my, "张三");
		Thread th2 = new Thread(my, "李四");

		// 我不知道他们属于那个线程组,我想知道，怎么办
		// 线程类里面的方法：public final ThreadGroup getThreadGroup()
		ThreadGroup tg1 = th1.getThreadGroup();
		ThreadGroup tg2 = th2.getThreadGroup();
		// 线程组里面的方法：public final String getName()
		System.out.println(tg1.getName());
		System.out.println(tg2.getName());

		System.out.println("-------");
		// 通过结果我们知道了：线程默认情况下属于main线程组
		// 通过下面的测试，你应该能够看到，默任情况下，所有的线程都属于同一个组
		System.out.println(Thread.currentThread().getThreadGroup().getName());

	}
}
