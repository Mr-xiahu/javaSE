package com.xiaxia.FileTest2;

import java.io.File;

/*
 * 
 * 需求：把E:\评书\三国演义下面的视频名称修改为
 * 		00?_介绍.avi
 * 
 * 思路：
 * 		A:封装目录
 * 		B:获取该目录下所有的文件的File数组
 * 		C:遍历该File数组，得到每一个File对象
 * 		D:拼接一个新的名称，然后重命名即可。
 * 
 *   [FK影视出品]西游记.1996.EP14.双语字幕.TVRip.X264.aa88.mkv
 */
public class FileDemo {
	public static void main(String[] args) {
		// 封装目录
		File file = new File("E:\\视频\\张卫健西游记");

		// 获取该目录下所有的文件的File数组
		File[] fileArray = file.listFiles();

		// 遍历该File数组，得到每一个File对象
		for (File f : fileArray) {
			// System.out.println(f.getName());
			String name = f.getName();// [FK影视出品]西游记.1996.EP14.双语字幕.TVRip.X264.aa88.mkv
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
