package com.xiahu.IO_CopyFile;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  ���󣺰�e:\\������ - Ψһ.mp3���Ƶ���ǰ��ĿĿ¼�µ�copy.mp3��
 */
public class CopyFileDemo5 {
	public static void main(String[] args) throws IOException {
		// ��װ����Դ
		FileInputStream fis = new FileInputStream("e:\\������ - Ψһ.mp3");

		// ��װĿ�ĵ�
		FileOutputStream fos = new FileOutputStream("copy.mp3");

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);

		}

		// �ͷ���Դ
		fos.close();
		fis.close();
	}

}
