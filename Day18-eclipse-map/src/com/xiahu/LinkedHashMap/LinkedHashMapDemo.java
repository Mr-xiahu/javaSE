package com.xiahu.LinkedHashMap;

import java.util.LinkedHashMap;

import java.util.Map;
import java.util.Set;

/*
 * LinkedHashMap:是Map接口的哈希表和链接列表实现，具有可预知的迭代顺序。
 * 由哈希表保证键的唯一性
 * 由链表保证键盘的有序(存储和取出的顺序一致)
 */
public class LinkedHashMapDemo {
	public static void main(String[] args) {

		// 创建集合对象
		LinkedHashMap<String, String> hm = new LinkedHashMap<>();

		// 添加几个元素
		hm.put("1234", "张学友");
		hm.put("2345", "刘德华");
		hm.put("4567", "余文乐");
		hm.put("6789", "彭于晏");
		
		//遍历
		Set<Map.Entry<String, String>> set=hm.entrySet();
		for(Map.Entry<String, String> me:set){
			System.out.println(me.getKey()+"---"+me.getValue());
		} 
	}

}
