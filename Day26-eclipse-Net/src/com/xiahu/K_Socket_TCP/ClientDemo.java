package com.xiahu.K_Socket_TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * 客户端读取文件,服务器端写入文件
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// 创建客户端套接字
		Socket s = new Socket("192.168.226.1", 6666);

		// 读取文件
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));

		// 通道内写入文件
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				s.getOutputStream()));

		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		s.close();
	}

}
