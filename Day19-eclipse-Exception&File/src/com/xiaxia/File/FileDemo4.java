package com.xiaxia.File;

import java.io.File;

/*
 * File�ļ�����
 *    File:�ļ���Ŀ¼(�ļ���)·�����ĳ����ʾ��ʽ
 * ����������:public boolean renameTo(File dest)
 * 		���·������ͬ�����Ǹ�����
 * 		���·������ͬ�����Ǹ��������С�
 */
public class FileDemo4 {
	public static void main(String[] args) {
		File file1 = new File("E:\\work\\upload", "8a6732d363fb0e5a31811725baa22c21.jpg");
		File file2 = new File("E:\\work\\upload","����ɽ��.jpg");
		File file3 = new File("E:\\work\\upload\\makefile", "����ɽ��.jpg");
		
		//����������
		//1.·����ͬ��ʹ������
		boolean renameTo = file1.renameTo(file2);
		if (renameTo) {
			System.out.println("�������ɹ���");
		}else {
			System.out.println("������ʧ��");
		}
		
		//2.·����ͬ����ʹ����+������
		boolean renameTo2 = file2.renameTo(file3);
		if (renameTo2) {
			System.out.println("���гɹ���");
		}else {
			System.out.println("����ʧ��");
		}
	}

}
