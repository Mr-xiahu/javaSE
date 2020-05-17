package com.xiahu.TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 *  TreeMap:是基于红黑树的Map接口的实现。
 * 
 * HashMap<String,String>
 * 键：String
 * 值：String
 */
public class TreeMapDemo {
	public static void main(String[] args) {
		// 创建集合对象
		TreeMap<String, String> tm = new TreeMap<>();

		tm.put("java", "张学友");
		tm.put("javaEE", "刘德华");
		tm.put("javaSE", "郭富城");
		tm.put("javaWorld", "黎明");
		tm.put("java", "张学友");
		tm.put("javaSE", "彭于晏");

		Set<Map.Entry<String, String>> set = tm.entrySet();
		for (Map.Entry<String, String> me : set) {
			System.out.println(me.getKey() + "---" + me.getValue());
		}
	}

}
