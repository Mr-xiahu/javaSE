package com.xiahu.Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import com.xiahu.ArrayList.Student;

/*
 * ArrayList存储自定义对象并遍历
 */
public class VectorTest2 {
	public static void main(String[] args) {
		// 创建Vector集合
		Vector v = new Vector();

		// 创建学生对象
		Student s1 = new Student("宋江", 28);
		Student s2 = new Student("林冲", 42);
		Student s3 = new Student("花荣", 16);
		Student s4 = new Student("柴进", 24);

		// 将学生对象加入集合
		v.add(s1);
		v.add(s2);
		v.add(s3);
		v.add(s4);

		// 遍历集合
		// Iterator方式
		Iterator it = v.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
		System.out.println("---------");

		// for遍历
		for (int x = 0; x < v.size(); x++) {
			Student ss = (Student) v.get(x);
			System.out.println(ss.getName() + "---" + ss.getAge());
		}
		System.out.println("-----");
		
		
		////用Enumeration
		Enumeration en=v.elements();
		while(en.hasMoreElements()){
			Student sss=(Student)en.nextElement();
			System.out.println(sss.getName()+"---"+sss.getAge());
		}
		System.out.println("--------");
	}

}
