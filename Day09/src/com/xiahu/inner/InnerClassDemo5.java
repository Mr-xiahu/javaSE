package com.xiahu.inner;

/*
 * 内部类:
 *    把类定义在其他类的内部，这个类就被称为内部类。
		举例：在类A中定义了一个类B，类B就是内部类。
	
	内部的访问特点：
		A:内部类可以直接访问外部类的成员，包括私有。
		B:外部类要访问内部类的成员，必须创建对象。
 */
public class InnerClassDemo5 {
	public static void main(String[] args) {
		Outer5 outer5 = new Outer5();
		outer5.method();

	}

}

// 外部类
class Outer5 {
	private int num = 10;

	public void method() {
		// 局部内部类
		class Inner5 {
			final int num2 = 20;
			public void show() {
				System.out.println(num);
				// 从内部类中访问本地变量num2; 需要被声明为最终类型
				System.out.println(num2);// 20
			}
		}

		Inner5 i = new Inner5();
		i.show();
	}
}