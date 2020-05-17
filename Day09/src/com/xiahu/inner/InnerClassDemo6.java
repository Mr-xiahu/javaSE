package com.xiahu.inner;


/*
 * 匿名内部类
		就是内部类的简化写法。

	前提：存在一个类或者接口
		这里的类可以是具体类也可以是抽象类。
	
	格式：
		new 类名或者接口名(){
			重写方法;
		}
		
	本质是什么呢?
		是一个继承了该类或者实现了该接口的子类匿名对象。
 */
public class InnerClassDemo6 {
	public static void main(String[] args) {
		Outer6 outer6 = new Outer6();
		outer6.method();
	}

}


interface Inter {
	public abstract void show();
	public abstract void show2();
}

class Outer6{
	public void method(){
		Inter inter = new Inter() {
			
			@Override
			public void show2() {
				System.out.println("show2");
			}
			
			@Override
			public void show() {
				System.out.println("show");
			}
		};
		
		inter.show();
		inter.show2();
	}
}
