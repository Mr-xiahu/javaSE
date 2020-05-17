package com.xiahu.duotai;

/*
 * 
 */
public class DuotaiDemo {
	public static void main(String[] args) {
		Fu zi = new Zi();
		zi.show();
		System.out.println(zi.num);
	}

}

class Fu {
	public int num = 100;

	public void show() {
		System.out.println("show Fu");
	}

	public static void function() {
		System.out.println("function Fu");
	}
}

class Zi extends Fu {
	public int num = 1000;
	public int num2 = 200;

	public void show() {
		System.out.println("show Zi");
	}

	public void method() {
		System.out.println("method zi");
	}

	public static void function() {
		System.out.println("function Zi");
	}
}
