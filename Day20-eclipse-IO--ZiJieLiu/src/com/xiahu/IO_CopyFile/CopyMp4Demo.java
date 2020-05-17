package com.xiahu.IO_CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：把e:\\王力宏 - 唯一.mp3复制到当前项目目录下的copy.mp3中
 * 数据源:e:\\王力宏 - 唯一.mp3
 * 目的地:copy.mp3
 */
public class CopyMp4Demo {
	public static void main(String[] args) throws IOException {
		//封装数据源
		FileInputStream fis=new FileInputStream("e:\\王力宏 - 唯一.mp3");
		//封装目的地
		FileOutputStream fos=new FileOutputStream("copy.mp3");
		int by=0;
		while((by=fis.read())!=-1){
			fos.write(by);
		}
		
		//释放资源
		fis.close();
		fos.close();
	}

}
