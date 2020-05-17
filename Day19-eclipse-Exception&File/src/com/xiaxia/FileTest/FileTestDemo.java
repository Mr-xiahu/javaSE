package com.xiaxia.FileTest;

import java.io.File;

/*
 * 
 * 判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件名称
 * 
 * 分析：
 * 		A:封装e判断目录
 * 		B:获取该目录下所有文件或者文件夹的File数组
 * 		C:遍历该File数组，得到每一个File对象，然后判断
 * 		D:是否是文件
 * 			是：继续判断是否以.jpg结尾
 * 				是：就输出该文件名称
 * 				否：不搭理它
 * 			否：不搭理它
 */
public class FileTestDemo {
	public static void main(String[] args) {
		//封装E盘
		File fileE = new File("E:\\");
		//获取该盘下的所有文件夹
		File[] listFiles = fileE.listFiles();
		//遍历该文件夹数组
		for (File file : listFiles) {
			//判断该文件是文件还文件夹
			if (file.isFile()) {
				//判断文件是否以.jpg格式结尾
				if (file.getName().endsWith(".jpg")) {
					//输出该文件的名称
					System.out.println("文件名称:"+file.getName()+"---"+"文件路径:"+file.getAbsolutePath());
				}
			}
		}
		
		
		
		
	}

}
