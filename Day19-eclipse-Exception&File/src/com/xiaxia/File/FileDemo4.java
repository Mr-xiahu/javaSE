package com.xiaxia.File;

import java.io.File;

/*
 * File文件对象
 *    File:文件和目录(文件夹)路径名的抽象表示形式
 * 重命名功能:public boolean renameTo(File dest)
 * 		如果路径名相同，就是改名。
 * 		如果路径名不同，就是改名并剪切。
 */
public class FileDemo4 {
	public static void main(String[] args) {
		File file1 = new File("E:\\work\\upload", "8a6732d363fb0e5a31811725baa22c21.jpg");
		File file2 = new File("E:\\work\\upload","锦绣山河.jpg");
		File file3 = new File("E:\\work\\upload\\makefile", "锦绣山河.jpg");
		
		//重命名功能
		//1.路径相同即使重命名
		boolean renameTo = file1.renameTo(file2);
		if (renameTo) {
			System.out.println("重命名成功！");
		}else {
			System.out.println("重命名失败");
		}
		
		//2.路径不同，即使剪切+重命名
		boolean renameTo2 = file2.renameTo(file3);
		if (renameTo2) {
			System.out.println("剪切成功！");
		}else {
			System.out.println("剪切失败");
		}
	}

}
