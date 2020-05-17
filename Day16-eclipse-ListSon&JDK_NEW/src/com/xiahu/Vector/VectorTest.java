package com.xiahu.Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
 * 存储字符块并遍历
 */
public class VectorTest {
	public static void main(String[] args) {
		//创建Vector集合
		Vector v=new Vector();
		
		//添加集合对象
		v.addElement("hello");
		v.addElement("java");
		v.addElement("javaEE");
		
		//遍历集合
		// Iterator方式遍历
		Iterator it = v.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}

		System.out.println("--------");
		
		//用Enumeration
		Enumeration en=v.elements();
		while(en.hasMoreElements()){
			String ss=(String)en.nextElement();
			System.out.println(ss);
		}
		System.out.println("--------");
		

		// 用for循环

		for (int x = 0; x < v.size(); x++) {
			String ss = (String) v.elementAt(x);
			System.out.println(ss);
		}
	}

}
