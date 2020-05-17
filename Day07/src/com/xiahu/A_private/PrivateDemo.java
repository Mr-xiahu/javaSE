package com.xiahu.A_private;

/*
 * private:
		是一个权限修饰符
		可以修饰成员变量和成员方法
		被其修饰的成员只能在本类中被访问
 */

class Demo {
	int age;
	String name;
	private String address;
	
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void show() {
		System.out.println("这是一个Demo");
	}

	private void method() {
		System.out.println("method" + address);
	}
}

public class PrivateDemo {
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.age = 20;
		demo.name="夏虎";
		demo.setAddress("湖北省孝感市");
		System.out.println(demo.age+"--"+demo.name);
		System.out.println(demo.getAddress());
	}
}
