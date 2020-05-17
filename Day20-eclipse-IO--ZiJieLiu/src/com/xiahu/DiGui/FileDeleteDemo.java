package com.xiahu.DiGui;

import java.io.File;
import java.io.IOException;

/*
 * ���󣺵ݹ�ɾ�������ݵ�Ŀ¼
 * 
 * Ŀ¼���Ѿ�������demo
 * 
 * ������
 * 		A:��װĿ¼
 * 		B:��ȡ��Ŀ¼�µ������ļ������ļ��е�File����
 * 		C:������File���飬�õ�ÿһ��File����
 * 		D:�жϸ�File�����Ƿ����ļ���
 * 			�ǣ��ص�B
 * 			�񣺾�ɾ��
 */
public class FileDeleteDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("E:\\work\\upload");
		// System.out.println(file.mkdir());
		deleteFolder(file);

	}

	private static void deleteFolder(File srcFolder) {
		// ��ȡ��Ŀ¼�µ������ļ������ļ��е�File����
		File[] fileArray = srcFolder.listFiles();

		if (fileArray != null) {
			// ������File���飬�õ�ÿһ��File����
			for (File file : fileArray) {
				// �жϸ�File�����Ƿ����ļ���
				if (file.isDirectory()) {
					deleteFolder(file);
				} else {
					System.out.println(file.getName() + "---" + file.delete());
				}
			}

			System.out.println(srcFolder.getName() + "---" + srcFolder.delete());
		}
	}
}
