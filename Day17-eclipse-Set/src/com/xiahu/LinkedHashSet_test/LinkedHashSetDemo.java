package com.xiahu.LinkedHashSet_test;

import java.util.LinkedHashSet;

/*
 * linkedHashSet:底层数据结构由哈希表和链表组成。
 * 哈希表保证元素的唯一性。
 * 链表保证元素有素。(存储和取出是一致)
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();

		// 添加集合元素
		lhs.add("hello");
		lhs.add("javaEE");
		lhs.add("world");

		// 遍历
		for (String s : lhs) {
			System.out.println(s);
		}
	}

}
