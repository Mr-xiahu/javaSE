package com.xiahu.IONew;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * �����ı�
 */
public class IODemo_Copy_OutPutStreamAndInPutStream {
	public static void main(String[] args) throws Exception {
		FileInputStream fileInputStream = new FileInputStream(new File(
				"E:/ѧϰ����/��Ƶ/�����/A_javaSE����1-27��/day20IO��/code/day20_IO/src/cn/itcast_02/FileInputStreamDemo.java"));

		FileOutputStream fileOutputStream = new FileOutputStream(new File("E:/javaWorkSpace/upload/FileDemo.txt"));

		// ��ȡ�ӽ�
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fileInputStream.read(bys)) != -1) {
			fileOutputStream.write(bys, 0, len);
		}
		
		fileInputStream.close();
		fileOutputStream.close();

	}

}
