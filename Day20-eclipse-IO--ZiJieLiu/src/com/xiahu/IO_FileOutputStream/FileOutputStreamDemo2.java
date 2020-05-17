package com.xiahu.IO_FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ֽ�������������裺
 * A:�����ֽ����������
 * B:����write()����
 * C:�ͷ���Դ
 * 
 * public void write(int b):дһ���ֽ�
 * public void write(byte[] b):дһ���ֽ�����
 * public void write(byte[] b,int off,int len):дһ���ֽ������һ����
 */
public class FileOutputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		// �����ֽ����������
		FileOutputStream fos = new FileOutputStream("b.txt");

		// ����write()����
		// fos.write("hello,java!".getBytes());
		// fos.write(97);//97 -- �ײ���������� -- ͨ�����±��� -- ��97��Ӧ���ַ�ֵ -- a

		// public void write(byte[] b):дһ���ֽ�����
		byte[] bys = { 97, 98, 99, 100, 101 };
		fos.write(bys);

		// public void write(byte[] b,int off,int len):дһ���ֽ������һ����
		fos.write(bys, 0, 5);

		// �ͷ���Դ
		fos.close();
	}

}
