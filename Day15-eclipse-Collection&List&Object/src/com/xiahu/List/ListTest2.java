package com.xiahu.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xiahu.Collection.CollectionStudent;

public class ListTest2 {
	public static void main(String[] args) {
		// 创建List集合对象
		List list = new ArrayList();
		
		// C:创建学生对象
		CollectionStudent s1 = new CollectionStudent("诸葛亮", 18);
		CollectionStudent s2 = new CollectionStudent("刘备", 28);
		CollectionStudent s3 = new CollectionStudent("子龙", 16);
		CollectionStudent s4 = new CollectionStudent("翼德", 38);
		CollectionStudent s5 = new CollectionStudent("奉先", 48);
		
	    //添加集合对象
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		//用迭代器遍历集合
		Iterator it=list.iterator();
		while(it.hasNext()){
			CollectionStudent s=(CollectionStudent)it.next();
			System.out.println(s.getName()+"---"+s.getAge());
		}
		 
	}

}
