package com.xiahu.Map_Son;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 获取功能 		
 * 		V get(Object key):根据键获取值
 * 		Set<K> keySet():获取集合中所有键的集合
 * 		Collection<V> values():获取集合中所有值的集合
 */
public class MapDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		Map<String, String> map = new HashMap<String, String>();

		// 添加元素
		map.put("刘备", "孙尚香");
		map.put("孙策", "大乔");
		map.put("周瑜", "小乔");

		// V get(Object key):根据键获取值
		System.out.println("get:" + map.get("刘备"));
		System.out.println("get:" + map.get("刘备备"));

		// Set<K> keySet():获取集合中所有键的集合
		Set<String> set = map.keySet();
		//
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("----------------");

		// Collection<V> values():获取集合中所有值的集合
		Collection<String> c = map.values();
		//
		for (String ss : c) {
			System.out.println(ss);
		}
	}

}
