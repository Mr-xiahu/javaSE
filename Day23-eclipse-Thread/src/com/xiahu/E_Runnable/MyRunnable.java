package com.xiahu.E_Runnable;

/*
 * �̵߳ķ�ʽ��:ʵ��Runnable�ӿ�
 */
//1.ʵ��Runnable�ӿ�
public class MyRunnable implements Runnable {

	//2.��дrun()����
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("�����������е���:"+Thread.currentThread().getName()+"----"+i);
		}
	}


}
