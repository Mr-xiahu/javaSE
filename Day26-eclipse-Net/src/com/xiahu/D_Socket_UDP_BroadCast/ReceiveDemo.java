package com.xiahu.D_Socket_UDP_BroadCast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		// 创建接收端Socket对象
		DatagramSocket ds = new DatagramSocket(12345);

		while (true) {
			// 创建接收数据包
			byte[] bys = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bys, bys.length);

			// 接收数据包
			ds.receive(dp);

			// 解析接收数据包
			byte[] bys2 = dp.getData();
			String s = new String(bys2, 0, dp.getLength());
			// 获取发送端IP地址
			String ip = dp.getAddress().getHostAddress();
			System.out.println("from :" + ip + "data is :" + s);
		}
	}

}
