package com.xiahu.ExpectionTest;
/*
 * java�����ܶ����е���������ǵ������ԣ���ʵ�ʵĿ����У����ǿ�����Ҫ�Լ������쳣��
 * �������Լ������дһ���࣬�ǲ�����Ϊ�쳣�������ģ�Ҫ���������һ���쳣�࣬�ͱ���̳���Exception����RuntimeException
 * 
 * ���ַ�ʽ��
 * A:�̳�Exception
 * B:�̳�RuntimeException
 */

//�������쳣
public class MyExpetion extends Exception{
	public MyExpetion(){
		super();
	}

	public MyExpetion(String s) {
		super(s);
	}
}

//�������쳣
//public class MyExpetion extends RuntimeException{
//	public MyExpetion(){
//		super();
//	}
//
//	public MyExpetion(String s) {
//		super(s);
//	}
//}
