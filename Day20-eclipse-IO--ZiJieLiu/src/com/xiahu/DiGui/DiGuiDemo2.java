package com.xiahu.DiGui;

/*
 * �������ô���ʵ����5�Ľ׳ˡ�
 * �����֪ʶҪ֪����
 * 		5! = 1*2*3*4*5
 * 		5! = 5*4!
 * 
 * �м��ַ���ʵ����?
 * 		A:ѭ��ʵ��
 * 		B:�ݹ�ʵ��
 * 			a:���ݹ�Ҫдһ������
 * 			b:��������
 * 			c:����
 */
public class DiGuiDemo2 {
	public static void main(String[] args) {
		int jc = 1;
		for (int x = 2; x <= 5; x++) {
			jc = jc * x;
		}
		System.out.println(jc);
		System.out.println("------------");
		int s = diGui(9);
		System.out.println(s);

	}

	public static int diGui(int num) {
		if (num == 1) {
			return num;
		} else {
			return num * diGui(num - 1);
		}

	}

}
