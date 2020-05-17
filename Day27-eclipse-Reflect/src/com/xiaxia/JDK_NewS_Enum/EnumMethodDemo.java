package com.xiaxia.JDK_NewS_Enum;

/*
 * 
 * 
 */
public class EnumMethodDemo {
	public static void main(String[] args) {
		Direction3 d1 = Direction3.FRONT;
		Direction3 d2 = Direction3.BEHING;
		Direction3 d3 = Direction3.LEFT;
		Direction3 d4 = Direction3.RIGHT;
		// int compareTo(E o)
		System.out.println(d1.compareTo(d1));// 0
		System.out.println(d1.compareTo(d4));// -3
		System.out.println(d4.compareTo(d1));// 3
		System.out.println("-------------------");

		// String name()
		System.out.println(d1.name());// FRONT
		System.out.println(d2.name());// BEHING
		System.out.println(d3.name());// LEFT
		System.out.println(d4.name());// RIGHT
		System.out.println("-------------------");

		// int ordinal()
		System.out.println(d1.ordinal());// 0
		System.out.println(d2.ordinal());// 1
		System.out.println(d3.ordinal());// 2
		System.out.println(d4.ordinal());// 3
		System.out.println("-------------------");

		// String toString()
		System.out.println(d1.toString());// FRONT
		System.out.println(d2.toString());// BEHING
		System.out.println(d3.toString());// LEFT
		System.out.println(d4.toString());// RIGHT
		System.out.println("-------------------");

		// <T> T valueOf(Class<T> type,String name)
		Direction3 d = Enum.valueOf(Direction3.class, "FRONT");
		System.out.println(d);// FRONT
		System.out.println(d.getName());// 前
		System.out.println("-------------------");

		// // values()
		// 此方法虽然在JDK文档中查找不到，但每个枚举类都具有该方法，它遍历枚举类的所有枚举值非常方便
		Direction2[] dd = Direction2.values();
		for (Direction2 dirs : dd) {
			System.out.println(dirs);
		}
	}

}
