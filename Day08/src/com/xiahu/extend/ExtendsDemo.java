package com.xiahu.extend;

/*
 * this和super的区别?
		分别是什么呢?
			this代表本类对应的引用。
			super代表父类存储空间的标识(可以理解为父类引用,可以操作父类的成员)

		怎么用呢?
			A:调用成员变量
				this.成员变量 调用本类的成员变量
				super.成员变量 调用父类的成员变量
			B:调用构造方法
				this(...)	调用本类的构造方法
				super(...)	调用父类的构造方法
			C:调用成员方法
				this.成员方法 调用本类的成员方法
				super.成员方法 调用父类的成员方法
 */
public class ExtendsDemo {
	public static void main(String[] args) {
		Son son = new Son();
		son.show();
		son.method();
		son.showFather();
		
	}
}

class Father {
	public int age = 50;
	public String name = "张三";

	public void show() {
		System.out.println("show");
	}

	public void method() {
		System.out.println("method");
	}
}

class Son extends Father {
    public void showFather(){
    	System.out.println(super.age);
    	System.out.println(super.name);
    	super.method();
    }
}
