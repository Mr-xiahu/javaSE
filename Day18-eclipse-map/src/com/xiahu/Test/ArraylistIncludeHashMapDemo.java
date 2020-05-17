package com.xiahu.Test;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * 
 *  ArrayList集合嵌套HashMap集合并遍历。
 需求：
 假设ArrayList集合的元素是HashMap。有3个。
 每一个HashMap集合的键和值都是字符串。
 元素我已经完成，请遍历。
 结果：
 周瑜---小乔
 吕布---貂蝉

 郭靖---黄蓉
 杨过---小龙女

 令狐冲---任盈盈
 林平之---岳灵珊
 */
public class ArraylistIncludeHashMapDemo {
	public static void main(String[] args) {
		ArrayList<HashMap<String, String>> array=new ArrayList<HashMap<String,String>>();
		
		//创建HashMap集合
		HashMap<String, String> hm=new HashMap<String, String>();
		
		hm.put("周瑜", "小乔");
		hm.put("吕布", "貂蝉");
		hm.put("郭靖", "黄蓉");
		hm.put("杨过", "小龙女");
		hm.put("令狐冲", "任盈盈");
		hm.put("林平之", "岳灵珊");
		
		//
		array.add(hm);
		for(HashMap<String, String> s:array){
			System.out.println(s);
		}
	}

}
