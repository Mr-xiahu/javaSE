package com.xiahu.Map_Son;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map集合的遍历。
 * Map -- 夫妻对
 * 
 * 思路：
 * 		A:获取所有结婚证的集合
 * 		B:遍历结婚证的集合，得到每一个结婚证
 * 		C:根据结婚证获取丈夫和妻子
 * 
 * 转换：
 * 		A:获取所有键值对对象的集合
 * 		B:遍历键值对对象的集合，得到每一个键值对对象
 * 		C:根据键值对对象获取键和值
 * 
 * 这里面最麻烦的就是键值对对象如何表示呢?
 * 看看我们开始的一个方法：
 * 		Set<Map.Entry<K,V>> entrySet()：返回的是键值对对象的集合
 */
public class MapDemo4 {
	public static void main(String[] args) {
		// 创建集合对象
		Map<String, String> map = new HashMap<String, String>();

		// 添加集合元素
		map.put("周杰伦", "昆凌");
		map.put("黄晓明", "杨颖");
		map.put("刘恺威", "杨幂");
		map.put("文章", "马伊琍");
		
		//获取所有键值对对象的集合
		//Set<Map.Entry<K,V>> entrySet()：返回的是键值对对象的集合
		Set<Map.Entry<String, String>> set=map.entrySet();
		//遍历键值对对象的集合，得到每一个键值对对象
		for(Map.Entry<String, String> me:set){
			//根据键值对对象获取键和值
			System.out.println(me.getKey()+"---"+me.getValue());
		}
	}

}
