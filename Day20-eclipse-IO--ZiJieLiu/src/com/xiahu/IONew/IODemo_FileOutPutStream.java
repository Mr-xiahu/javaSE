package com.xiahu.IONew;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/*
 * ���ı�a.txt��д������:hello,java
 */
public class IODemo_FileOutPutStream {
	
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream(new File("a.txt"));
		//д������
		os.write("hello,java".getBytes());
		os.close();
	}

}
