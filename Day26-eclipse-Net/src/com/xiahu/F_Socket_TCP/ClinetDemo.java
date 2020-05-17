package com.xiahu.F_Socket_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * TCP协议发送数据：
 * A:创建发送端的Socket对象
 * 		这一步如果成功，就说明连接已经建立成功了。
 * B:获取输出流，写数据
 * C:释放资源
 * 
 * 连接被拒绝。TCP协议一定要先看服务器。
 * java.net.ConnectException: Connection refused: connect
 */
public class ClinetDemo {
	public static void main(String[] args) throws IOException {
		// A:创建发送端的Socket对象
		Socket socket = new Socket("192.168.25.1", 10011);

		// B:获取输出流，写数据
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("TCP发送请求".getBytes());
		// C:释放资源
		socket.close();

	}

}
