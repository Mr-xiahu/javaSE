package com.xiahu.IONew;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * ��ȡ����
 */
public class IODemo_FileIntPutStream {
	public static void main(String[] args) throws Exception {
		FileInputStream fileInputStream = new FileInputStream(new File(
				"E:/ѧϰ����/��Ƶ/�����/A_javaSE����1-27��/day20IO��/code/day20_IO/src/cn/itcast_02/FileInputStreamDemo.java"));

		// һ�ζ�ȡһ���ӽ�
		int bys = 0;
//		while ((bys = fileInputStream.read()) != -1) {
//			System.out.print((char) bys);
//		}

		// һ�ζ�ȡһ���ӽ�����
		byte[] byt = new byte[1024];
		int len = 0;
		while ((len = fileInputStream.read(byt)) != -1) {
			System.out.print(new String(byt, 0, len));
		}
		
		fileInputStream.close();
	}

}
