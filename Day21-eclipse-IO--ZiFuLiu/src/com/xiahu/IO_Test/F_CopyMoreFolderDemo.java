package com.xiahu.IO_Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 * ���󣺸��ƶ༫�ļ���
 * 
 * ����Դ��E:\�½��ļ���
 * Ŀ�ĵأ�D:\\
 * 
 * ������
 * 		A:��װ����ԴFile
 * 		B:��װĿ�ĵ�File
 * 		C:�жϸ�File���ļ��л����ļ�
 * 			a:���ļ���
 * 				����Ŀ�ĵ�Ŀ¼�´������ļ���
 * 				��ȡ��File�����µ������ļ������ļ���File����
 * 				�����õ�ÿһ��File����
 * 				�ص�C
 * 			b:���ļ�
 * 				�͸���(�ֽ���)
 */
public class F_CopyMoreFolderDemo {
	public static void main(String[] args) throws IOException {
		// ��װ����ԴFile
		File srcFile = new File("E:\\");
		// ��װĿ�ĵ�File
		File destFile = new File("D:\\");
		copyFolder(srcFile, destFile);

	}

	public static void copyFolder(File srcFile, File destFile)
			throws IOException {
		// �жϸ�File���ļ��л����ļ�
		if(srcFile.isDirectory()){
			//����Ŀ�ĵ�Ŀ¼�´������ļ���
			File newFolder=new File(destFile, srcFile.getName());
			newFolder.mkdir();
			
			//��ȡ��File�����µ������ļ������ļ���File����
			File[] newFile=srcFile.listFiles();
			
			//��ȡ��File�����µ������ļ������ļ���File����
			for(File file:newFile){
				//�ص�C
				copyFolder(file, newFolder);
				
			}
			
		}else{
			//�͸���(�ֽ���)
			String name=srcFile.getName();
			File newFile=new File(destFile, name);
			copyFile(srcFile, newFile);
		}
	}

	public static void copyFile(File srcFile, File newFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				srcFile));
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
