package com.xiaxia.File;

import java.io.File;

/*
 * File�ļ�����
 *    File:�ļ���Ŀ¼(�ļ���)·�����ĳ����ʾ��ʽ
 *    
 *  ɾ������:public boolean delete()
 */
public class FileDemo3 {
	public static void main(String[] args) throws Exception {
		File file = new File("E:/work/upload/makeFile2");
		file.delete();

	}

}
