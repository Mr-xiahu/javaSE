package com.xiaxia.File;

import java.io.File;

/*
 * File文件对象
 *    File:文件和目录(文件夹)路径名的抽象表示形式
 * 构造方法：
 * 		File(String pathname)：根据一个路径得到File对象
 * 		File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
 * 		File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
 */
public class FileDemo {
	public static void main(String[] args) {
		// 方式一
		File file1 = new File("E:\\work\\upload\\file1.txt");
		// 是否存在该文件
		System.out.println(file1.exists());
		// 方式二
		File file2 = new File("E:\\work\\upload", "file2.txt");
		System.out.println(file2.exists());//目前该文件夹下是没有该文件的，所以为false
		//方式三
		File file = new File("E:\\work\\upload");
		File file3 = new File(file, "file3.txt");
		System.out.println(file3.exists());

	}

}
