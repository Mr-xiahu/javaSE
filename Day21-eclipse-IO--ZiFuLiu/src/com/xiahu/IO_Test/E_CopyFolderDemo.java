package com.xiahu.IO_Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/*
 *  需求：复制指定目录下的指定文件，并修改后缀名。
 * 指定的文件是：.java文件。
 * 指定的后缀名是：.jad
 * 指定的目录是：jad
 * 
 * 数据源：d:\\xiahu\\A.java
 * 目的地：d:\\jad\\A.jad
 * 
 * 分析：
 * 		A:封装目录
 * 		B:获取该目录下的java文件的File数组
 * 		C:遍历该File数组，得到每一个File对象
 * 		D:把该File进行复制
 * 		E:在目的地目录下改名
 */
public class E_CopyFolderDemo {
	public static void main(String[] args) throws IOException {
		// 封装目录
		File srcFolder = new File("d:\\xiahu");
		File destFolder = new File("d:\\jad");

		if (!destFolder.exists()) {
			destFolder.mkdir();
		}

		// 获取该目录下的java文件的File数组
		File[] fileArray = srcFolder.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {

				// return false;
				return new File(dir, name).isFile() && name.endsWith(".java");
			}
		});

		// 遍历该File数组，得到每一个File对象
		for (File file : fileArray) {
			// System.out.println(file);
			// 数据源:d:\\xiahu\AnyClass.java
			// 目的地:d:\\jad\\AnyClass.java
			String name = file.getName();
			File newFile = new File(destFolder, name);
			//把该File进行复制
			copyFile(file, newFile);
		}
		
		//在目的地目录下改名
		File[] fileArrayList=destFolder.listFiles();
		for(File file:fileArrayList){
			// System.out.println(file);
			//d:\jad\AnyClass.java
			String name=file.getName();
			String newName=name.replaceAll(".java", ".jad");
			File newFile=new File(destFolder, newName);
			file.renameTo(newFile);
		}

	}

	//把该File进行复制
	private static void copyFile(File file, File newFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(newFile));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		bis.close();

	}

}
