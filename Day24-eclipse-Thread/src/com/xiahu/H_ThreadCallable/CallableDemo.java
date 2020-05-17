package com.xiahu.H_ThreadCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

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
	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
		
		
		// ����һ���̳߳ض��󣬿���Ҫ���������̶߳���
		ExecutorService pool = Executors.newFixedThreadPool(2);

		// <T> Future<T> submit(Callable<T> task)
		Future<Integer> f1 = pool.submit(new MyCallable(100));
		Future<Integer> f2 = pool.submit(new MyCallable(200));

		int i1 = f1.get();
		int i2 = f2.get();

		System.out.println(i1);
		System.out.println(i2);

		pool.shutdown();
	}

}
