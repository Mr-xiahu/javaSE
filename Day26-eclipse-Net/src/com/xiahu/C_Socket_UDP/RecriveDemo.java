package com.xiahu.C_Socket_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class RecriveDemo {
	public static void main(String[] args) throws IOException {
		// 创建接收端Socket对象
		DatagramSocket ds = new DatagramSocket(12345);

		// 创建数据包
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys, bys.length);

		// 接收数据包
		ds.receive(dp);

		// 解析数据包并且显示在控制台
		byte[] bys2 = dp.getData();
		String s = new String(bys2, 0, dp.getLength());
		// 获取对方IP地址
		String ip = dp.getAddress().getHostAddress();
		System.out.println("form :" + ip + "data is :" + s);

		// 释放资源
		ds.close();

	}

}
