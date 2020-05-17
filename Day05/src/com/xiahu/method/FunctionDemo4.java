package com.xiahu.method;


/*
 *需求：我要求数的和
	
	我们的需求不断的发生改变，我们就对应的提供了多个求和的方法。
	但是呢，他们的名字是不一样的。
	而我们又要求方法命名做到：见名知意。
	但是，很明显，现在没有做到。
	那么，肿么办呢?
	针对这种情况：方法的功能相同，参数列表不同的情况，为了见名知意，Java允许它们起一样的名字。
	
	其实，这种情况有一个专业名词：方法重载。
	
	方法重载：
		在同一个类中，方法名相同，参数列表不同。与返回值类型无关。
		
		参数列表不同：
			A:参数个数不同
			B:参数类型不同
 */
public class FunctionDemo4 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 30;
		int i = 40;
		int sum = sum(x, y);
		int sum2 = sum(x, y, z);
		int sum3 = sum(x, y, z, i);
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
	}

	public static int sum(int x, int y) {
		return x + y;
	}

	public static int sum(int x, int y, int z) {
		return x + y + z;
	}

	public static int sum(int x, int y, int z, int i) {
		return x + y + z + i;
	}

}
