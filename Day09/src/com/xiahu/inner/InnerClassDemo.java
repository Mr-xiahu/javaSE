package com.xiahu.inner;


/*
 * 内部类:
 *    把类定义在其他类的内部，这个类就被称为内部类。
		举例：在类A中定义了一个类B，类B就是内部类。
	
	内部的访问特点：
		A:内部类可以直接访问外部类的成员，包括私有。
		B:外部类要访问内部类的成员，必须创建对象。
 */
public class InnerClassDemo {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.method();
	}

}

// 外部类
class Outer {
	private static int num = 20;

	// 内部类
	class Inner {
		private int num = 2;
		
		public void show() {
			System.out.println(num);
		}
	}

	// 成员方法
	public void method() {
		// show();//报错
		Inner inner = new Inner();
		inner.show();
		System.out.println(inner.num);
	}
}
