package com.xiahu.C_Socket_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class RecriveDemo {
	public static void main(String[] args) throws IOException {
		// �������ն�Socket����
		DatagramSocket ds = new DatagramSocket(12345);

		// �������ݰ�
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys, bys.length);

		// �������ݰ�
		ds.receive(dp);

		// �������ݰ�������ʾ�ڿ���̨
		byte[] bys2 = dp.getData();
		String s = new String(bys2, 0, dp.getLength());
		// ��ȡ�Է�IP��ַ
		String ip = dp.getAddress().getHostAddress();
		System.out.println("form :" + ip + "data is :" + s);

		// �ͷ���Դ
		ds.close();

	}

}
