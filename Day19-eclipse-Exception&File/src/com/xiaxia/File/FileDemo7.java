package com.xiaxia.File;

import java.io.File;

/*
 * File�ļ�����
 *    File:�ļ���Ŀ¼(�ļ���)·�����ĳ����ʾ��ʽ
 * ��ȡ���ܣ�
 *   public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
 *   public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File����
 */
public class FileDemo7 {
	public static void main(String[] args) {
		File file = new File("E:\\work");
		
		//��������ļ��е�����
		String[] list = file.list();
		for(String fileName:list){
			System.out.println(fileName);
		}
		
		System.out.println("-------------");
		
		File[] listFiles = file.listFiles();
		for (File file2 : listFiles) {
			System.out.println("·��:"+file2.getAbsolutePath()+"---"+"�ļ�����"+file2.getName());
		}
	}

}
