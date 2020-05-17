package com.xiahu.IO_Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



/*
 * 需求：复制单极文件夹
 * 
 * 数据源：d:\\demo
 * 目的地：e:\\test
 * 
 * 分析：
 * 		A:封装目录
 * 		B:获取该目录下的所有文本的File数组
 * 		C:遍历该File数组，得到每一个File对象
 * 		D:把该File进行复制
 */
public class D_CopyFolderDemo {
	public static void main(String[] args) throws IOException {
		// 封装数据源
		File srcFile = new File("d:\\demo");
		// 封装目的地
		File destFile = new File("e:\\test");
		// 如果e盘下面没有test这个文件夹，就创建一个
		if (!destFile.exists()) {
			destFile.mkdir();
		}

		// B:获取该目录下的所有文本的File数组
		File[] arrayFile = srcFile.listFiles();
		// 遍历该File数组，得到每一个File对象
		for (File f : arrayFile) {
			// System.out.println(f);
			String name = f.getName();
			File newdestfile = new File(destFile, name);
			copyFile(f, newdestfile);

		}

	}

	public static void copyFile(File f, File newdestfile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(f));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(newdestfile));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		bis.close();

	}

}
