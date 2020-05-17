package com.xiahu;

/*
 * brank与continue的区别
 */
public class ContinueDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;//不在执行后续语句，直接执行下一次循环
				//break;//直接跳出循环
			}
			System.out.println(i);

		}
	}

}
