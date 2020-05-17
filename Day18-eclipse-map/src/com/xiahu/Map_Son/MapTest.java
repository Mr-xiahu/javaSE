package com.xiahu.Map_Son;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 遍历Map数组
 */
public class MapTest {
	public static void main(String[] args) {
		// 创建集合对象
		Map<Integer, String> map = new HashMap<Integer, String>();

		// 添加集合元素
		map.put(1001, "夏虎");
		map.put(1002, "洞主");
		map.put(1003, "凯哥");
		map.put(1004, "余小C");
		
		//遍历集合
		//方式一
		Set<Integer> set=map.keySet();
		for(Integer i:set){
			String s=map.get(i);
			System.out.println(i+"---"+s);
		}
		
		System.out.println("------------");
		//方式二
		Set<Map.Entry<Integer, String>> set1=map.entrySet();
		for(Map.Entry<Integer, String> me:set1){
			System.out.println(me.getKey()+"----"+me.getValue());
		}
	}

}
