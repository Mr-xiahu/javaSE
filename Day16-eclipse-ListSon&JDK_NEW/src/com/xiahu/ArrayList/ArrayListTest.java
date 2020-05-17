package com.xiahu.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList存储自定义对象并遍历
 */
public class ArrayListTest {
	public static void main(String[] args) {
		//创建ArrayList集合
		ArrayList al=new ArrayList();
		
		// 创建学生对象
		Student s1=new Student("宋江", 28);
		Student s2=new Student("林冲", 42);
		Student s3=new Student("花荣", 16);
		Student s4=new Student("柴进", 24);
		
		//将学生对象加入集合
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		//遍历集合
		//Iterator方式
		Iterator it=al.iterator();
		while(it.hasNext()){
			Student s=(Student)it.next();
			System.out.println(s.getName()+"---"+s.getAge());
		}
		System.out.println("---------");
		
		//for遍历
		for(int x=0;x<al.size();x++){
			Student ss=(Student)al.get(x);
			System.out.println(ss.getName()+"---"+ss.getAge());
		}
	}

}
