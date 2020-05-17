package com.xiahu.Test;

import java.util.ArrayList;

import com.xiahu.ArrayList.Student;

/*
 * 集合的嵌套遍历
 * 需求：
 * 		我们班有学生，每一个学生是不是一个对象。所以我们可以使用一个集合表示我们班级的学生。ArrayList<Student>
 * 		但是呢，我们旁边是不是还有班级，每个班级是不是也是一个ArrayList<Student>。
 * 		而我现在有多个ArrayList<Student>。也要用集合存储，怎么办呢?
 * 		就是这个样子的：ArrayList<ArrayList<Student>>
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//创建大集合
		ArrayList<ArrayList<Student>> al=new ArrayList<ArrayList<Student>>();
		
		Student s1=new Student("唐僧", 30);
		Student s2=new Student("孙悟空", 28);
		Student s3=new Student("猪八戒", 27);
		Student s4=new Student("沙和尚", 26);
		Student s5=new Student("白龙马", 24);
		Student s6=new Student("诸葛亮", 23);
		Student s7=new Student("司马懿", 22);
		Student s8=new Student("周瑜", 21);
		Student s9=new Student("宋江", 20);
		Student s10=new Student("林冲", 19);
		Student s11=new Student("李师师", 22);
		Student s12=new Student("高俅", 26);
		//创建小集合
		ArrayList<Student> al1=new ArrayList<Student>();
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		al1.add(s4);
		al1.add(s5);
		
		ArrayList<Student> al2=new ArrayList<Student>();
		al2.add(s6);
		al2.add(s7);
		al2.add(s8);
		
		ArrayList<Student> al3=new ArrayList<Student>();
		al3.add(s9);
		al3.add(s10);
		al3.add(s11);
		al3.add(s12);
		
		al.add(al1);
		al.add(al2);
		al.add(al3);
		
		for(ArrayList<Student> array:al ){
			for(Student s:array){
				System.out.println(s.getName()+"--"+s.getAge());
			}
			
		}
	}

}
