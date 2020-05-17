package com.xiahu.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Collections可以针对ArrayList存储基本包装类的元素排序，存储自定义对象可不可以排序呢?
 */
public class CollectionsDemo2 {
	public static void main(String[] args) {
		// 创建集合
		List<Student> list = new ArrayList<Student>();

		// 创建元素对象
		Student s1 = new Student("诸葛亮", 20);
		Student s2 = new Student("黄月英", 18);
		Student s3 = new Student("赵子龙", 18);
		Student s4 = new Student("张翼德", 25);
		Student s5 = new Student("诸葛亮", 20);

		// 添加元素对象
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		// 自然 排序
		// Collections.sort(list);
		// 比较器排序
		// 如果同时有自然排序和比较器排序，以比较器排序为主
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				// return 0;
				int num = s1.getAge() - s2.getAge();
				int num2 = num == 0 ? s1.getName().compareTo(s2.getName())
						: num;
				return num2;
			}
		});

		for (Student s : list) {
			System.out.println(s.getName() + "--" + s.getAge());
		}

	}
}
