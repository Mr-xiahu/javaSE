package com.xiahu.IONew;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/*
 * 在文本a.txt中写入数据:hello,java
 */
public class IODemo_FileOutPutStream {
	
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream(new File("a.txt"));
		//写入数据
		os.write("hello,java".getBytes());
		os.close();
	}

}
