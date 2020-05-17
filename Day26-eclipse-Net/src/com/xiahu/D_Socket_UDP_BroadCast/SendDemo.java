package com.xiahu.D_Socket_UDP_BroadCast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
	public static void main(String[] args) throws IOException {
		// 创建发送端Socket对象
		DatagramSocket ds = new DatagramSocket();

		// 获取键盘录入
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = br.readLine()) != null) {
			if ("886".equals(line)) {
				break;
			}
			// 封装发送端数据包
			byte[] bys = line.getBytes();
			DatagramPacket dp = new DatagramPacket(bys, bys.length,
					InetAddress.getByName("192.168.145.1"), 12345);

			// 发送数据包
			ds.send(dp);

		}

		ds.close();

	}

}
