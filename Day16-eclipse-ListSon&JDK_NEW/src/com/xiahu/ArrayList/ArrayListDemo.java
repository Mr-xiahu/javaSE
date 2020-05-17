package com.xiahu.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * List的子类特点:
 *     ArrayList:
 *         底层数据是数组,查询快，增删慢
 *         线程不安全，效率高
 *     Vector:
 *         底层数据是数组，查询快，增删慢
 *         线程安全，效率低
 *     LinkedList:
 *         底层数据是链表，查询慢，增删快
 *         线程不安全，效率高
 *         
 * ArrayList的使用：
 *     存储字符块并遍历
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//创建ArrayList集合
		ArrayList al=new ArrayList();
		
		//添加集合对象
		al.add("hello");
		al.add("java");
		al.add("javaEE");
		
		//遍历集合
		//Iterator方式遍历
		Iterator it=al.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			System.out.println(s);
		}
		
		System.out.println("--------");
		
		//用for循环
		
		for(int x=0;x<al.size();x++){
			String ss=(String)al.get(x);
			System.out.println(ss);
		}
	}

}
