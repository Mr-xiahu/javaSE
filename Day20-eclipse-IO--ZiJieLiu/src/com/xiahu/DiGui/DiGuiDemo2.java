package com.xiahu.DiGui;

/*
 * 需求：请用代码实现求5的阶乘。
 * 下面的知识要知道：
 * 		5! = 1*2*3*4*5
 * 		5! = 5*4!
 * 
 * 有几种方案实现呢?
 * 		A:循环实现
 * 		B:递归实现
 * 			a:做递归要写一个方法
 * 			b:出口条件
 * 			c:规律
 */
public class DiGuiDemo2 {
	public static void main(String[] args) {
		int jc = 1;
		for (int x = 2; x <= 5; x++) {
			jc = jc * x;
		}
		System.out.println(jc);
		System.out.println("------------");
		int s = diGui(9);
		System.out.println(s);

	}

	public static int diGui(int num) {
		if (num == 1) {
			return num;
		} else {
			return num * diGui(num - 1);
		}

	}

}
