package com.xiahu.B_Adapter;

/*
 * ������ģʽ
 * 
 * ���⣺
 * 		�ӿ�(�����Ƚ϶�) -- ʵ����(����ʹ��һ����Ҳ�ð�������ʵ�ָ��ṩ�ˣ������ǿ�ʵ��)
 * 		̫�鷳�ˡ�
 * ���������
 * 		�ӿ�(�����Ƚ϶�) -- ��������(ʵ�ֽӿ�,������ʵ��) -- ʵ����(���ĸ���д�ĸ�)
 */
public class UserDemo {
	public static void main(String[] args) {
		UserDao u = new UserDaoImpl();
		u.add();
	}

}
