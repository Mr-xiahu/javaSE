package com.xiahu.E_Socket_UDP_Thread;

import java.io.IOException;
import java.net.DatagramSocket;

public class ChatRoomDemo {
	public static void main(String[] args) throws IOException {
		//创建发送端Socket对象
		DatagramSocket dsSend=new DatagramSocket();
		//创建接收端Socket对象
		DatagramSocket dsReceive=new DatagramSocket(12345);
		
		SendThread st=new SendThread(dsSend);
		
		ReceiveThread rt=new ReceiveThread(dsReceive);
		
		Thread t1=new Thread(st);
		Thread t2=new Thread(rt);
		
		t1.start();
		t2.start();
	}

}
