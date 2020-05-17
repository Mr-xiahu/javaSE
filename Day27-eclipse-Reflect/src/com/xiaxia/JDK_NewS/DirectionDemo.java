package com.xiaxia.JDK_NewS;

public class DirectionDemo {
	public static void main(String[] args) {
		// 枚举类第一版
		Direction d = Direction.FRONT;
		System.out.println(d);// com.xiaxia.JDK_NewS.Direction@4a6a00ca
		System.out.println("-------------");

		// 枚举类第二版
		Direction2 d2 = Direction2.FRONT;
		System.out.println(d2);// com.xiaxia.JDK_NewS.Direction2@36db4bcf
		System.out.println(d2.getName());// 前
		System.out.println("---------------");

		// 枚举类第三版
		Direction3 d3 = Direction3.FRONT;
		System.out.println(d3);// com.xiaxia.JDK_NewS.Direction3$1@3953c9c7
		System.out.println(d3.getName());// 前
		d3.show();// 向前看
	}

}
