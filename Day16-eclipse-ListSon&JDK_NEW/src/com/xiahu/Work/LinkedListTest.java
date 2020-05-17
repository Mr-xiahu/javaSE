package com.xiahu.Work;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * 请用LinkedList模拟栈数据结构的集合，并测试
 *题目的意思是：
 *		你自己的定义一个集合类，在这个集合类内部可以使用LinkedList模拟。
 */
public class LinkedListTest {
	public static void main(String[] args) {
		//创建集合对象
		LinkedList ll=new LinkedList();
		
		//添加集合对象
		ll.addFirst("hello");
		ll.addFirst("java");
		ll.addFirst("javaEE");
		
		//遍历
		Iterator it=ll.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			System.out.println(s);
		}
		
	}

}
