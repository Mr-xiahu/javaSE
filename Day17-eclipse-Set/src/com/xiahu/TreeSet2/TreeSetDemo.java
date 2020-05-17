package com.xiahu.TreeSet2;

import java.util.Comparator;
import java.util.TreeSet;
/*
 *  TreeSet集合保证元素排序和唯一性的原理
 *  唯一性：是根据比较的返回是否是0来决定。
 *  排序：
 * 		A:自然排序(元素具备比较性)
 * 			让元素所属的类实现自然排序接口 Comparable
 * 		B:比较器排序(集合具备比较性)
 * 			让集合的构造方法接收一个比较器接口的子类对象 Comparator
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		// 创建集合对象
//		TreeSet<Student> ts = new TreeSet<Student>();//自然排序
		// public TreeSet(Comparator comparator) //比较器排序
		TreeSet<Student> ts=new TreeSet<Student>(new MyComparator());
		

		// 添加元素对象
		Student s1 = new Student("诸葛亮1", 28);
		Student s2 = new Student("刘玄德12", 40);
		Student s3 = new Student("关云长4654", 35);
		Student s4 = new Student("张翼德134654231", 30);
		Student s5 = new Student("关云长22235", 35);
		Student s6 = new Student("关云长1", 40);

		// 添加到集合
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);

		// 遍历
		for (Student s : ts) {
			System.out.println(s.getName() + "---" + s.getAge());
		}

	}

}
