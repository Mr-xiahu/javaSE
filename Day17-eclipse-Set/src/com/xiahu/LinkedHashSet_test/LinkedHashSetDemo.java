package com.xiahu.LinkedHashSet_test;

import java.util.LinkedHashSet;

/*
 * linkedHashSet:�ײ����ݽṹ�ɹ�ϣ���������ɡ�
 * ��ϣ��֤Ԫ�ص�Ψһ�ԡ�
 * ����֤Ԫ�����ء�(�洢��ȡ����һ��)
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();

		// ��Ӽ���Ԫ��
		lhs.add("hello");
		lhs.add("javaEE");
		lhs.add("world");

		// ����
		for (String s : lhs) {
			System.out.println(s);
		}
	}

}
