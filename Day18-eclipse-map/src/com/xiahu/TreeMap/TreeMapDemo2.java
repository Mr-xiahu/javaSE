package com.xiahu.TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.xiahu.HashMap.Student;

/*
 *  TreeMap<Student,String>
 * 键:Student
 * 值：String
 */
public class TreeMapDemo2 {
	public static void main(String[] args) {
		TreeMap<Student, String> tm = new TreeMap<Student, String>(
				new Comparator<Student>() {

					@Override
					public int compare(Student s1, Student s2) {
						// return 0;
						int num = s1.getAge() - s2.getAge();
						int num2 = num == 0 ? s1.getName().compareTo(
								s2.getName()) : num;
						return num2;
					}
				});

		Student s1 = new Student("刘德华", 30);
		Student s2 = new Student("张学友", 31);
		Student s3 = new Student("郭富城", 30);
		Student s4 = new Student("黎明", 19);
		Student s5 = new Student("成龙", 60);

		tm.put(s1, "优秀");
		tm.put(s2, "良好");
		tm.put(s3, "不行");
		tm.put(s4, "Low");
		tm.put(s5, "还行");

		Set<Map.Entry<Student, String>> set = tm.entrySet();
		for (Map.Entry<Student, String> me : set) {
			String name=me.getKey().getName();
			int age=me.getKey().getAge();
			System.out.println(name+"---"+age + "---" + me.getValue());
		}
	}

}
