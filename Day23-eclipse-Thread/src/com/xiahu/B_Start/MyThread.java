package com.xiahu.B_Start;
/*
 * ����Ҫ��дrun()����,Ϊʲô��?
 * �������е����д��붼��Ҫ���߳�ִ�еġ�
 * �����ʱ��Ϊ��������Щ�����ܹ����߳�ִ�У�java�ṩ��Thread���е�run()����������Щ���߳�ִ�еĴ��롣
 */
public class MyThread extends Thread {
	@Override
	public void run() {
		//��ӡ1---100
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}

}
