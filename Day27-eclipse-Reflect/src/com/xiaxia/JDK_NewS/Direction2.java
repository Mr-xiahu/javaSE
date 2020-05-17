package com.xiaxia.JDK_NewS;

public class Direction2 {
	public static final Direction2 FRONT = new Direction2("前");
	public static final Direction2 BEHING = new Direction2("后");
	public static final Direction2 LEFT = new Direction2("左");
	public static final Direction2 RIGHT = new Direction2("右");

	// 构造私有，别人就不能无限的创建了
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
