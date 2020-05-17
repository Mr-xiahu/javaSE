package com.xiahu.object;

/*
 * Object常用的方法:
 *      public int hashCode()---返回该对象的哈希码值。
 *      public final Class getClass()---返回此 Object 的运行时类
 *      public String toString()---返回该对象的字符串表示。
 *      public boolean equals(Object obj)---指示其他某个对象是否与此对象“相等”
 *      protected void finalize()---用于垃圾回收
 *      protected Object clone()----创建并返回此对象的一个副本。
 *
 */
public class ObjectDemo {
	public static void main(String[] args) throws Exception {
		Student student = new Student("夏虎", 21, "男", "武汉软件工程职业学院");
		Student student2 = new Student("杨铭", 20, "女", "湖北第二师范学院");
		Student student3 = student;
		// 1.public int hashCode()
		int code = student.hashCode();
		System.out.println("Student对象的哈希码值:" + code);// 366712642

		// 2.public final Class getClass()
		Class<? extends Student> class1 = student.getClass();
		String name = class1.getName();
		System.out.println("Student对象的运行类:" + class1);// class
														// com.xiahu.object.Student
		System.out.println("Student对象的运行类的名称:" + name);// com.xiahu.object.Student

		// 3.public String toString()---返回该对象的字符串表示。
		String string = student.toString();
		System.out.println("Student对象的字符串:" + string);//未重写toString方法时: com.xiahu.object.Student@15db9742
		// 此时需要重写该对象的toString方法
		System.out.println("Student对象的字符串:" + string);//重写toString方法时:  Student [name=夏虎,age=21, sex=男,address=武汉软件工程职业学院]

		// 4.public boolean equals(Object obj)---
		boolean equals = student.equals(student2);
		boolean equals2 = student.equals(student3);
		System.out.println("两对象是否相等:" + equals);// false
		System.out.println("两对象是否相等:" + equals2);// true
		
		//5.protected void finalize()---用于垃圾回收
		
		//6.protected Object clone()
		//需要在对象类先实现Cloneable接口
		Object clone = student.clone();
		boolean equals3 = student.equals(clone);
		System.out.println(equals3);//true

	}

}
