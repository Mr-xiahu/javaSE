package com.xiahu.IONew;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class IODemo_Copy_BufferedFileReaderAndFileWriter {

	public static void main(String[] args) throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(
				"E:/ѧϰ����/��Ƶ/�����/A_javaSE����1-27��/day20IO��/code/day20_IO/src/cn/itcast_02/FileInputStreamDemo.java"));

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:/javaWorkSpace/upload/FileDemo1.txt"));

		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			bufferedWriter.write(line);
			bufferedWriter.newLine();
			bufferedWriter.flush();
		}

		bufferedReader.close();
		bufferedWriter.close();

	}
}
