package com.xiahu.IO_Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;


/*
 * 需求：我有一个文本文件中存储了几个名称，请大家写一个程序实现随机获取一个人的名字。
 * 
 * 分析：
 * 		A:把文本文件中的数据存储到集合中
 * 		B:随机产生一个索引
 * 		C:根据该索引获取一个值
 */
public class C_c_GetName {
	public static void main(String[] args) throws IOException {
		// 创建Map集合
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		// 读取文本中的内容
		BufferedReader br = new BufferedReader(new FileReader("br.txt"));
		String line = null;
		int index = 0;
		while ((line = br.readLine()) != null) {
			map.put(index, line);
			index++;
		}

		br.close();

		// //遍历map集合
		// Set<Map.Entry<Integer, String>> set=map.entrySet();
		// for(Map.Entry<Integer, String> mm:set){
		// Integer id=mm.getKey();
		// String name=mm.getValue();
		// System.out.println(id+"---"+name);
		// }

		// 随机产生一个索引
		Random r = new Random();
		int num = r.nextInt(map.size());

		// 根据该索引获取一个值
		String name = map.get(num);
		System.out.println("该幸运者是：" + name);
	}

}
