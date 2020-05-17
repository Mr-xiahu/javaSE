package com.xiahu.TreeMap;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * ���� ��"aababcabcdabcde",��ȡ�ַ�����ÿһ����ĸ���ֵĴ���Ҫ����:a(5)b(4)c(3)d(2)e(1)
 * 
 * ������
 * 		A:����һ���ַ���(���ԸĽ�Ϊ����¼��)
 * 		B:����һ��TreeMap����
 * 			��:Character
 * 			ֵ��Integer
 * 		C:���ַ���ת��Ϊ�ַ�����
 * 		D:�����ַ����飬�õ�ÿһ���ַ�
 * 		E:�øղŵõ����ַ���Ϊ����������ȥ��ֵ��������ֵ
 * 			��null:˵���ü������ڣ��ͰѸ��ַ���Ϊ����1��Ϊֵ�洢
 * 			����null:˵���ü����ڣ��Ͱ�ֵ��1��Ȼ����д�洢�ü���ֵ
 * 		F:�����ַ�������������
 * 		G:�������ϣ��õ�����ֵ�����а���Ҫ��ƴ��
 * 		H:���ַ���������ת��Ϊ�ַ������
 * 
 * ¼�룺linqingxia
 * �����result:a(1)g(1)i(3)l(1)n(2)q(1)x(1)
 */
public class TreeMapTest {
	public static void main(String[] args) {
		// A:����һ���ַ���(���ԸĽ�Ϊ����¼��)
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���:");
		String ss = sc.nextLine();

		// B:����һ��TreeMap����
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

		// C:���ַ���ת��Ϊ�ַ�����
		char[] chs = ss.toCharArray();

		// D:�����ַ����飬�õ�ÿһ���ַ�
		for (char ch : chs) {
			Integer i = tm.get(ch);

			// ��null:˵���ü������ڣ��ͰѸ��ַ���Ϊ����1��Ϊֵ�洢
			if (i == null) {
				tm.put(ch, 1);
			} else {
				// ����null:˵���ü����ڣ��Ͱ�ֵ��1��Ȼ����д�洢�ü���ֵ
				i++;
				tm.put(ch, i);
			}
		}
		// F:�����ַ�������������
		StringBuilder sb = new StringBuilder();

		// G:�������ϣ��õ�����ֵ�����а���Ҫ��ƴ��
		Set<Map.Entry<Character, Integer>> set = tm.entrySet();
		for (Map.Entry<Character, Integer> me : set) {
			sb.append(me.getKey()).append("(").append(me.getValue())
					.append(")");
		}
		
		String result=sb.toString();
		System.out.println("result:"+result);
	}

}
