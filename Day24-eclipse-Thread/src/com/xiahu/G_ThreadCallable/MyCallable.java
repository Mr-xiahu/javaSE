package com.xiahu.G_ThreadCallable;

import java.util.concurrent.Callable;

/*
 * ʵ�ֶ��̷߳�ʽ��:
 */
//1.ʵ��Callable�ӿ�
public class MyCallable implements Callable  {

	//2.��дCall()����
	@Override
	public Object call() throws Exception {
		for (int i = 0; i <100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
		return null;
	}


}
