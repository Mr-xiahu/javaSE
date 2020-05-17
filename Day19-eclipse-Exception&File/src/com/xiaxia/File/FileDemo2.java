package com.xiaxia.File;

import java.io.File;

/*
 * File文件对象
 *    File:文件和目录(文件夹)路径名的抽象表示形式
 * 创建功能：
 *   public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
 *   public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
 *   public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来
 */
public class FileDemo2{
	public static void main(String[] args) throws Exception {
		File file = new File("E:\\work\\upload\\makeFile1.txt");
		File file2 = new File("E:\\work\\upload\\makeFile2.");
		File file3 = new File("E:\\work\\upload\\makefile\\makeFile3");
		
		//创建文件 如果存在这样的文件，就不创建了
		boolean createNewFile = file.createNewFile();
		System.out.println(createNewFile);
		
		//创建文件夹 如果存在这样的文件夹，就不创建了
		file2.mkdir();
		
		//创建文件夹,如果父文件夹不存在，会帮你创建出来
		file3.mkdirs();
	}

}
