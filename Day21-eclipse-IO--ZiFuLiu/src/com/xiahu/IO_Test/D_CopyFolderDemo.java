package com.xiahu.IO_Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



/*
 * ���󣺸��Ƶ����ļ���
 * 
 * ����Դ��d:\\demo
 * Ŀ�ĵأ�e:\\test
 * 
 * ������
 * 		A:��װĿ¼
 * 		B:��ȡ��Ŀ¼�µ������ı���File����
 * 		C:������File���飬�õ�ÿһ��File����
 * 		D:�Ѹ�File���и���
 */
public class D_CopyFolderDemo {
	public static void main(String[] args) throws IOException {
		// ��װ����Դ
		File srcFile = new File("d:\\demo");
		// ��װĿ�ĵ�
		File destFile = new File("e:\\test");
		// ���e������û��test����ļ��У��ʹ���һ��
		if (!destFile.exists()) {
			destFile.mkdir();
		}

		// B:��ȡ��Ŀ¼�µ������ı���File����
		File[] arrayFile = srcFile.listFiles();
		// ������File���飬�õ�ÿһ��File����
		for (File f : arrayFile) {
			// System.out.println(f);
			String name = f.getName();
			File newdestfile = new File(destFile, name);
			copyFile(f, newdestfile);

		}

	}

	public static void copyFile(File f, File newdestfile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(f));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(newdestfile));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		bis.close();

	}

}
