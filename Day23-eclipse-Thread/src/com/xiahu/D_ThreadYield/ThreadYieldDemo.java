package com.xiahu.D_ThreadYield;

/*
 * 礼让线程:
 * 		public static void yield():暂停当前正在执行的线程对象，并执行其他线程。 
 * 		让多个线程的执行更和谐，但是不能靠它保证一人一次。
 */
public class ThreadYieldDemo {
	public static void main(String[] args) {
		// 创建线程对象
		ThreadYield ty1 = new ThreadYield();
		ThreadYield ty2 = new ThreadYield();

		// 设置线程名称
		ty1.setName("吓唬");
		ty2.setName("杨铭");

		// 启动线程
		ty1.start();
		ty2.start();

	}

}
