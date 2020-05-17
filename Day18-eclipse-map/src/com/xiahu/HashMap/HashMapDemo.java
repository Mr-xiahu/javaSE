package com.xiahu.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * HashMap:是基于哈希表的Map接口实现。
 * 哈希表的作用是用来保证键的唯一性的。
 * 
 * HashMap<String,String>
 * 键：String
 * 值：String
 */
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<String,String>();
		
		//添加集合元素
		hm.put("10001", "诸葛亮");
		hm.put("10002", "刘玄德");
		hm.put("10003", "赵子龙");
		hm.put("10004", "黄汉升");
		hm.put("10005", "马超");
		hm.put("10005", "王朝");
		
		//遍历
		Set<Map.Entry<String, String>> set=hm.entrySet();
		for(Map.Entry<String, String> me:set){
			System.out.println(me.getKey()+"---"+me.getValue());
		}

	}
}
