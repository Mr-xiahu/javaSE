package com.xiahu.IO_Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/*
 *  ���󣺸���ָ��Ŀ¼�µ�ָ���ļ������޸ĺ�׺����
 * ָ�����ļ��ǣ�.java�ļ���
 * ָ���ĺ�׺���ǣ�.jad
 * ָ����Ŀ¼�ǣ�jad
 * 
 * ����Դ��d:\\xiahu\\A.java
 * Ŀ�ĵأ�d:\\jad\\A.jad
 * 
 * ������
 * 		A:��װĿ¼
 * 		B:��ȡ��Ŀ¼�µ�java�ļ���File����
 * 		C:������File���飬�õ�ÿһ��File����
 * 		D:�Ѹ�File���и���
 * 		E:��Ŀ�ĵ�Ŀ¼�¸���
 */
public class E_CopyFolderDemo {
	public static void main(String[] args) throws IOException {
		// ��װĿ¼
		File srcFolder = new File("d:\\xiahu");
		File destFolder = new File("d:\\jad");

		if (!destFolder.exists()) {
			destFolder.mkdir();
		}

		// ��ȡ��Ŀ¼�µ�java�ļ���File����
		File[] fileArray = srcFolder.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {

				// return false;
				return new File(dir, name).isFile() && name.endsWith(".java");
			}
		});

		// ������File���飬�õ�ÿһ��File����
		for (File file : fileArray) {
			// System.out.println(file);
			// ����Դ:d:\\xiahu\AnyClass.java
			// Ŀ�ĵ�:d:\\jad\\AnyClass.java
			String name = file.getName();
			File newFile = new File(destFolder, name);
			//�Ѹ�File���и���
			copyFile(file, newFile);
		}
		
		//��Ŀ�ĵ�Ŀ¼�¸���
		File[] fileArrayList=destFolder.listFiles();
		for(File file:fileArrayList){
			// System.out.println(file);
			//d:\jad\AnyClass.java
			String name=file.getName();
			String newName=name.replaceAll(".java", ".jad");
			File newFile=new File(destFolder, newName);
			file.renameTo(newFile);
		}

	}

	//�Ѹ�File���и���
	private static void copyFile(File file, File newFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(newFile));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		bis.close();

	}

}
