package com.xiahu.Collection;

import java.util.ArrayList;
import java.util.Collection;



/*
 * 练习：用集合存储5个学生对象，并把学生对象进行遍历。
 * 
 * 分析：
 * A:创建学生类
 * B:创建集合对象
 * C:创建学生对象
 * D:把学生添加到集合
 * E:把集合转成数组
 * F:遍历数组
 * 
 */
public class CollectionTest {
	public static void main(String[] args) {
		// B:创建集合对象
		Collection c = new ArrayList();

		// C:创建学生对象
		CollectionStudent s1 = new CollectionStudent("东方不败", 15);
		CollectionStudent s2 = new CollectionStudent("任盈盈", 26);
		CollectionStudent s3 = new CollectionStudent("杨幂", 37);
		CollectionStudent s4 = new CollectionStudent("风清扬", 48);
		CollectionStudent s5 = new CollectionStudent("令狐冲", 59);

		// D:把学生添加到集合
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		for (Object object : c) {
			System.out.println(c.toString());
		}

		// E:把集合转成数组
		Object[] obj = c.toArray();

		// F:遍历数组
		for (int x = 0; x < obj.length; x++) {
			CollectionStudent s = (CollectionStudent) obj[x];
			System.out.println(s.getName() + "--" + s.getName());
//			System.out.println(obj[x].toString());
		}
	

	}

}
