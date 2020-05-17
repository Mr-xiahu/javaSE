package com.xiahu.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 
 * 集合的遍历。其实就是依次获取集合中的每一个元素。
 * 
 * Object[] toArray():把集合转成数组，可以实现集合的遍历
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		//创建集合
		Collection c=new ArrayList();
		c.add("hello");
		c.add("world");
		
		//把集合转成数组
		Object[] obj=c.toArray();
		
		//遍历集合
		for(int x=0;x<obj.length;x++){
			System.out.println(obj[x]);
			System.out.println(obj[x].toString().length());
			// 我知道元素是字符串，我在获取到元素的的同时，还想知道元素的长度。
			// System.out.println(objs[x] + "---" + objs[x].length());
			// 上面的实现不了，原因是Object中没有length()方法
			// 我们要想使用字符串的方法，就必须把元素还原成字符串
			// 向下转型
			String s = (String) obj[x];
			System.out.println(s + "---" + s.length());
		}
	}

}
