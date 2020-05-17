package com.xiahu.duotai;

/*
 * 
 */
public class DuotaiDemo3 {
	public static void main(String[] args) {
		Person person = new Teacher();
		person.eat();
		person.sleep();
		person = new Student();
		person.eat();
		person.sleep();
		person = new Person();
		person.eat();
		person.sleep();
	}

}

class Person {
	public void eat() {
		System.out.println("人吃饭");
	}

	public void sleep() {
		System.out.println("床上睡觉");
	}
}

class Teacher extends Person {
	public void eat() {
		System.out.println("老师不吃饭");
	}

	public void sleep() {
		System.out.println("老师不睡觉");
	}
}

class Student extends Person {
	public void eat() {
		System.out.println("学生天天吃饭");
	}

	public void sleep() {
		System.out.println("学生天天不睡觉");
	}
}