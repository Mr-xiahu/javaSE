package com.xiahu.JDK5News;

import java.util.ArrayList;

/*
 * JDK5的新特性：自动拆装箱,泛型,增强for,静态导入,可变参数,枚举
 * 
 * 增强for:是for循环的一种。
 * 
 * 格式：
 * 		for(元素数据类型 变量 : 数组或者Collection集合) {
 *			使用变量即可，该变量就是元素
 *   	}
 *   
 * 好处：简化了数组和集合的遍历。
 * 
 * 弊端： 增强for的目标不能为null。
 * 如何解决呢?对增强for的目标先进行不为null的判断，然后在使用。
 */
public class ForDemo {
	public static void main(String[] args) {
		int[] i={1,2,3,4,5};
		for(int x=0;x<i.length;x++){
			System.out.println(i[x]);
		}
		System.out.println("--------");
		
		//增强For()
		for(int s:i){
			System.out.println(s);
		}
		System.out.println("--------");
		
		String[] name={"诸葛亮","赵子龙","张翼德","吕奉先"};
		//增强For()
		for(String s:name){
			System.out.println(s);
		}
		System.out.println("-------");
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("关云长");
		al.add("黄汉升");
		al.add("曹孟德");
		for(String s:al){
			System.out.println(s);
		}
	}

}
