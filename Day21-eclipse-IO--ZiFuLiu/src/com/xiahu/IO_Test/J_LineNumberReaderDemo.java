package com.xiahu.IO_Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/*
 * BufferedReader
 * 		|--LineNumberReader
 * 			public int getLineNumber()获得当前行号。 
 * 			public void setLineNumber(int lineNumber)
 */
public class J_LineNumberReaderDemo {
	public static void main(String[] args) throws IOException {
		LineNumberReader lnb = new LineNumberReader(new FileReader("a.txt"));
		lnb.setLineNumber(10);

		String line = null;
		while ((line = lnb.readLine()) != null) {
			System.out.println(lnb.getLineNumber() + ":" + line);

		}
	}

}
