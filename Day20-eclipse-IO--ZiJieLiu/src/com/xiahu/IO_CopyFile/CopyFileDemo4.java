package com.xiahu.IO_CopyFile;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  ���󣺰�e:\\����ϼ.jpg���ݸ��Ƶ���ǰ��ĿĿ¼�µ�mn.jpg��
 *  ����Դ:e:\\����ϼ.jpg
 *  
 *  Ŀ�ĵ�:mnjpg
 */
public class CopyFileDemo4 {
	public static void main(String[] args) throws IOException {
		// ��װ����Դ
		FileInputStream fis = new FileInputStream("e:\\����ϼ.jpg");

		// ��װĿ�ĵ�
		FileOutputStream fos = new FileOutputStream("mn.jpg");

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
