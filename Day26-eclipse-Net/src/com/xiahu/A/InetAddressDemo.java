package com.xiahu.A;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * 
 * 如果一个类没有构造方法：
 * A:成员全部是静态的(Math,Arrays,Collections)
 * B:单例设计模式(Runtime)
 * C:类中有静态方法返回该类的对象(InetAddress)
 * 		class Demo {
 * 			private Demo(){}
 * 
 * 			public static Demo getXxx() {
 * 				return new Demo();
 * 			}
 * 		}
 * 
 * 看InetAddress的成员方法：
 * public static InetAddress getByName(String host):根据主机名或者IP地址的字符串表示得到IP地址对象
 */
public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		// public static InetAddress getByName(String host)
		// InetAddress address=InetAddress.getLocalHost();
		InetAddress address=InetAddress.getByName("192.168.25.1");
		
		//// 获取两个东西：主机名，IP地址
		//public String getHostName()获取此 IP 地址的主机名。
		String name=address.getHostName();
		
		//// public String getHostAddress()
		String ipaddress=address.getHostAddress();
		System.out.println(name+"---"+ipaddress);
		
		

	}

}
