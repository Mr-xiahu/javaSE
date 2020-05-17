package com.xiahu.Set_Son;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Collection
 * 		|--List
 * 			����(�洢˳���ȡ��˳��һ��),���ظ�
 * 		|--Set
 * 			����(�洢˳���ȡ��˳��һ��),Ψһ
 * 
 * HashSet��������֤ set �ĵ���˳���ر���������֤��˳���ò��䡣
 * ע�⣺��ȻSet���ϵ�Ԫ�����򣬵��ǣ���Ϊ������˵�����϶������Լ��Ĵ洢˳��
 * �����˳��ǡ�ú����Ĵ洢˳��һ�£����������������Զ�洢һЩ���ݣ����ܿ���Ч����
 */
public class SetDemo {
	public static void main(String[] args) {
		// �������϶���
		Set<String> set = new HashSet<String>();

		// ��Ӽ���Ԫ��
		set.add("hello");
		set.add("world");
		set.add("javaSE");
		set.add("hello");
		set.add("world");
		set.add("javaSE");

		// ��������
		for (String s : set) {
			System.out.println(s);
		}

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}

}
