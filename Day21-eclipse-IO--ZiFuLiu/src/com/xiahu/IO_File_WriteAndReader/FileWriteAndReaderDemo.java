package com.xiahu.IO_File_WriteAndReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 
 * 由于我们常见的操作都是使用本地默认编码，所以，不用指定编码。
 * 而转换流的名称有点长，所以，Java就提供了其子类供我们使用。
 * OutputStreamWriter = FileOutputStream + 编码表(GBK)
 * FileWriter = FileOutputStream + 编码表(GBK)
 * 
 * InputStreamReader = FileInputStream + 编码表(GBK)
 * FileReader = FileInputStream + 编码表(GBK)
 * 
 * 
 * 需求：把c:\\a.txt的内容复制到D:\\b.txt中
 *  数据源:c:\\a.txt
 *  目的地:D:\\b.txt
 */
public class FileWriteAndReaderDemo {
	public static void main(String[] args) throws IOException {
		// 封装数据源
		FileReader fr = new FileReader("c:\\a.txt");
		// 封装目的地
		FileWriter fw = new FileWriter("d:\\b.txt");

		// 复制数据
		// 单个复制
		// int ch=0;
		// while((ch=fr.read())!=-1){
		// fw.write(ch);
		// }
		//
		

		// 数组复制
		char[] chs = new char[1024];
		int len = 0;
		while ((len = fr.read(chs)) != -1) {
			fw.write(chs, 0, len);
		}
		
		fw.flush();
		fw.close();
		fr.close();
	}

}
