package com.xiaxia.File;

import java.io.File;

/*
 * File�ļ�����
 *    File:�ļ���Ŀ¼(�ļ���)·�����ĳ����ʾ��ʽ
 * �������ܣ�
 *   public boolean createNewFile():�����ļ� ��������������ļ����Ͳ�������
 *   public boolean mkdir():�����ļ��� ��������������ļ��У��Ͳ�������
 *   public boolean mkdirs():�����ļ���,������ļ��в����ڣ�����㴴������
 */
public class FileDemo2{
	public static void main(String[] args) throws Exception {
		File file = new File("E:\\work\\upload\\makeFile1.txt");
		File file2 = new File("E:\\work\\upload\\makeFile2.");
		File file3 = new File("E:\\work\\upload\\makefile\\makeFile3");
		
		//�����ļ� ��������������ļ����Ͳ�������
		boolean createNewFile = file.createNewFile();
		System.out.println(createNewFile);
		
		//�����ļ��� ��������������ļ��У��Ͳ�������
		file2.mkdir();
		
		//�����ļ���,������ļ��в����ڣ�����㴴������
		file3.mkdirs();
	}

}
