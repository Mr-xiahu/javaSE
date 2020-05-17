package com.xiahu.IO_CopyFile;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  需求：把e:\\林青霞.jpg内容复制到当前项目目录下的mn.jpg中
 *  数据源:e:\\林青霞.jpg
 *  
 *  目的地:mn.jpg
 */
public class CopyImageDemo {
	public static void main(String[] args) throws IOException {
		//封装数据源 
		FileInputStream fis=new FileInputStream("E:\\林青霞.jpg");
		//封装目的地
		FileOutputStream fos=new FileOutputStream("mn.jpg");
		
		int by=0;
		while((by=fis.read())!=-1){
			fos.write(by);
		}
	}

}
