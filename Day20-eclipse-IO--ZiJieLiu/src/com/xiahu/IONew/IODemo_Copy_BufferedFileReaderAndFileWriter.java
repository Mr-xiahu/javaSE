package com.xiahu.IONew;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class IODemo_Copy_BufferedFileReaderAndFileWriter {

	public static void main(String[] args) throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(
				"E:/学习资料/视频/已完成/A_javaSE基础1-27天/day20IO流/code/day20_IO/src/cn/itcast_02/FileInputStreamDemo.java"));

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
