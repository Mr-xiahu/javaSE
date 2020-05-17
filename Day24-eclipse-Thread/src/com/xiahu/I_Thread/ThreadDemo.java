package com.xiahu.I_Thread;

/*
 * 
 * 匿名内部类的格式：
 * 		new 类名或者接口名() {
 * 			重写方法;
 * 		};
 * 		本质：是该类或者接口的子类对象。
 */
public class ThreadDemo {
	public static void main(String[] args) {
		// 继承Thread类实现多线程
		new Thread() {
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println(Thread.currentThread().getName() + ":" + x);
				}
			};
		}.start();

		// 实现Runnable接口实现多线程
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println("hello" + ":" + x);
				}

			}

		}) {
		}.start();

		new Thread(new Runnable() {

			@Override
			public void run() {

			}
		}) {
			@Override
			public void run() {
			}

		}.start();
		
		new Thread(new  Runnable() {
			public void run() {
				
			}
		}){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
			}
		}.start();
	}

}
