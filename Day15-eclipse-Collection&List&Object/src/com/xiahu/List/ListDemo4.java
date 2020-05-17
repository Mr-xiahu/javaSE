package com.xiahu.List;

import java.util.ArrayList;
import java.util.List;

import com.xiahu.Collection.CollectionStudent;

/*
 * 存储自定义对象并遍历,用普通for循环。(size()和get()结合)
 */
public class ListDemo4 {
	public static void main(String[] args) {
		// 创建List集合
		List list = new ArrayList();

		// 创建学生对象
		CollectionStudent s1 = new CollectionStudent("诸葛亮", 18);
		CollectionStudent s2 = new CollectionStudent("刘备", 28);
		CollectionStudent s3 = new CollectionStudent("子龙", 16);
		CollectionStudent s4 = new CollectionStudent("翼德", 38);
		CollectionStudent s5 = new CollectionStudent("奉先", 48);

		// 添加集合对象
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		// 用普通for循环。(size()和get(
		for (int x = 0; x < list.size(); x++) {
			CollectionStudent s = (CollectionStudent) list.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}

	}

}
