package com.xiahu.IO_CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  ���󣺰�c���µ�a.txt�����ݸ��Ƶ�d���µ�b.txt��
 *  ����Դ:C:\\a.txt
 *  
 *  Ŀ�ĵ�:D:\\b.txt
 */
public class CopyFileDemo2 {
	public static void main(String[] args) throws IOException {
		// ��װ����Դ
		FileInputStream fis = new FileInputStream("a.txt");
		// ��װĿ�ĵ�
		FileOutputStream fos = new FileOutputStream("b.txt");

		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}

		// �ͷ���Դ
		fos.close();
		fis.close();
	}

}
