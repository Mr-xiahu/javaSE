package com.xiahu.JDK5News;

import java.util.ArrayList;
import java.util.List;

import com.xiahu.ArrayList.Student;

/*
 * 需求：ArrayList存储自定义对象并遍历。要求加入泛型，并用增强for遍历。
 * A:迭代器
 * B:普通for
 * C:增强for
 * 
 * LinkedList,Vector,Colleciton,List等存储我还讲吗?不讲解了，但是要求你们练习。
 * 
 * 增强for是用来替迭代器。
 */
public class ForTest {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		
		Student s1=new Student("黄汉升", 59);
		Student s2=new Student("曹孟德", 46);
		Student s3=new Student("张翼德", 34);
		Student s4=new Student("赵子龙", 22);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		for(Student s:list){
			System.out.println(s.getName()+"--"+s.getAge());
		}
	}

}
