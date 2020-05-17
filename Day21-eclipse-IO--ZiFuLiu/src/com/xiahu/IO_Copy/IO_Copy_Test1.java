package com.xiahu.IO_Copy;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 
 * ���󣺰ѵ�ǰ��ĿĿ¼�µ�a.txt���ݸ��Ƶ���ǰ��ĿĿ¼�µ�b.txt��
 * 
 * ����Դ��
 * 		a.txt -- ��ȡ���� -- �ַ�ת���� -- InputStreamReader
 * Ŀ�ĵأ�
 * 		b.txt -- д������ -- �ַ�ת���� -- OutputStreamWriter
 */
public class IO_Copy_Test1 {
	public static void main(String[] args) throws IOException {
		// ��װ����Դ
		InputStreamReader isr = new InputStreamReader(new FileInputStream(
				"a.txt"));
		// ��װĿ�ĵ�
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
				"b.txt"));

		// ��������
		// ���� �ַ�����
		// int ch = 0;
		// while ((ch = isr.read()) != -1) {
		// osw.write(ch);
		// }

		// ���鸴��
		char[] chs = new char[1024];
		int len = 0;
		while((len=isr.read(chs))!=-1){
			osw.write(chs, 0, len);
		}

		osw.flush();
		osw.close();
		isr.close();
	}

}
