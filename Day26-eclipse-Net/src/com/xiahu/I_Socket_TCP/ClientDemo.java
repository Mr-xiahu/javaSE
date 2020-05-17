package com.xiahu.I_Socket_TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * 客户端键盘录入,服务器写入文本文件
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// 创建客户端套接字
		Socket s = new Socket("192.168.226.1", 6666);

		// 键盘录入事件
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;

		// 包装管道内的流
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				s.getOutputStream()));

		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// 释放资源
		s.close();
	}

}
