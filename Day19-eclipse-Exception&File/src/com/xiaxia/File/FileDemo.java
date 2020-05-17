package com.xiaxia.File;

import java.io.File;

/*
 * File�ļ�����
 *    File:�ļ���Ŀ¼(�ļ���)·�����ĳ����ʾ��ʽ
 * ���췽����
 * 		File(String pathname)������һ��·���õ�File����
 * 		File(String parent, String child):����һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
 * 		File(File parent, String child):����һ����File�����һ�����ļ�/Ŀ¼�õ�File����
 */
public class FileDemo {
	public static void main(String[] args) {
		// ��ʽһ
		File file1 = new File("E:\\work\\upload\\file1.txt");
		// �Ƿ���ڸ��ļ�
		System.out.println(file1.exists());
		// ��ʽ��
		File file2 = new File("E:\\work\\upload", "file2.txt");
		System.out.println(file2.exists());//Ŀǰ���ļ�������û�и��ļ��ģ�����Ϊfalse
		//��ʽ��
		File file = new File("E:\\work\\upload");
		File file3 = new File(file, "file3.txt");
		System.out.println(file3.exists());

	}

}
