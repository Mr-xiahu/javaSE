package com.xiaxia.Pattern_D;

/*
 * ����ģʽ��
 * 		����ʽ����һ���ؾʹ�������
 * 		����ʽ���õ�ʱ�򣬲�ȥ��������
 * 
 * �����⣺����ģʽ��˼����ʲô?��дһ���������֡�
 * 
 * 		����������ʽ(�ǲ��������ĵ���ģʽ)
 * 		���ԣ�����ʽ(���ܻ������ĵ���ģʽ)
 * 			A:������(�ӳټ���)	
 * 			B:�̰߳�ȫ����
 * 				a:�Ƿ���̻߳���	��
 * 				b:�Ƿ��й�������	��
 * 				c:�Ƿ��ж����������������� 	��
 */
public class Teacher {
	private Teacher() {

	}

	private static Teacher t = null;

	public synchronized static Teacher getTeacher() {// �Ժ����߳����������
														// �̰߳�ȫ���⣬����Ҫ��synchronized
		if (t == null) {
			t = new Teacher();
		}
		return t;
	}

}
