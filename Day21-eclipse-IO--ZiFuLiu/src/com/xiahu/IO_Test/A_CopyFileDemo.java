package com.xiahu.IO_Test;




import java.io.IOException;

/*
 * 复制文本文件
 * 我选择用4种方式
 *  1.FileInputStream  FileOutputStream
 *  2.BufferedIputStream   BufferedOutputStream
 *  3.InputStreamWrite  OutputStreamReader
 *  4. BufferedWriter   BufferedReader
 */
public class A_CopyFileDemo {
	public static void main(String[] args) throws IOException {
		// 1.FileInputStream  FileOutputStream
		// // 封装数据源
		// FileInputStream fis = new FileInputStream("a.txt");
		// // 封装目的地
		// FileOutputStream fos = new FileOutputStream("b.txt");
		// // 复制数据
		// byte[] bys = new byte[1024];
		// int len = 0;
		// while ((len = fis.read(bys)) != -1) {
		// fos.write(bys, 0, len);
		// }
		// fos.flush();
		// // 释放资源
		// fos.close();
		// fis.close();

	}

}
