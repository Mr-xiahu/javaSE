package com.xiaxiaxia.thread;

/*
 * public static void yield():��ͣ��ǰ����ִ�е��̶߳��󣬲�ִ�������̡߳� 
 * �ö���̵߳�ִ�и���г�����ǲ��ܿ�����֤һ��һ�Ρ�
 */
public class ThreadDemo8 {
	public static void main(String[] args) {
		ThreadYield ty1 = new ThreadYield();
		ThreadYield ty2 = new ThreadYield();

		ty1.setName("����ϼ");
		ty2.setName("����");

		ty1.start();
		ty2.start();
	}
}
