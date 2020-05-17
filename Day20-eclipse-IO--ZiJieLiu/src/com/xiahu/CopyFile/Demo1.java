package com.xiahu.CopyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * ��ͨ���ֽ���һ��д��һ���ֽ�
 */
public class Demo1 {
	public static void main(String[] args) throws Exception {
		// ����Դ
		InputStream inputStream = new FileInputStream(new File("a.txt"));
		// Ŀ�ĵ�
		OutputStream outputStream = new FileOutputStream(new File("b.txt"));
		long start = System.currentTimeMillis();
		// һ�ζ�ȡһ���ֽ�
		int by = 0;
		while ((by = inputStream.read()) != -1) {
			outputStream.write(by);
		}
		long end = System.currentTimeMillis();
		System.out.println("����ʱ��:" + (end - start));
		inputStream.close();
		outputStream.close();
	}

}
