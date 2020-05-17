package com.xiahu.G_ThreadCallable;

import java.util.concurrent.Callable;

/*
 * 实现多线程方式三:
 */
//1.实现Callable接口
public class MyCallable implements Callable  {

	//2.重写Call()方法
	@Override
	public Object call() throws Exception {
		for (int i = 0; i <100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
		return null;
	}


}
