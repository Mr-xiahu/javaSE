package com.xiahu.Collections;

import java.util.ArrayList;

import java.util.List;

/*
 * Collections:����Լ��Ͻ��в����Ĺ����࣬���Ǿ�̬������
 *  
 *  �����⣺
 * Collection��Collections������?
 * Collection:�ǵ��м��ϵĶ���ӿڣ����ӽӿ�List��Set��
 * Collections:����Լ��ϲ����Ĺ����࣬�жԼ��Ͻ�������Ͷ��ֲ��ҵķ���
 * 
 * Ҫ֪���ķ���
 * public static <T> void sort(List<T> list)������ Ĭ�����������Ȼ˳��
 * public static <T> int binarySearch(List<?> list,T key):���ֲ���
 * public static <T> T max(Collection<?> coll):���ֵ
 * public static void reverse(List<?> list):��ת
 * public static void shuffle(List<?> list):����û�
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(30);
		list.add(40);
		list.add(10);
		list.add(20);
		list.add(50);

		// System.out.println("list:"+list);
		// public static <T> void sort(List<T> list)������ Ĭ�����������Ȼ˳��
		// java.util.Collections.sort(list);
		// System.out.println("list:"+list);

		// public static <T> int binarySearch(List<?> list,T key):���ֲ���
		// System.out.println("binarySearch:" +
		// java.util.Collections.binarySearch(list, 50));

		// public static <T> T max(Collection<?> coll):���ֵ
		// System.out.println("max:" + java.util.Collections.max(list));

		// public static void reverse(List<?> list):��ת
		System.out.println(list);
		System.out.println("----------------------");
		java.util.Collections.reverse(list);
		System.out.println(list);

	}

}
