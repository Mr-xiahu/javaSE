package com.xiahu.TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 *  TreeMap:�ǻ��ں������Map�ӿڵ�ʵ�֡�
 * 
 * HashMap<String,String>
 * ����String
 * ֵ��String
 */
public class TreeMapDemo {
	public static void main(String[] args) {
		// �������϶���
		TreeMap<String, String> tm = new TreeMap<>();

		tm.put("java", "��ѧ��");
		tm.put("javaEE", "���»�");
		tm.put("javaSE", "������");
		tm.put("javaWorld", "����");
		tm.put("java", "��ѧ��");
		tm.put("javaSE", "������");

		Set<Map.Entry<String, String>> set = tm.entrySet();
		for (Map.Entry<String, String> me : set) {
			System.out.println(me.getKey() + "---" + me.getValue());
		}
	}

}
