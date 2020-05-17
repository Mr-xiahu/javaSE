package com.xiaxia.File;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/*
 * File�ļ�����
 *    File:�ļ���Ŀ¼(�ļ���)·�����ĳ����ʾ��ʽ
 * ��ȡ���ܣ�
 *   public String getAbsolutePath()����ȡ����·��
 *   public String getPath():��ȡ���·��
 *   public String getName():��ȡ����
 *   public long length():��ȡ���ȡ��ֽ���
 *   public long lastModified():��ȡ���һ�ε��޸�ʱ�䣬����ֵ
 */
public class FileDemo6 {
	public static void main(String[] args) {
		// File(String parent, String child):����һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
		File file = new File("E:/work/upload", "Ī�Կ�1.gif");
		String absolutePath = file.getAbsolutePath();
		System.out.println("����·��:"+absolutePath);
		String path = file.getPath();
		System.out.println("���·��:"+path);
		String name = file.getName();
		System.out.println("�ļ�����:"+name);
		long length = file.length();
		System.out.println("����:"+length);
		long lastModified = file.lastModified();
		SimpleDateFormat simpleDateFormat  = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String format = simpleDateFormat.format(lastModified);
		System.out.println("���һ���޸ĵ�ʱ��:"+format);
		


	}

}
