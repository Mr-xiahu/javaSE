package com.xiahu.inner;


/*
 * 成员内部类如何直接访问内部类成员
 *     外部类名.内部类名 对象名  = 外部类对象.内部类对象;
 *     
 * 需求：我要访问Inner类的show()方法
 */
public class InnerClassDemo3 {
	public static void main(String[] args) {
		Outer3.Inner inner = new Outer3().new Inner();
		inner.show();
	}

}

// 外部类
class Outer3 {
	private static int num = 20;

	// 成员内部类
	class Inner {
		public void show() {
			System.out.println(num);
		}
	}

	
}
