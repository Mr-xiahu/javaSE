package com.xiahu.D_ThreadStop;
/*
 * 
 */
import java.util.Date;

public class ThreadStop extends Thread {
	@Override
	public void run() {
		System.out.println("��ʼִ��:"+new Date());
		
		//˯��10���ڼ���ִ��
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("����ִ��:"+new Date());
	}

}
