package com.xiahu.H_Socket_TCP2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * 客户端键盘录入,服务器输出在控制台
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// 创建客户端套接字
		Socket socket = new Socket("192.168.145.1", 12355);

		// 键盘录入事件
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// 封装通道内的数据
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			// 写入事件
			writer.write(line);
			writer.newLine();
			writer.flush();
		}

		writer.close();
		bufferedReader.close();

	}
}
