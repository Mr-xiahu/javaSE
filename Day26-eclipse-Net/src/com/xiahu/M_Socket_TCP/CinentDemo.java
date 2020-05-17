package com.xiahu.M_Socket_TCP;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class CinentDemo {
	public static void main(String[] args) throws IOException {
		// 创建客户端套接字
		Socket s = new Socket("192.168.226.1", 12345);

		// 读取文本文件
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				"a.jpg"));

		// 写入通道内
		BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
			bos.flush();
		}

		s.shutdownOutput();
		BufferedReader br = new BufferedReader(new InputStreamReader(
				s.getInputStream()));
		String ss=br.readLine();
		System.out.println(ss);

		bos.close();

	}

}
