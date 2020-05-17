package com.xiahu.inner;

/*
 * 成员内部类的修饰符：
		private 为了保证数据的安全性
		static 为了方便访问数据
			注意：静态内部类访问的外部类数据必须用静态修饰。
 */
public class InnerClassDemo4 {
	public static void main(String[] args) {
		// 成员内部类被静态修饰后的访问方式是:
		// 格式：外部类名.内部类名 对象名 = new 外部类名.内部类名();
		Outer4.Inner4 oi = new Outer4.Inner4();
		oi.show();
		oi.show2();
		Outer4.Inner4.show2();
	}

}
//外部类
class Outer4 {
	private int num = 10;
	private static int num2 = 100;

	// 成员静态内部类
	public static class Inner4 {
		public void show() {
			// System.out.println(num);//静态内部类访问的外部类数据必须用静态修饰。
			System.out.println(num2);
		}

		public static void show2() {
			// System.out.println(num);//静态方法只能使用静态常量
			System.out.println(num2);
		}
	}
}
