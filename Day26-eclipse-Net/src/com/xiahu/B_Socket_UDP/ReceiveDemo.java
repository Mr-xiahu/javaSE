package com.xiahu.B_Socket_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * UDP协议接收数据：
 * A:创建接收端Socket对象
 * B:创建一个数据包(接收容器)
 * C:调用Socket对象的接收方法接收数据
 * D:解析数据包，并显示在控制台
 * E:释放资源
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		// A:创建接收端Socket对象
		DatagramSocket datagramSocket = new DatagramSocket(10010);
		// B:创建一个数据包(接收容器)
		byte[] bys = new byte[1024];
		DatagramPacket datagramPacket = new DatagramPacket(bys, bys.length);
		// C:调用Socket对象的接收方法接收数据
		datagramSocket.receive(datagramPacket);
		// D:解析数据包，并显示在控制台
		// 获取对方的ip
		// public InetAddress getAddress()
		InetAddress address = datagramPacket.getAddress();
		String ip = address.getHostAddress();
		// public byte[] getData():获取数据缓冲区
		// public int getLength():获取数据的实际长度
		byte[] bys2 = datagramPacket.getData();
		int len = datagramPacket.getLength();
		String s = new String(bys2, 0, len);
		System.out.println(ip + "传递的数据是:" + s);

		// 释放资源
		datagramSocket.close();

	}
}
