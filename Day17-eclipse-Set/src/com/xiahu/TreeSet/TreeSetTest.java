package com.xiahu.TreeSet;

import java.util.TreeSet;

/*
 * 需求：请按照姓名的长度排序
 */
public class TreeSetTest {
	public static void main(String[] args) {
		// 创建几个元素
		TreeSet<Teacher> ts = new TreeSet<Teacher>();
		
		//创建集合对象
		Teacher t1=new Teacher("zhugeliang", 29);
		Teacher t2=new Teacher("liuxuande", 45);
		Teacher t3=new Teacher("zhaozilong", 20);
		Teacher t4=new Teacher("caocao", 40);
		Teacher t5=new Teacher("zhugelianh", 29);
		Teacher t6=new Teacher("zhugelianh", 30);
		
		//添加集合元素
		ts.add(t1);
		ts.add(t2);
		ts.add(t3);
		ts.add(t4);
		ts.add(t5);
		ts.add(t6);
		
		//遍历
		for(Teacher t:ts){
			System.out.println(t.getName()+"--"+t.getAge());
		}
	}

}
