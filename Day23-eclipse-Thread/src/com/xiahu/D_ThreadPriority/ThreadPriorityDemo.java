package com.xiahu.D_ThreadPriority;

/*
 * ���ǵ��߳�û���������ȼ�,�϶���Ĭ�����ȼ���
 * ��ô��Ĭ�����ȼ��Ƕ�����?
 * ��λ�ȡ�̶߳�������ȼ�?
 * 		public final int getPriority():�����̶߳�������ȼ�
 * ��������̶߳�������ȼ���?
 * 		public final void setPriority(int newPriority)�������̵߳����ȼ���
 * 
 * public static final int MAX_PRIORITY   ��ȡ������ȼ�
 * public static final int MIN_PRIORITY   ��ȡ��С���ȼ�
 *
 * 
 * ע�⣺
 * 		�߳�Ĭ�����ȼ���5��
 * 		�߳����ȼ��ķ�Χ�ǣ�1-10��
 * 		�߳����ȼ��߽�����ʾ�̻߳�ȡ�� CPUʱ��Ƭ�ļ��ʸߣ�����Ҫ�ڴ����Ƚ϶࣬���߶�����е�ʱ����ܿ����ȽϺõ�Ч����
 * 		
 * IllegalArgumentException:�Ƿ������쳣��
 * �׳����쳣�����򷽷�������һ�����Ϸ�����ȷ�Ĳ����� 
 */
public class ThreadPriorityDemo {
	public static void main(String[] args) {
		// �����̶߳���
		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		ThreadPriority tp3 = new ThreadPriority();

		// �����̶߳�������
		tp1.setName("������");
		tp2.setName("����");
		tp3.setName("��Ȩ");

		// ��ȡ�߳����ȼ�
		// Ĭ�����ȼ�Ϊ5
		// System.out.println(tp1.getPriority());//5
		// System.out.println(tp2.getPriority());//5
		// System.out.println(tp3.getPriority());//5

		// �鿴������ȼ�����С���ȼ�
		// System.out.println(tp1.MAX_PRIORITY);//10
		// System.out.println(tp1.MIN_PRIORITY);//1

		// �����߳����ȼ�
		tp1.setPriority(10);
		tp2.setPriority(1);

		// �����߳�
		tp1.start();
		tp2.start();
		tp3.start();
	}

}
