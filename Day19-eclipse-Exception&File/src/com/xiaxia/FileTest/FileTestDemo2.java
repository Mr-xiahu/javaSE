package com.xiaxia.FileTest;

import java.io.File;
import java.io.FilenameFilter;

/*
 * 
 * �ж�E��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ�����
 * A:�Ȼ�ȡ���еģ�Ȼ�������ʱ�������жϣ�������������������
 * B:��ȡ��ʱ����Ѿ��������������ˣ�Ȼ��������ɡ�
 * 
 * Ҫ��ʵ�����Ч�����ͱ���ѧϰһ���ӿڣ��ļ����ƹ�����
 * public String[] list(FilenameFilter filter)
 * public File[] listFiles(FilenameFilter filter)
 */
public class FileTestDemo2 {
	public static void main(String[] args) {
		// ��װe�ж�Ŀ¼
		File file = new File("E:/javaWorkSpace/upload");

		// ��ȡ��Ŀ¼�������ļ������ļ��е�String����
		// public String[] list(FilenameFilter filter)
		String[] StrArray = file.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				// return false;
				// return true;
				// ͨ��������ԣ����Ǿ�֪���ˣ����װ�����ļ������ļ��е����ƼӲ��ӵ������У�ȡ��������ķ���ֵ��true����false
				// ���ԣ������true����falseӦ��������ͨ��ĳ���жϵõ���
				// System.out.println(dir + "---" + name);

				// File file = new File(dir, name);
				// boolean flag = file.isFile();
				// boolean flag2 = name.endsWith(".jpg");
				// // System.out.println(file);
				// return flag && flag2;
				return new File(dir, name).isFile() && name.endsWith(".jpg");

			}
		});

		for (String s : StrArray) {
			System.out.println(s);
		}
	}

}
