package com.xiahu.G_Socket_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// 创建接口
		Socket s = new Socket("192.168.226.1", 9999);

		// 创建输出流
		OutputStream os = s.getOutputStream();
		os.write("你吃饭了没有呀".getBytes());

		// 创建输入流
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String str = new String(bys, 0, len);
		System.out.println("Client:" + str);

		// 释放资源
		s.close();
	}

}
