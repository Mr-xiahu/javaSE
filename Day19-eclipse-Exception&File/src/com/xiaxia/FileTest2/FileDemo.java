package com.xiaxia.FileTest2;

import java.io.File;

/*
 * 
 * ���󣺰�E:\����\���������������Ƶ�����޸�Ϊ
 * 		00?_����.avi
 * 
 * ˼·��
 * 		A:��װĿ¼
 * 		B:��ȡ��Ŀ¼�����е��ļ���File����
 * 		C:������File���飬�õ�ÿһ��File����
 * 		D:ƴ��һ���µ����ƣ�Ȼ�����������ɡ�
 * 
 *   [FKӰ�ӳ�Ʒ]���μ�.1996.EP14.˫����Ļ.TVRip.X264.aa88.mkv
 */
public class FileDemo {
	public static void main(String[] args) {
		// ��װĿ¼
		File file = new File("E:\\��Ƶ\\���������μ�");

		// ��ȡ��Ŀ¼�����е��ļ���File����
		File[] fileArray = file.listFiles();

		// ������File���飬�õ�ÿһ��File����
		for (File f : fileArray) {
			// System.out.println(f.getName());
			String name = f.getName();// [FKӰ�ӳ�Ʒ]���μ�.1996.EP14.˫����Ļ.TVRip.X264.aa88.mkv
			int startIndex = name.indexOf("]");
			String number = name.substring(startIndex + 1, startIndex + 5);
			// System.out.println(number);

			int midIndex = name.indexOf("E");
			String num2 = name.substring(midIndex + 1, midIndex + 5);
			// System.out.println(num2);

			int endIndex = name.indexOf("m");
			String num3 = name.substring(endIndex, endIndex + 3);
			// System.out.println(num3);

//			System.out.println(number + num2 + num3);
			String newname = number.concat(num2.concat(num3));
//			System.out.println(newname);
			File newfile=new File(file, newname);
			
			System.out.println(file.renameTo(newfile));


		}
	}

}
