package com.xiahu.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * List集合的特点:
 *      有序的，可重复的
 */
public class ListTest {
	public static void main(String[] args) {
		//创建List集合对象
		List list=new ArrayList();
		list.add("java");
		list.add("love");
		list.add("javaEE");
		list.add("love");
		list.add("javaEE");
		
		//遍历集合
		Iterator it=list.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			System.out.println(s);
		}
	}

}
