package com.xiahu.duotai;

/*
 * 
 */
public class DuotaiDemo4 {
	public static void main(String[] args) {
		Father father = new Son();
		System.out.println(father.age);
		father.teach();
		
		Son son = (Son) father;
		System.out.println(son.age);
		son.teach();
		son.play();
	}

}

class Father {
	int age = 40;

	public void teach() {
		System.out.println("javaEE");
	}

}

class Son extends Father {
	int age = 20;

	public void teach() {
		System.out.println("讲解论语");
	}

	public void play() {
		System.out.println("英雄联盟");
	}
}

