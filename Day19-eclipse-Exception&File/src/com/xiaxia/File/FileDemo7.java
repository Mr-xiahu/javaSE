package com.xiaxia.File;

import java.io.File;

/*
 * File文件对象
 *    File:文件和目录(文件夹)路径名的抽象表示形式
 * 获取功能：
 *   public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
 *   public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
 */
public class FileDemo7 {
	public static void main(String[] args) {
		File file = new File("E:\\work");
		
		//获得所有文件夹的名称
		String[] list = file.list();
		for(String fileName:list){
			System.out.println(fileName);
		}
		
		System.out.println("-------------");
		
		File[] listFiles = file.listFiles();
		for (File file2 : listFiles) {
			System.out.println("路径:"+file2.getAbsolutePath()+"---"+"文件名称"+file2.getName());
		}
	}

}
