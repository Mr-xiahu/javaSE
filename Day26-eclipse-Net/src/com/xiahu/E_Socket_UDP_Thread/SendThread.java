package com.xiahu.E_Socket_UDP_Thread;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendThread implements Runnable {
	// 创建发送端数据接口
	private DatagramSocket dsSend;

	public SendThread(DatagramSocket dsSend) {
		this.dsSend = dsSend;

	}

	@Override
	public void run() {
		try {
			// 键盘录入事件
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String line = null;
			while ((line = br.readLine()) != null) {

				if ("886".equals(line)) {
					break;
				}
				// 创建数据包
				byte[] bys = line.getBytes();
				DatagramPacket dp = new DatagramPacket(bys, bys.length,
						InetAddress.getByName("192.168.226.1"), 12345);
				// 发送数据包
				dsSend.send(dp);

			}
			dsSend.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
