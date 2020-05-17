package com.xiahu.Map_Son;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * ��ȡ���� 		
 * 		V get(Object key):���ݼ���ȡֵ
 * 		Set<K> keySet():��ȡ���������м��ļ���
 * 		Collection<V> values():��ȡ����������ֵ�ļ���
 */
public class MapDemo2 {
	public static void main(String[] args) {
		// �������϶���
		Map<String, String> map = new HashMap<String, String>();

		// ���Ԫ��
		map.put("����", "������");
		map.put("���", "����");
		map.put("���", "С��");

		// V get(Object key):���ݼ���ȡֵ
		System.out.println("get:" + map.get("����"));
		System.out.println("get:" + map.get("������"));

		// Set<K> keySet():��ȡ���������м��ļ���
		Set<String> set = map.keySet();
		//
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("----------------");

		// Collection<V> values():��ȡ����������ֵ�ļ���
		Collection<String> c = map.values();
		//
		for (String ss : c) {
			System.out.println(ss);
		}
	}

}
