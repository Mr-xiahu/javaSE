package com.xiahu.Generic;

import java.util.ArrayList;
import java.util.Iterator;

import com.xiahu.ArrayList.Student;

/*
 * 
 * 需求：存储自定义对象并遍历。
 * 
 * A:创建学生类
 * B:创建集合对象
 * C:创建元素对象
 * D:把元素添加到集合
 * E:遍历集合
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		// JDK7的新特性：泛型推断。
		// ArrayList<Student> array = new ArrayList<>();
		// 但是我不建议这样使用。
		ArrayList<Student> array=new ArrayList<Student>();
		
		//创建学生对象
		Student s1=new Student("诸葛亮", 28);
		Student s2=new Student("徐庶", 29);
		Student s3=new Student("曹操", 56);
		
		//添加集合对象
		array.add(s1);
		array.add(s2);
		array.add(s3);
		
		//遍历
		Iterator<Student> it=array.iterator();
		while(it.hasNext()){
			Student s=it.next();
			System.out.println(s.getName()+"--"+s.getAge());
		}
		System.out.println("------------");
		
		for(int x=0;x<array.size();x++){
			Student ss=array.get(x);
			System.out.println(ss.getName()+"--"+ss.getAge());
		}
	}

}
