package com.xiahu.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 练习：用集合存储5个学生对象，并把学生对象进行遍历。用迭代器遍历。
 * 
 * 问题1:能用while循环写这个程序，我能不能用for循环呢?
 * 问题2:不要多次使用it.next()方法，因为每次使用都是访问一个对象。
 */
public class CollectionIteratorTest {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();

		// C:创建学生对象
		CollectionStudent s1 = new CollectionStudent("东方不败", 15);
		CollectionStudent s2 = new CollectionStudent("任盈盈", 26);
		CollectionStudent s3 = new CollectionStudent("杨幂", 37);
		CollectionStudent s4 = new CollectionStudent("风清扬", 48);
		CollectionStudent s5 = new CollectionStudent("令狐冲", 59);

		// 将学生对象添加到集合
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);

		// 创建迭代器
		Iterator it = c.iterator();

		// 开始遍历
		while (it.hasNext()) {
			CollectionStudent s = (CollectionStudent) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
			// NoSuchElementException 不要多次使用it.next()方法
			// System.out.println(((Student) it.next()).getName() + "---"
			// + ((Student) it.next()).getAge());
		}
		// System.out.println("----------------------------------");


	}

}
