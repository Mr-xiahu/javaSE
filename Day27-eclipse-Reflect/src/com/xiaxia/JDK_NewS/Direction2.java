package com.xiaxia.JDK_NewS;

public class Direction2 {
	public static final Direction2 FRONT = new Direction2("ǰ");
	public static final Direction2 BEHING = new Direction2("��");
	public static final Direction2 LEFT = new Direction2("��");
	public static final Direction2 RIGHT = new Direction2("��");

	// ����˽�У����˾Ͳ������޵Ĵ�����
	// private Direction2() {
	//
	// }

	private String name;

	private Direction2(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}

}
