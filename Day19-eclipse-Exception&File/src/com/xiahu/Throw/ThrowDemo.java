package com.xiahu.Throw;

/*
 * throw:����������쳣��������ǿ��԰Ѹ��쳣�׳������ʱ����׳���Ӧ�����쳣�Ķ���
 * 
 * throws��throw������(������)
	throws
		���ڷ����������棬�������쳣����
		���Ը�����쳣�������ö��Ÿ���
		��ʾ�׳��쳣���ɸ÷����ĵ�����������
		throws��ʾ�����쳣��һ�ֿ����ԣ�����һ���ᷢ����Щ�쳣
	throw
		���ڷ������ڣ��������쳣������
		ֻ���׳�һ���쳣������
		��ʾ�׳��쳣���ɷ������ڵ���䴦��
		throw�����׳����쳣��ִ��throw��һ���׳���ĳ���쳣 4
 */
public class ThrowDemo {
	public static void main(String[] args) {
		try {
			method();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		method2();
	}

	public static void method2() {
		int a = 10;
		int b = 0;
		if (b == 0) {
			throw new ArithmeticException();
		} else {
			System.out.println(a / b);
		}

	}

	public static void method() throws Exception {
		int a = 10;
		int b = 0;
		if (b == 0) {
			throw new Exception();
		} else {
			System.out.println(a / b);
		}

	}

}
