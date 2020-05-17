package com.xiahu.H_Socket_TCP;

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
		Socket s = new Socket("192.168.226.1", 8888);

		// 控制台录入数据
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 把通道内的字节流用字符流包装一下
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				s.getOutputStream()));
		String line = null;
		while ((line = br.readLine()) != null) {
			if ("886".equals(line)) {
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();

		}

		// 释放资源
		s.close();

	}
}
