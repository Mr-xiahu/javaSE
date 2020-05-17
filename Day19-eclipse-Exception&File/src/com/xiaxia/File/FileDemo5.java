package com.xiaxia.File;

import java.io.File;

/*
 * File�ļ�����
 *    File:�ļ���Ŀ¼(�ļ���)·�����ĳ����ʾ��ʽ
 * �жϹ���:
 * public boolean isDirectory():�ж��Ƿ���Ŀ¼
 * public boolean isFile():�ж��Ƿ����ļ�
 * public boolean exists():�ж��Ƿ����
 * public boolean canRead():�ж��Ƿ�ɶ�
 * public boolean canWrite():�ж��Ƿ��д
 * public boolean isHidden():�ж��Ƿ�����
 */
public class FileDemo5 {
	public static void main(String[] args) {
		// File(String pathname)
		File file = new File("E:\\work\\upload\\makefile\\����ɽ��.jpg");
		
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.exists());
		System.out.println(file.canWrite());
		System.out.println(file.canRead());
		System.out.println(file.canExecute());
		System.out.println(file.isHidden());
		
	}

}
