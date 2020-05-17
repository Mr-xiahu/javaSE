package com.xiahu.E_Socket_UDP_Thread;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveThread implements Runnable {
	// �������ն�Socket����
	private DatagramSocket dsReceive;

	public ReceiveThread(DatagramSocket dsReceive) {
		this.dsReceive = dsReceive;
	}

	@Override
	public void run() {
		try {
			while (true) {
				// �������ն����ݰ�
				byte[] bys = new byte[1024];
				DatagramPacket dp = new DatagramPacket(bys, bys.length);

				// �������ݰ�
				dsReceive.receive(dp);

				// �������ݰ�
				byte[] bys2 = dp.getData();
				String s = new String(bys2, 0, dp.getLength());

				// ��ȡ���Ͷ�IP��ַ
				String ip = dp.getAddress().getHostAddress();
				System.out.println("from :" + ip + "data is :" + s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
