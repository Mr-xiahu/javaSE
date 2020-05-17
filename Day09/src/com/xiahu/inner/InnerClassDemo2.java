package com.xiahu.inner;


/*
 * 成员内部类:在成员位置的类
 * 局部内部类:在局部位置的类
 */
public class InnerClassDemo2 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.method();
	}

}

class Outer2{
	//成员内部类
	class Inter2{
		
	}
	
	//成员方法
	public void method(){
		//局部内部类
		class Inter3{
			
		}
	}
}

