package com.xiahu.StringBuffer;

/**
 * @author Administrator
 *
 *  StringBuffer�ķ�ת���ܣ�
 *  public StringBuffer reverse()
 */
public class D_StringBufferReverse {
	public static void main(String[] args) {
		// �����ַ�������������
				StringBuffer sb = new StringBuffer();

				// �������
				sb.append("ϼ���ְ���");
				System.out.println("sb:" + sb);

				// public StringBuffer reverse()
				sb.reverse();//��ת���ܣ�
				System.out.println("sb:" + sb);
	}

}
