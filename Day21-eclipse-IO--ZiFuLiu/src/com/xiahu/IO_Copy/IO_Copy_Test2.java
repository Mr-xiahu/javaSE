package com.xiahu.IO_Copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * ���󣺰�c:\\a.txt�����ݸ��Ƶ�D:\\b.txt��
 *  ����Դ:c:\\a.txt
 *  Ŀ�ĵ�:D:\\b.txt
 */
public class IO_Copy_Test2 {
	public static void main(String[] args) throws IOException {
		// ��װ����Դ
		InputStreamReader isr = new InputStreamReader(new FileInputStream(
				"c:\\a.txt"));
		// ��װĿ�ĵ�
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
				"d:\\b.txt"));

		// ��������
		// ���� �ַ�����
		// int ch = 0;
		// while ((ch = isr.read()) != -1) {
		// osw.write(ch);
		// }

		// ���鸴��
		char[] chs = new char[1024];
		int len = 0;
		while ((len = isr.read(chs)) != -1) {
			osw.write(chs, 0, len);
		}

		osw.flush();
		osw.close();
		isr.close();

	}

}
