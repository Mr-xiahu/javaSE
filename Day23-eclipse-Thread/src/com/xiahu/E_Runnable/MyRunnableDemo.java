package com.xiahu.E_Runnable;

/*
 *  方式2：实现Runnable接口
 * 步骤：
 * 		A:自定义类MyRunnable实现Runnable接口
 * 		B:重写run()方法
 * 		C:创建MyRunnable类的对象
 * 		D:创建Thread类的对象，并把C步骤的对象作为构造参数传递
 */
public class MyRunnableDemo {
	public static void main(String[] args) {
		// 3.创建MyRunnable类的对象
		MyRunnable myRunnable = new MyRunnable();
		// 4.创建Thread类的对象，并把C步骤的对象作为构造参数传递
		Thread thread1 = new Thread(myRunnable);
		Thread thread2 = new Thread(myRunnable);
		
		//设置线程名称
		thread1.setName("扈三娘");
		thread2.setName("菜园子");
		
		//启动线程
		thread1.start();
		thread2.start();
	}

}
