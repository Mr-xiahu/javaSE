package com.xiahu.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 *  HashMap嵌套HashMap
 * 
 * 传智播客
 * 		jc	基础班
 * 				陈玉楼		20
 * 				高跃		22
 * 		jy	就业班
 * 				李杰		21
 * 				曹石磊		23
 */
public class HashMapDemo {
	public static void main(String[] args) {
		// 创建传智播客HashMap
		HashMap<String, Map<String, Integer>> czbomap = new HashMap<String, Map<String, Integer>>();

		// 创建基础班HashMap
		HashMap<String, Integer> jc = new HashMap<String, Integer>();

		// 添加基础班元素对象
		jc.put("陈玉楼", 20);
		jc.put("高跃", 22);

		// 创建就业班HashMap
		HashMap<String, Integer> jy = new HashMap<String, Integer>();

		// 添加基础班元素对象
		jy.put("李杰", 21);
		jy.put("曹石磊", 23);
		
		//传智播客HashMap添加集合对象
		czbomap.put("jc", jc);
		czbomap.put("jy", jy);
		
		//遍历
		Set<Map.Entry<String, Map<String, Integer>>> set= czbomap.entrySet();
		for(Map.Entry<String, Map<String, Integer>> me:set){
			String key=me.getKey();
			HashMap<String, Integer> hs=(HashMap<String, Integer>) me.getValue();
			Set<Map.Entry<String, Integer>> set1=hs.entrySet();
			for(Map.Entry<String, Integer> me1:set1){
				String name=me1.getKey();
				Integer age=me1.getValue();
				System.out.println("班级:"+key+"\t姓名:"+name+"     年龄:"+age);
			}
			
		}
	}

}
