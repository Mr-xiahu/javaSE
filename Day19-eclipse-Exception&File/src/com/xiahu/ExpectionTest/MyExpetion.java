package com.xiahu.ExpectionTest;
/*
 * java不可能对所有的情况都考虑到，所以，在实际的开发中，我们可能需要自己定义异常。
 * 而我们自己随意的写一个类，是不能作为异常类来看的，要想你的类是一个异常类，就必须继承自Exception或者RuntimeException
 * 
 * 两种方式：
 * A:继承Exception
 * B:继承RuntimeException
 */

//编译期异常
public class MyExpetion extends Exception{
	public MyExpetion(){
		super();
	}

	public MyExpetion(String s) {
		super(s);
	}
}

//运行期异常
//public class MyExpetion extends RuntimeException{
//	public MyExpetion(){
//		super();
//	}
//
//	public MyExpetion(String s) {
//		super(s);
//	}
//}
