package com.xiahu.CopyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * ��ͨ�ַ���һ�ζ�ȡһ���ַ�
 */
public class Demo5 {
	public static void main(String[] args) throws Exception {
		// ����Դ
		InputStreamReader reader = new InputStreamReader(new FileInputStream(new File("a.txt")));
		// Ŀ�ĵ�
		OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(new File("b.txt")));

		// ��ȡ����
		int bys = 0;
		while ((bys = reader.read()) != -1) {
			writer.write(bys);
		}
		
		reader.close();
		writer.close();

	}

}
