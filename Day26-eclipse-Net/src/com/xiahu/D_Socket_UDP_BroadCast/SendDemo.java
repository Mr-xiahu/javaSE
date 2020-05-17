package com.xiahu.D_Socket_UDP_BroadCast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
	public static void main(String[] args) throws IOException {
		// �������Ͷ�Socket����
		DatagramSocket ds = new DatagramSocket();

		// ��ȡ����¼��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = br.readLine()) != null) {
			if ("886".equals(line)) {
				break;
			}
			// ��װ���Ͷ����ݰ�
			byte[] bys = line.getBytes();
			DatagramPacket dp = new DatagramPacket(bys, bys.length,
					InetAddress.getByName("192.168.145.1"), 12345);

			// �������ݰ�
			ds.send(dp);

		}

		ds.close();

	}

}
