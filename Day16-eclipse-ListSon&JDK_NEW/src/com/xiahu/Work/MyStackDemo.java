package com.xiahu.Work;

public class MyStackDemo {
	public static void main(String[] args) {
		//创建集合对象
		MyStack ms=new MyStack();
		
		//添加元素
		ms.add("夏虎");
		ms.add("LOVE");
		ms.add("火箭队");
		
		//输出
//		System.out.println(ms.get());
//		System.out.println(ms.get());
//		System.out.println(ms.get());
		while(!ms.isEmply()){
			System.out.println(ms.get());
		}
	}

}
