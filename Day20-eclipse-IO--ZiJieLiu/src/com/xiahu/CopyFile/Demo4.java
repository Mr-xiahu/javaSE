package com.xiahu.CopyFile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * ��Ч���ֽ���һ��д��һ���ֽ�����
 */
public class Demo4 {
	public static void main(String[] args) throws Exception {
		// ����Դ
		BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("a.txt")));
		// Ŀ�ĵ�
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File("b.txt")));

		// ��ȡ����
		byte[] bys = new byte[1024];
		int length = 0;
		while ((length = bufferedInputStream.read(bys)) != -1) {
			bufferedOutputStream.write(bys, 0, length);
			
		}
		bufferedOutputStream.flush();
		// �ر���
		bufferedInputStream.close();
		bufferedOutputStream.close();

	}

}
