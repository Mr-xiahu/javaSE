package com.xiahu.Map_Son;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map集合的遍历。
 * Map -- 夫妻对
 * 思路：
 * 		A:把所有的丈夫给集中起来。
 * 		B:遍历丈夫的集合，获取得到每一个丈夫。
 * 		C:让丈夫去找自己的妻子。
 * 
 * 转换：
 * 		A:获取所有的键
 * 		B:遍历键的集合，获取得到每一个键
 * 		C:根据键去找值
 */
public class MapDemo3 {
	public static void main(String[] args) {
		//创建集合对象
		Map<String, String> map=new HashMap<String, String>();
		
		//添加集合元素
		map.put("周杰伦", "昆凌");
		map.put("黄晓明", "杨颖");
		map.put("刘恺威", "杨幂");
		map.put("文章", "马伊琍");
		
		//A:获取所有的键
		Set<String> set=map.keySet();
		for(String s:set){
			
			String c=map.get(s);
			System.out.println(s+"--"+c);
		}
	}

}
