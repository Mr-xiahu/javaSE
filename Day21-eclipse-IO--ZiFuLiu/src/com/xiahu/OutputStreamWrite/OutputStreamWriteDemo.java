package com.xiahu.OutputStreamWrite;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * OutputStreamWriter�ķ�����
 * public void write(int c):дһ���ַ�
 * public void write(char[] cbuf):дһ���ַ�����
 * public void write(char[] cbuf,int off,int len):дһ���ַ������һ����
 * public void write(String str):дһ���ַ���
 * public void write(String str,int off,int len):дһ���ַ�����һ����
 * 
 * �����⣺close()��flush()������?
 * A:close()�ر������󣬵�����ˢ��һ�λ��������ر�֮�������󲻿��Լ�����ʹ���ˡ�
 * B:flush()����ˢ�»�����,ˢ��֮�������󻹿��Լ���ʹ�á�
 */
public class OutputStreamWriteDemo {
	public static void main(String[] args) throws IOException {
		// ��������
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
				"a.txt"));

		// д������
		// public void write(int c):дһ���ַ�
		// osw.write('a');

		// public void write(char[] cbuf):дһ���ַ�����
		// char[] chs = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };*/
		// osw.write(chs);

		// public void write(char[] cbuf,int off,int len):дһ���ַ������һ����
		// osw.write(chs, 0, 3);

		// public void write(String str):дһ���ַ���
		// osw.write("�Ұ���");

		// public void write(String str,int off,int len):дһ���ַ�����һ����
		String s = "̫��������,��������Ц";
		osw.write(s, 0, 10);

		// void flush() 
		osw.flush();//ˢ�»�����
		
		//�ͷ���Դ
		osw.close();
	}

}
