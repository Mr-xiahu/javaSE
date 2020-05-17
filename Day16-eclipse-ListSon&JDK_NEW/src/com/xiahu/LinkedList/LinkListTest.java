package com.xiahu.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * 存储字符块并遍历
 */
public class LinkListTest {
	public static void main(String[] args) {
		LinkedList link=new LinkedList();
		
		// 添加集合元素
		link.add("hello");
		link.add("java");
		link.add("javaEE");
		
		//遍历集合
		//Iterator
		Iterator it=link.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			System.out.println(s);
		}
		System.out.println("-----");
		
		//for
		for(int x=0;x<link.size();x++){
			String s=(String)link.get(x);
			System.out.println(s);
		}
	}

}
