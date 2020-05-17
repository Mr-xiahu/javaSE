package com.xiahu.L_Socket_TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * 客户端读取文件,服务器端写入文件
 * 
 * 按照我们正常的思路加入反馈信息，结果却没反应。为什么呢?
 * 读取文本文件是可以以null作为结束信息的，但是呢，通道内是不能这样结束信息的。
 * 所以，服务器根本就不知道你结束了。而你还想服务器给你反馈。所以，就相互等待了。
 * 
 * 如何解决呢?
 * A:在多写一条数据，告诉服务器，读取到这条数据说明我就结束，你也结束吧。
 * 		这样做可以解决问题，但是不好。
 * B:Socket对象提供了一种解决方案
 * 		public void shutdownOutput()
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

		// 自定义一个结束标记
		// bw.write("over");
		// bw.newLine();
		// bw.flush();

		// Socket提供了一个终止，它会通知服务器你别等了，我没有数据过来了
		s.shutdownOutput();

		// 接收服务器端的反馈
		BufferedReader br2 = new BufferedReader(new InputStreamReader(
				s.getInputStream()));

		String message = br2.readLine();
		System.out.println(message);

		s.close();
	}

}
