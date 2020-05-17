package com.xiahu.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 需求：
 *假设HashMap集合的元素是ArrayList。有3个。
 *每一个ArrayList集合的值是字符串。
 *元素我已经完成，请遍历。
 *结果：
 *		 三国演义
 *		 	吕布
 *		 	周瑜
 *		 笑傲江湖
 *		 	令狐冲
 *		 	林平之
 *		 神雕侠侣
 *		 	郭靖
 *		 	杨过  
 */
public class HashMapIncludeArraylistDemo {
	public static void main(String[] args) {
		// 创建集合元素
		HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

		// 创建ArrayList集合
		ArrayList<String> array1 = new ArrayList<String>();
		ArrayList<String> array2 = new ArrayList<String>();
		ArrayList<String> array3 = new ArrayList<String>();

		// array1添加集合元素
		array1.add("吕布");
		array1.add("周瑜");

		// array2添加集合元素
		array2.add("令狐冲");
		array2.add("林平之");

		// array1添加集合元素
		array3.add("郭靖");
		array3.add("杨过");
		
		//HashMap添加元素对象那个
		hm.put("三国演义", array1);
		hm.put("笑傲江湖", array2);
		hm.put("神雕侠侣", array3);
		
		//遍历
		Set<Map.Entry<String, ArrayList<String>>> set=hm.entrySet();
		for(Map.Entry<String, ArrayList<String>> me:set){
			String ss=me.getKey();
			System.out.println(ss);
			ArrayList<String> array=me.getValue();
			for(String s:array){
				System.out.println("\t"+s);
			}
		}

	}

}
