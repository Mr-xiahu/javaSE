package com.xiaxia.JDK_NewS;

public class DirectionDemo {
	public static void main(String[] args) {
		// ö�����һ��
		Direction d = Direction.FRONT;
		System.out.println(d);// com.xiaxia.JDK_NewS.Direction@4a6a00ca
		System.out.println("-------------");

		// ö����ڶ���
		Direction2 d2 = Direction2.FRONT;
		System.out.println(d2);// com.xiaxia.JDK_NewS.Direction2@36db4bcf
		System.out.println(d2.getName());// ǰ
		System.out.println("---------------");

		// ö���������
		Direction3 d3 = Direction3.FRONT;
		System.out.println(d3);// com.xiaxia.JDK_NewS.Direction3$1@3953c9c7
		System.out.println(d3.getName());// ǰ
		d3.show();// ��ǰ��
	}

}
