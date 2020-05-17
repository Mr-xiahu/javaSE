package com.xiahu.duotai;

/*
 * 
 */
public class DuotaiDemo2 {
	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.eat();
		animal.sleep();
		animal = new Cat();
		animal.eat();
		animal.sleep();
	}

}

class Animal {
	public void eat() {
		System.out.println("eat");
	}

	public void sleep() {
		System.out.println("sleep");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("狗吃肉");
	}

	public void sleep() {
		System.out.println("狗站着睡觉");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("猫吃鱼");
	}

	public void sleep() {
		System.out.println("猫趴着睡觉");
	}
}

class Pig extends Animal {
	public void eat() {
		System.out.println("猪吃白菜");
	}

	public void sleep() {
		System.out.println("猪侧着睡");
	}
}
