package com.xiahu.Work;

import java.util.ArrayList;

/*
 * ����ArrayListȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
 * Ҫ�󣺲��ܴ����µļ��ϣ�������ǰ�ļ���������
 */
public class ArrayListTest2 {
	public static void main(String[] args) {
		// A:�������϶���
		ArrayList array = new ArrayList();

		// ��Ӷ���ַ���Ԫ��(����������ͬ��)
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("java");
		array.add("world");

		// ��ѡ������˼�����룬���ǾͿ���ͨ������˼���������Ŀ
		// ��0���������κͺ���ıȽϣ��оͰѺ�ĸɵ�
		// ͬ����1����...
		for (int x = 0; x < array.size() - 1; x++) {
			for (int y = x + 1; y < array.size(); y++) {
				if (array.get(x).equals(array.get(y))) {
					array.remove(y);
					y--;
				}
			}
		}
		for (int x = 0; x < array.size(); x++) {
			String s = (String) array.get(x);
			System.out.println(s);
		}
	}

}
