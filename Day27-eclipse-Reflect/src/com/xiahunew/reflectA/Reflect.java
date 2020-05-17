package com.xiahunew.reflectA;

/*
 * 反射：就是通过class文件对象，去使用该文件中的成员变量，构造方法，成员方法。
 * 
 * Person p = new Person();
 * p.使用
 * 
 * 要想这样使用，首先你必须得到class文件对象，其实也就是得到Class类的对象。
 * Class类：
 * 		成员变量	Field
 * 		构造方法	Constructor
 * 		成员方法	Method
 * 
 * 获取class文件对象的方式：
 * A:Object类的getClass()方法
 * B:数据类型的静态属性class
 * C:Class类中的静态方法
 * 		public static Class forName(String className)
 * 
 * 一般我们到底使用谁呢?
 * 		A:自己玩	任选一种，第二种比较方便
 * 		B:开发	第三种
 * 			为什么呢?因为第三种是一个字符串，而不是一个具体的类名。这样我们就可以把这样的字符串配置到配置文件中。
 */
public class Reflect {
	public static void main(String[] args) throws Exception {
		// 方式一:
		Person person = new Person();
		Class class1 = person.getClass();

		Person person2 = new Person();
		Class class2 = person2.getClass();
		System.out.println(person == person2);// false
		System.out.println(class1 == class2);// true

		// 方式二：
		Class class3 = Person.class;
		System.out.println(class1 == class3);// true
		System.out.println(class2 == class3);// true

		// 方式三
		Class<?> class4 = Class.forName("com.xiahunew.reflectA.Person");
		System.out.println(class1 == class4);// true
		System.out.println(class2 == class4);// true
		System.out.println(class3 == class4);// true

	}

}
