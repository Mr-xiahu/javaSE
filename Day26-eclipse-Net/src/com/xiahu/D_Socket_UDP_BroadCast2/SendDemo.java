package com.xiahu.D_Socket_UDP_BroadCast2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
	public static void main(String[] args) throws IOException {
		// �����׽���
		DatagramSocket datagramSocket = new DatagramSocket();

		// ����¼��
		System.out.println("������һ����");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			if (line.equals("886")) {
				break;
			}

			// �������ݲ����
			DatagramPacket datagramPacket = new DatagramPacket(line.getBytes(), line.getBytes().length,
					InetAddress.getByName("192.168.145.1"), 12344);
			
			//��������
			datagramSocket.send(datagramPacket);			
		}
		datagramSocket.close();

	}

}
