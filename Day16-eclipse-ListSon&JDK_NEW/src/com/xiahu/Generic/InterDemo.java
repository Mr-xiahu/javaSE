package com.xiahu.Generic;
/*
 * 测试类
 */
public class InterDemo {
	public static void main(String[] args) {
//		//第一种情况测试   知道该类是什么类型
//		Inter<String> i = new InterImpl();
//		i.show("hello");
		
		//第二种情况
		Inter<Integer> i=new InterImpl();
		i.show(100);
		
		Inter<String> ii=new InterImpl();
		ii.show("hello");
		
	}

}
