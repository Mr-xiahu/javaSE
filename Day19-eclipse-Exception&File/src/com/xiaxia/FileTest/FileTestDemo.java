package com.xiaxia.FileTest;

import java.io.File;

/*
 * 
 * �ж�E��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ�����
 * 
 * ������
 * 		A:��װe�ж�Ŀ¼
 * 		B:��ȡ��Ŀ¼�������ļ������ļ��е�File����
 * 		C:������File���飬�õ�ÿһ��File����Ȼ���ж�
 * 		D:�Ƿ����ļ�
 * 			�ǣ������ж��Ƿ���.jpg��β
 * 				�ǣ���������ļ�����
 * 				�񣺲�������
 * 			�񣺲�������
 */
public class FileTestDemo {
	public static void main(String[] args) {
		//��װE��
		File fileE = new File("E:\\");
		//��ȡ�����µ������ļ���
		File[] listFiles = fileE.listFiles();
		//�������ļ�������
		for (File file : listFiles) {
			//�жϸ��ļ����ļ����ļ���
			if (file.isFile()) {
				//�ж��ļ��Ƿ���.jpg��ʽ��β
				if (file.getName().endsWith(".jpg")) {
					//������ļ�������
					System.out.println("�ļ�����:"+file.getName()+"---"+"�ļ�·��:"+file.getAbsolutePath());
				}
			}
		}
		
		
		
		
	}

}
