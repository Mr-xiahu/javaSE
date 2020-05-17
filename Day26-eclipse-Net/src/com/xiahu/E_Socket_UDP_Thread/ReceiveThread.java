package com.xiahu.E_Socket_UDP_Thread;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveThread implements Runnable {
	// 创建接收端Socket对象
	private DatagramSocket dsReceive;

	public ReceiveThread(DatagramSocket dsReceive) {
		this.dsReceive = dsReceive;
	}

	@Override
	public void run() {
		try {
			while (true) {
				// 创建接收端数据包
				byte[] bys = new byte[1024];
				DatagramPacket dp = new DatagramPacket(bys, bys.length);

				// 接收数据包
				dsReceive.receive(dp);

				// 解析数据包
				byte[] bys2 = dp.getData();
				String s = new String(bys2, 0, dp.getLength());

				// 获取发送端IP地址
				String ip = dp.getAddress().getHostAddress();
				System.out.println("from :" + ip + "data is :" + s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
