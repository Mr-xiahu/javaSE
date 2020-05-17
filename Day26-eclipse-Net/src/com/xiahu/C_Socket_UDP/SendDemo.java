package com.xiahu.C_Socket_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
	public static void main(String[] args) throws IOException {
		// 创建发送方Socket对象
		DatagramSocket ds = new DatagramSocket();

		// 封装数据包
		byte[] bys = "我爱你！".getBytes();
		DatagramPacket dp = new DatagramPacket(bys, bys.length,
				InetAddress.getByName("192.168.145.1"), 12345);

		// 发送数据包
		ds.send(dp);
		
		//释放资源
		ds.close();

	}

}
