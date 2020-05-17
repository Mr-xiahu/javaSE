package com.xiaxiaxia.runnbale;

/*
 * 方式2：实现Runnable接口
 * 步骤：
 * 		A:自定义类MyRunnable实现Runnable接口
 * 		B:重写run()方法
 * 		C:创建MyRunnable类的对象
 * 		D:创建Thread类的对象，并把C步骤的对象作为构造参数传递
 */
public class ThreadDemo {
	public static void main(String[] args) {
		MyThreadImplementRunnable runnable = new MyThreadImplementRunnable();
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		thread1.setName("夏虎");
		thread2.setName("杨铭");
		
		thread1.start();
		thread2.start();

	}
}
