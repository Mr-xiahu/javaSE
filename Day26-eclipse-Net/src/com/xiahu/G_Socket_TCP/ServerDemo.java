package com.xiahu.G_Socket_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// 创建接口
		ServerSocket ss = new ServerSocket(9999);

		// 接收数据
		// 监听客户端连接。返回一个对应的Socket对象
		Socket s = ss.accept();

		// 获取输入流
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String str = new String(bys, 0, len);
		System.out.println("Server:"+str);

		// 获取输入流
		OutputStream os = s.getOutputStream();
		os.write("数据已收到".getBytes());

		// 释放资源
		s.close();
	}

}
