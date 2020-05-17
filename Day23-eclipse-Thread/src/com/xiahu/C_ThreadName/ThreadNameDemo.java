package com.xiahu.C_ThreadName;

/*
 * 
 * 如何获取线程对象的名称呢?
 * public final String getName():获取线程的名称。
 * 如何设置线程对象的名称呢?
 * public final void setName(String name):设置线程的名称
 * 
 * 针对不是Thread类的子类中如何获取线程对象名称呢?
 * public static Thread currentThread():返回当前正在执行的线程对象
 * Thread.currentThread().getName()
 */
public class ThreadNameDemo {
	public static void main(String[] args) {
		// 1.创建线程对象
		MyThread myThread1 = new MyThread();
		MyThread myThread2 = new MyThread();

		// 2.通过成员方法为线程赋值名称
		myThread1.setName("夏虎");
		myThread2.setName("杨铭呀");

		// 3.通过构造方法为线程赋值名称
		MyThread myThread3 = new MyThread("张翼德");
		MyThread myThread4 = new MyThread("刘备");
		
		// 4.启动线程
		myThread1.start();
		myThread2.start();
		myThread3.start();
		myThread4.start();
		
		//public static Thread currentThread():返回当前正在执行的线程对象
		System.out.println("现在正在运行的线程:"+Thread.currentThread().getName());

	}

}

/*
 * 名称为什么是：Thread-? 编号
 * 
 * class Thread { private char name[];
 * 
 * public Thread() { init(null, null, "Thread-" + nextThreadNum(), 0); }
 * 
 * private void init(ThreadGroup g, Runnable target, String name, long
 * stackSize) { init(g, target, name, stackSize, null); }
 * 
 * private void init(ThreadGroup g, Runnable target, String name, long
 * stackSize, AccessControlContext acc) { //大部分代码被省略了 this.name =
 * name.toCharArray(); }
 * 
 * public final void setName(String name) { this.name = name.toCharArray(); }
 * 
 * 
 * private static int threadInitNumber; //0,1,2 private static synchronized int
 * nextThreadNum() { return threadInitNumber++; //return 0,1 }
 * 
 * public final String getName() { return String.valueOf(name); } }
 * 
 * class MyThread extends Thread { public MyThread() { super(); } }
 */
