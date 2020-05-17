package com.xiahu.BigDecimal;

/**
 * @author Administrator
 *  由于在运算的时候，float类型和double很容易丢失精度，演示案例。
 *  所以，为了能精确的表示、计算浮点数，Java提供了BigDecimal
 * 
 * BigDecimal类：不可变的、任意精度的有符号十进制数,可以解决数据丢失问题。
 */
public class BigDecimalDemo {
	public static void main(String[] args) {
		System.out.println(0.09 + 0.01);
		System.out.println(1.0 - 0.32);
		System.out.println(1.015 * 100);
		System.out.println(1.301 / 100);

		System.out.println(1.0 - 0.12);//偶然碰到的
	}

}
