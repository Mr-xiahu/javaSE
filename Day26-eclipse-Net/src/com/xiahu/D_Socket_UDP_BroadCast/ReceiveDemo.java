package com.xiahu.D_Socket_UDP_BroadCast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		// �������ն�Socket����
		DatagramSocket ds = new DatagramSocket(12345);

		while (true) {
			// �����������ݰ�
			byte[] bys = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bys, bys.length);

			// �������ݰ�
			ds.receive(dp);

			// �����������ݰ�
			byte[] bys2 = dp.getData();
			String s = new String(bys2, 0, dp.getLength());
			// ��ȡ���Ͷ�IP��ַ
			String ip = dp.getAddress().getHostAddress();
			System.out.println("from :" + ip + "data is :" + s);
		}
	}

}
