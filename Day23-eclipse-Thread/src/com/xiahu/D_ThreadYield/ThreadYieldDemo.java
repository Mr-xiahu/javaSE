package com.xiahu.D_ThreadYield;

/*
 * �����߳�:
 * 		public static void yield():��ͣ��ǰ����ִ�е��̶߳��󣬲�ִ�������̡߳� 
 * 		�ö���̵߳�ִ�и���г�����ǲ��ܿ�����֤һ��һ�Ρ�
 */
public class ThreadYieldDemo {
	public static void main(String[] args) {
		// �����̶߳���
		ThreadYield ty1 = new ThreadYield();
		ThreadYield ty2 = new ThreadYield();

		// �����߳�����
		ty1.setName("�Ż�");
		ty2.setName("����");

		// �����߳�
		ty1.start();
		ty2.start();

	}

}
