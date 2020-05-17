package com.xiahu.Test;

import java.util.HashSet;
import java.util.Random;

/*
 * 编写一个程序，获取10个1至20的随机数，要求随机数不能重复。
 * 
 * 分析：
 * 		A:创建随机数对象
 * 		B:创建一个HashSet集合
 * 		C:判断集合的长度是不是小于10
 * 			是：就创建一个随机数添加
 * 			否：不搭理它
 * 		D:遍历HashSet集合
 */
public class HashSetTest {
	public static void main(String[] args) {
		// A:创建随机数对象
		Random r = new Random();

		// B:创建一个HashSet集合
		HashSet<Integer> hs = new HashSet<Integer>();

		// C:判断集合的长度是不是小于10
		while (hs.size() < 10) {
			int num = r.nextInt(20) + 1;
			hs.add(num);
		}

		for (Integer i : hs) {
			System.out.println(i);
		}
	}

}
