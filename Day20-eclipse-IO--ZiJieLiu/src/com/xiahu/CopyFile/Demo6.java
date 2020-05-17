package com.xiahu.CopyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * ��ͨ�ַ���һ�ζ�ȡһ���ַ�����
 */
public class Demo6 {
	public static void main(String[] args) throws Exception {
		// ����Դ
		InputStreamReader reader = new InputStreamReader(new FileInputStream(new File("a.txt")));
		// Ŀ�ĵ�
		OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(new File("b.txt")));

		// ��ȡ����
		char[] chs = new char[1024];
		int length = 0;
		while ((length = reader.read(chs)) != -1) {
			writer.write(chs, 0, length);
		}

		reader.close();
		writer.close();

	}

}
