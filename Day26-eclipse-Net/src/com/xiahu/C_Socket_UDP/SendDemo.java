package com.xiahu.C_Socket_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
	public static void main(String[] args) throws IOException {
		// �������ͷ�Socket����
		DatagramSocket ds = new DatagramSocket();

		// ��װ���ݰ�
		byte[] bys = "�Ұ��㣡".getBytes();
		DatagramPacket dp = new DatagramPacket(bys, bys.length,
				InetAddress.getByName("192.168.145.1"), 12345);

		// �������ݰ�
		ds.send(dp);
		
		//�ͷ���Դ
		ds.close();

	}

}
