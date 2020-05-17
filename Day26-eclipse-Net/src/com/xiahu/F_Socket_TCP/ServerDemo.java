package com.xiahu.F_Socket_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCP协议接收数据：
 * A:创建接收端的Socket对象
 * B:监听客户端连接。返回一个对应的Socket对象
 * C:获取输入流，读取数据显示在控制台
 * D:释放资源
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// A:创建接收端的Socket对象
		ServerSocket ss = new ServerSocket(10011);
		// B:监听客户端连接。返回一个对应的Socket对象
		Socket s = ss.accept(); // 侦听并接受到此套接字的连接。此方法在连接传入之前一直阻塞。
		// C:获取输入流，读取数据显示在控制台
		InputStream inputStream = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = inputStream.read(bys);
		String str = new String(bys, 0, len);
		String ip = s.getInetAddress().getHostAddress();

		System.out.println(ip + "---" + str);

		// 释放资源
		s.close();
	}

}
