package com.xiahu.D_Socket_UDP_BroadCast2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		// 创建UDP套接字
		DatagramSocket datagramSocket = new DatagramSocket(12344);

		while (true) {
			// 接收数据包
			byte[] bys = new byte[1024];
			DatagramPacket datagramPacket = new DatagramPacket(bys, bys.length);

			// 接收数据包
			datagramSocket.receive(datagramPacket);

			// 解析数据包
			byte[] data = datagramPacket.getData();
			String hostName = datagramPacket.getAddress().getHostName();
			String string = new String(data, 0, data.length);
			System.out.println("Name:" + hostName + "----" + string);
		}

	}

}
