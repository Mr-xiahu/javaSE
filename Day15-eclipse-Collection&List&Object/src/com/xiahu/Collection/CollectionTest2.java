package com.xiahu.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 需求：存储自定义对象并遍历Student(name,age)
 *
 * 分析：
 * 		A:创建学生类
 * 		B:创建集合对象
 * 		C:创建学生对象
 * 		D:把学生对象添加到集合对象中
 * 		E:遍历集合
 */
public class CollectionTest2 {
	public static void main(String[] args) {
		// B:创建集合对象
		Collection c = new ArrayList();

		// C:创建学生对象
		CollectionStudent s1 = new CollectionStudent("诸葛亮", 18);
		CollectionStudent s2 = new CollectionStudent("刘备", 28);
		CollectionStudent s3 = new CollectionStudent("子龙", 16);
		CollectionStudent s4 = new CollectionStudent("翼德", 38);
		CollectionStudent s5 = new CollectionStudent("奉先", 48);

		// D:把学生对象添加到集合对象中
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);

		
		// E:遍历集合

		Iterator it = c.iterator();
		while (it.hasNext()) {
			CollectionStudent s = (CollectionStudent) it.next();

		}
	}

}
