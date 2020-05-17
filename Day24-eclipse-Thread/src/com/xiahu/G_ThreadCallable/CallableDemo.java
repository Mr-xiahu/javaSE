package com.xiahu.G_ThreadCallable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * ���߳�ʵ�ֵķ�ʽ3��
 *  	A:����һ���̳߳ض��󣬿���Ҫ���������̶߳���
 * 			public static ExecutorService newFixedThreadPool(int nThreads)
 * 		B:�����̳߳ص��߳̿���ִ�У�
 * 			����ִ��Runnable�������Callable���������߳�
 * 			��һ����ʵ��Runnable�ӿڡ�
 * 		C:�������·�������
 * 			Future<?> submit(Runnable task)
 *			<T> Future<T> submit(Callable<T> task)
 *		D:�Ҿ�Ҫ������������?
 *			���ԡ�
 */
public class CallableDemo {
	public static void main(String[] args) {
		// 3.����һ���̳߳ض��󣬿���Ҫ���������̶߳���
		ExecutorService pool = Executors.newFixedThreadPool(2);
		// 4.����ִ��Runnable�������Callable���������߳�
		pool.submit(new MyCallable());
		pool.submit(new MyCallable());
		
		//�ر��̳߳�
		pool.shutdown();
	}

}
