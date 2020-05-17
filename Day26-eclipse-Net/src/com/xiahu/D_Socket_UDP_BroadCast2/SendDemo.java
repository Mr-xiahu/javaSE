package com.xiahu.D_Socket_UDP_BroadCast2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
	public static void main(String[] args) throws IOException {
		// 创建套接字
		DatagramSocket datagramSocket = new DatagramSocket();

		// 键盘录入
		System.out.println("请输入一个数");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			if (line.equals("886")) {
				break;
			}

			// 创建数据并打包
			DatagramPacket datagramPacket = new DatagramPacket(line.getBytes(), line.getBytes().length,
					InetAddress.getByName("192.168.145.1"), 12344);
			
			//发送数据
			datagramSocket.send(datagramPacket);			
		}
		datagramSocket.close();

	}

}
