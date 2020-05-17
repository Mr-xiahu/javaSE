package com.xiahu.LinkedList;

import java.util.LinkedList;

/*
 * LinkedList的特有功能：
 * 		A:添加功能
 * 			public void addFirst(Object e)
 * 			public void addLast(Object e)
 * 		B:获取功能
 * 			public Object getFirst()
 * 			public Obejct getLast()
 * 		C:删除功能
 * 			public Object removeFirst()
 * 			public Object removeLast()
 */
public class LinkListDemo {
	public static void main(String[] args) {
		//创建集合对象
		LinkedList link=new LinkedList();
		
		//添加集合元素
		link.add("hello");
		link.add("java");
		link.add("javaEE");
				
		//输出集合
		System.out.println(link);
		System.out.println("---------");
		
		//public void addFirst(Object e)
		link.addFirst("夏虎");
		System.out.println(link);
		System.out.println("---------");
		
		//public void addLast(Object e)
		link.addLast("张无忌");
		System.out.println(link);
		System.out.println("---------");
		
		//public Object getFirst()
		Object obj1=link.getFirst();
		System.out.println(obj1);
		System.out.println("---------");
		
		//public Obejct getLast()
		Object obj2=link.getLast();
		System.out.println(obj2);
		System.out.println("---------");
		
		//public Object removeFirst()
		Object obj3=link.removeFirst();
		System.out.println(obj3);
		System.out.println("---------");
		
		//public Object removeLast()
		Object obj4=link.removeLast();
		System.out.println(obj4);
		System.out.println("---------");
		
		// 输出集合
		System.out.println(link);
		System.out.println("---------");
		
	}

}
