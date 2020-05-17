package com.xiahu.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * HashMap<Integer,String>
 * ����Integer
 * ֵ��String
 */
public class HashMapDemo2 {
	public static void main(String[] args) {
		HashMap<Integer, String> hs = new HashMap<>();

		hs.put(30, "����");
		hs.put(31, "��");
		hs.put(23, "չ��");
		hs.put(25, "�����");
		hs.put(40, "����");

		Set<Map.Entry<Integer, String>> set = hs.entrySet();
		for (Map.Entry<Integer, String> me : set) {
			System.out.println(me.getKey() + "--" + me.getValue());
		}
	}

}
