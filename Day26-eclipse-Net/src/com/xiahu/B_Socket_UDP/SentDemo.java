package com.xiahu.B_Socket_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 *  UDP协议发送数据：
 * A:创建发送端Socket对象
 * B:创建数据，并把数据打包
 * C:调用Socket对象的发送方法发送数据包
 * D:释放资源
 */
public class SentDemo {
	public static void main(String[] args) throws IOException {
		// A:创建发送端Socket对象--DatagramSocket()
		DatagramSocket datagramSocket = new DatagramSocket();
		// B:创建数据，并把数据打包
		byte[] bys = "现在开始发送UDP数据".getBytes();
		InetAddress hostName = InetAddress.getByName("192.168.25.1");
		DatagramPacket datagramPacket = new DatagramPacket(bys, bys.length, hostName, 10010);
		// C:调用Socket对象的发送方法发送数据包
		datagramSocket.send(datagramPacket);
		// D:释放资源
		datagramSocket.close();

	}

}
