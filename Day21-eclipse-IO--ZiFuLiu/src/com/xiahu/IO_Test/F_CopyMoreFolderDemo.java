package com.xiahu.IO_Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 * 需求：复制多极文件夹
 * 
 * 数据源：E:\新建文件夹
 * 目的地：D:\\
 * 
 * 分析：
 * 		A:封装数据源File
 * 		B:封装目的地File
 * 		C:判断该File是文件夹还是文件
 * 			a:是文件夹
 * 				就在目的地目录下创建该文件夹
 * 				获取该File对象下的所有文件或者文件夹File对象
 * 				遍历得到每一个File对象
 * 				回到C
 * 			b:是文件
 * 				就复制(字节流)
 */
public class F_CopyMoreFolderDemo {
	public static void main(String[] args) throws IOException {
		// 封装数据源File
		File srcFile = new File("E:\\");
		// 封装目的地File
		File destFile = new File("D:\\");
		copyFolder(srcFile, destFile);

	}

	public static void copyFolder(File srcFile, File destFile)
			throws IOException {
		// 判断该File是文件夹还是文件
		if(srcFile.isDirectory()){
			//就在目的地目录下创建该文件夹
			File newFolder=new File(destFile, srcFile.getName());
			newFolder.mkdir();
			
			//获取该File对象下的所有文件或者文件夹File对象
			File[] newFile=srcFile.listFiles();
			
			//获取该File对象下的所有文件或者文件夹File对象
			for(File file:newFile){
				//回到C
				copyFolder(file, newFolder);
				
			}
			
		}else{
			//就复制(字节流)
			String name=srcFile.getName();
			File newFile=new File(destFile, name);
			copyFile(srcFile, newFile);
		}
	}

	public static void copyFile(File srcFile, File newFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				srcFile));
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
