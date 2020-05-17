package com.xiahu.IO_CopyFile;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 复制文本文件。
 * 
 * 数据源：从哪里来
 * a.txt	--	读取数据	--	FileInputStream	
 * 
 * 目的地：到哪里去
 * b.txt	--	写数据		--	FileOutputStream
 * 
 * java.io.FileNotFoundException: a.txt (系统找不到指定的文件。)
 * 
 * 这一次复制中文没有出现任何问题，为什么呢?
 * 上一次我们出现问题的原因在于我们每次获取到一个字节数据，就把该字节数据转换为了字符数据，然后输出到控制台。
 * 而这一次呢?确实通过IO流读取数据，写到文本文件，你读取一个字节，我就写入一个字节，你没有做任何的转换。
 * 它会自己做转换。
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		// 数据源
		InputStream inStream = new FileInputStream(new File("a.txt"));

		// 目的地
		OutputStream outStrean = new FileOutputStream(new File("b.txt"));

		// 读取数据源中的数据
		byte[] bys = new byte[1024];
		int length = 0;
		while ((length = inStream.read(bys)) != -1) {
			outStrean.write(bys, 0, length);
		}
		
		//关闭流
		inStream.close();
		outStrean.close();
	}

}
