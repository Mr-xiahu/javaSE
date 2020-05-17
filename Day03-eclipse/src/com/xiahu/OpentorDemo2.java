package com.xiahu;

public class OpentorDemo2 {
	public static void main(String[] args) {
		// 定义两个变量
		int x = 3;
		int y = 4;

		// 字符串的拼接
		// System.out.println("x:"+x);
		// System.out.println("y:"+y);

		System.out.println("x:" + x + ",y:" + y);

		x++;// 4
		y--;// 3
		// System.out.println(x);
		System.out.println("x:" + x + ",y:" + y);

		// 单独使用
		// x++;
		// y--;
		++x;/// 5
		--y;// 2
		// System.out.println(x);
		System.out.println("x:" + x + ",y:" + y);

		// 意外的类型,常量是不可以这样做的
		// System.out.println(10++);

		System.out.println("-------------------");
		// 参与运算使用
		int a = 3;
		int b = 4;

		// int c = a++;
		// int d = b--;

		int c = ++a;
		int d = --b;

		System.out.println("a:" + a); // 4, 4
		System.out.println("b:" + b); // 3, 3
		System.out.println("c:" + c); // 3, 4
		System.out.println("d:" + d); // 4, 3
	}
}
