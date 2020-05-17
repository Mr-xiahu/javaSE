package com.xiaxia.File;

import java.io.File;

/*
 * File文件对象
 *    File:文件和目录(文件夹)路径名的抽象表示形式
 *    
 *  删除功能:public boolean delete()
 */
public class FileDemo3 {
	public static void main(String[] args) throws Exception {
		File file = new File("E:/work/upload/makeFile2");
		file.delete();

	}

}
