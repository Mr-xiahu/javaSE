package com.xiahu.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * HashMap<Integer,String>
 * 键：Integer
 * 值：String
 */
public class HashMapDemo2 {
	public static void main(String[] args) {
		HashMap<Integer, String> hs = new HashMap<>();

		hs.put(30, "王朝");
		hs.put(31, "马汉");
		hs.put(23, "展昭");
		hs.put(25, "公孙策");
		hs.put(40, "包拯");

		Set<Map.Entry<Integer, String>> set = hs.entrySet();
		for (Map.Entry<Integer, String> me : set) {
			System.out.println(me.getKey() + "--" + me.getValue());
		}
	}

}
