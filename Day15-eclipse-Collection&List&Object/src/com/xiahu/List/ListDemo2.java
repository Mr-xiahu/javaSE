package com.xiahu.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * List集合的特有功能：
 *   A:添加功能
 * 		void add(int index,Object element):在指定位置添加元素
 *   B:获取功能
 * 		Object get(int index):获取指定位置的元素
 *   C:列表迭代器
 * 		ListIterator listIterator()：List集合特有的迭代器
 *   D:删除功能
 * 		Object remove(int index)：根据索引删除元素,返回被删除的元素
 *   E:修改功能
 * 		Object set(int index,Object element):根据索引修改元素，返回被修饰的元素
 */
public class ListDemo2 {
	public static void main(String[] args) {
		// 创建List集合
		List list = new ArrayList();
		list.add("夏虎");
		list.add("帅气");
		iterator(list);
		System.out.println("----------");

		// void add(int index,Object element):在指定位置添加元素
		list.add(1, "真滴");
		iterator(list);

		// Object get(int index):获取指定位置的元素
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println("----------");

		// ListIterator listIterator()：List集合特有的迭代器
		ListIterator it = list.listIterator();
		System.out.println(list);

		// Object remove(int index)：根据索引删除元素,返回被删除的元素
		System.out.println(list.remove(0));
		System.out.println("----------");
		iterator(list);
		System.out.println("----------");

		// Object set(int index,Object element):根据索引修改元素，返回被修饰的元素
		System.out.println(list.set(0, "小脑斧"));
		System.out.println("----------");
		iterator(list);
	}

	public static void iterator(List list) {
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}

}
