package com.xiahu.Expection_Try_Catch;

/*
 * �����Լ���δ����쳣��?
 * A:try...catch...finally
 * B:throws �׳�
 * 
 * try...catch...finally�Ĵ����ʽ��
 * 		try {
 * 			���ܳ�������Ĵ���;
 * 		}catch(�쳣�� ����) {
 * 			�������Ĵ���;
 * 		}finally {
 * 			�ͷ���Դ;
 * 		}
 * 
 * ���θ�ʽ��
 * 		try {
 * 			���ܳ�������Ĵ���;
 * 		}catch(�쳣�� ����) {
 * 			�������Ĵ���;
 * 		}
 * 
 * ע�⣺
 * 		A:try����Ĵ���Խ��Խ��
 * 		B:catch������������ݣ������Ǹ���һ���򵥵���ʾ
 */
public class ExpectionDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println("��������Ϊ0");
		}
		System.out.println("over");
	}
}