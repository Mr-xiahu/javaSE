package com.xiahu.B_Socket_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 *  UDPЭ�鷢�����ݣ�
 * A:�������Ͷ�Socket����
 * B:�������ݣ��������ݴ��
 * C:����Socket����ķ��ͷ����������ݰ�
 * D:�ͷ���Դ
 */
public class SentDemo {
	public static void main(String[] args) throws IOException {
		// A:�������Ͷ�Socket����--DatagramSocket()
		DatagramSocket datagramSocket = new DatagramSocket();
		// B:�������ݣ��������ݴ��
		byte[] bys = "���ڿ�ʼ����UDP����".getBytes();
		InetAddress hostName = InetAddress.getByName("192.168.25.1");
		DatagramPacket datagramPacket = new DatagramPacket(bys, bys.length, hostName, 10010);
		// C:����Socket����ķ��ͷ����������ݰ�
		datagramSocket.send(datagramPacket);
		// D:�ͷ���Դ
		datagramSocket.close();

	}

}
