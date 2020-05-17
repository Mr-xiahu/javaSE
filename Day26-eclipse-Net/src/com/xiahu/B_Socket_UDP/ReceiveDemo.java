package com.xiahu.B_Socket_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * UDPЭ��������ݣ�
 * A:�������ն�Socket����
 * B:����һ�����ݰ�(��������)
 * C:����Socket����Ľ��շ�����������
 * D:�������ݰ�������ʾ�ڿ���̨
 * E:�ͷ���Դ
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		// A:�������ն�Socket����
		DatagramSocket datagramSocket = new DatagramSocket(10010);
		// B:����һ�����ݰ�(��������)
		byte[] bys = new byte[1024];
		DatagramPacket datagramPacket = new DatagramPacket(bys, bys.length);
		// C:����Socket����Ľ��շ�����������
		datagramSocket.receive(datagramPacket);
		// D:�������ݰ�������ʾ�ڿ���̨
		// ��ȡ�Է���ip
		// public InetAddress getAddress()
		InetAddress address = datagramPacket.getAddress();
		String ip = address.getHostAddress();
		// public byte[] getData():��ȡ���ݻ�����
		// public int getLength():��ȡ���ݵ�ʵ�ʳ���
		byte[] bys2 = datagramPacket.getData();
		int len = datagramPacket.getLength();
		String s = new String(bys2, 0, len);
		System.out.println(ip + "���ݵ�������:" + s);

		// �ͷ���Դ
		datagramSocket.close();

	}
}
