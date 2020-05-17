package com.xiahu.inner;

/*
 * 内部类:
 *    把类定义在其他类的内部，这个类就被称为内部类。
		举例：在类A中定义了一个类B，类B就是内部类。
	
	内部的访问特点：
		A:内部类可以直接访问外部类的成员，包括私有。
		B:外部类要访问内部类的成员，必须创建对象。
 */

interface Person {
	public void study();
}

class PersonDemo {
	// 接口名作为形式参数
	// 其实这里需要的不是接口，而是该接口的实现类的对象
	public void method(Person p) {
		p.study();
	}
}

class Student implements Person {

	@Override
	public void study() {
		System.out.println("好好学习,天天向上");
	}

}

public class InnerClassDemo8 {
	public static void main(String[] args) {
		PersonDemo pd = new PersonDemo();
		pd.method(new Person() {
			
			@Override
			public void study() {
				System.out.println("好好学习,天天向上");
			}
		});
	}
	
	

}
