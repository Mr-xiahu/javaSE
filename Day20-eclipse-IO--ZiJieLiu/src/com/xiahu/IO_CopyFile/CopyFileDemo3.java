package com.xiahu.IO_CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���󣺰�c:\\a.txt���ݸ��Ƶ�d:\\b.txt��
 */
public class CopyFileDemo3 {
	public static void main(String[] args) throws IOException {
		// ��װ����Դ
		FileInputStream fis = new FileInputStream("C:\\a.txt");
		// ��װĿ�ĵ�
		FileOutputStream fos = new FileOutputStream("D:\\b.txt");

		// ��������
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}
	}

}
