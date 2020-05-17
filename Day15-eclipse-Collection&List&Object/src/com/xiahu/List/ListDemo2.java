package com.xiahu.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * List���ϵ����й��ܣ�
 *   A:��ӹ���
 * 		void add(int index,Object element):��ָ��λ�����Ԫ��
 *   B:��ȡ����
 * 		Object get(int index):��ȡָ��λ�õ�Ԫ��
 *   C:�б������
 * 		ListIterator listIterator()��List�������еĵ�����
 *   D:ɾ������
 * 		Object remove(int index)����������ɾ��Ԫ��,���ر�ɾ����Ԫ��
 *   E:�޸Ĺ���
 * 		Object set(int index,Object element):���������޸�Ԫ�أ����ر����ε�Ԫ��
 */
public class ListDemo2 {
	public static void main(String[] args) {
		// ����List����
		List list = new ArrayList();
		list.add("�Ļ�");
		list.add("˧��");
		iterator(list);
		System.out.println("----------");

		// void add(int index,Object element):��ָ��λ�����Ԫ��
		list.add(1, "���");
		iterator(list);

		// Object get(int index):��ȡָ��λ�õ�Ԫ��
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println("----------");

		// ListIterator listIterator()��List�������еĵ�����
		ListIterator it = list.listIterator();
		System.out.println(list);

		// Object remove(int index)����������ɾ��Ԫ��,���ر�ɾ����Ԫ��
		System.out.println(list.remove(0));
		System.out.println("----------");
		iterator(list);
		System.out.println("----------");

		// Object set(int index,Object element):���������޸�Ԫ�أ����ر����ε�Ԫ��
		System.out.println(list.set(0, "С�Ը�"));
		System.out.println("----------");
		iterator(list);
	}

	public static void iterator(List list) {
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}

}
