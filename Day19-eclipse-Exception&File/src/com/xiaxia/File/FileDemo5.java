package com.xiaxia.File;

import java.io.File;

/*
 * File文件对象
 *    File:文件和目录(文件夹)路径名的抽象表示形式
 * 判断功能:
 * public boolean isDirectory():判断是否是目录
 * public boolean isFile():判断是否是文件
 * public boolean exists():判断是否存在
 * public boolean canRead():判断是否可读
 * public boolean canWrite():判断是否可写
 * public boolean isHidden():判断是否隐藏
 */
public class FileDemo5 {
	public static void main(String[] args) {
		// File(String pathname)
		File file = new File("E:\\work\\upload\\makefile\\锦绣山河.jpg");
		
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.exists());
		System.out.println(file.canWrite());
		System.out.println(file.canRead());
		System.out.println(file.canExecute());
		System.out.println(file.isHidden());
		
	}

}
