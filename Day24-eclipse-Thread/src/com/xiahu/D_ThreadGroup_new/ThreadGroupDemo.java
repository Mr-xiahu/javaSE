package com.xiahu.D_ThreadGroup_new;

/*
 * 
 */
public class ThreadGroupDemo {

	private static MyRunnable runnable = new MyRunnable();

	public static void main(String[] args) {
		method();

		// 我们如何修改线程所在的组呢?
		// 创建一个线程组
		// 创建其他线程的时候，把其他线程的组指定为我们自己新建线程组
		method2();

	}

	private static void method() {
		// 创建线程
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);

		// 设置名称
		thread1.setName("夏虎");
		thread2.setName("杨铭");

		// 我不知道他们属于那个线程组,我想知道，怎么办
		// 线程类里面的方法：public final ThreadGroup getThreadGroup()
		ThreadGroup threadGroup1 = thread1.getThreadGroup();
		ThreadGroup threadGroup2 = thread1.getThreadGroup();
		// 线程组里面的方法：public final String getName()
		String name1 = threadGroup1.getName();
		String name2 = threadGroup2.getName();
		System.out.println(name1);
		System.out.println(name2);
		// 通过结果我们知道了：线程默认情况下属于main线程组
		// 通过下面的测试，你应该能够看到，默任情况下，所有的线程都属于同一个组
		System.out.println(Thread.currentThread().getThreadGroup().getName());

	}

	private static void method2() {
		// 创建一个线程组
		ThreadGroup group = new ThreadGroup("最帅431");

		Thread thread1 = new Thread(group, runnable);
		Thread thread2 = new Thread(group, runnable);

		thread1.setName("夏虎");
		thread2.setName("杨铭");
		ThreadGroup threadGroup1 = thread1.getThreadGroup();
		ThreadGroup threadGroup2 = thread1.getThreadGroup();
		// 线程组里面的方法：public final String getName()
		String name1 = threadGroup1.getName();
		String name2 = threadGroup2.getName();
		System.out.println(name1);
		System.out.println(name2);
		// 通过结果我们知道了：线程默认情况下属于main线程组
		// 通过下面的测试，你应该能够看到，默任情况下，所有的线程都属于同一个组
		System.out.println(Thread.currentThread().getThreadGroup().getName());

	}
}
