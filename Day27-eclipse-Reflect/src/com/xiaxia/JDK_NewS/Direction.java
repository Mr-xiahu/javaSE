package com.xiaxia.JDK_NewS;

public class Direction {
	public static final Direction FRONT = new Direction();
	public static final Direction BEHING = new Direction();
	public static final Direction LEFT = new Direction();
	public static final Direction RIGHT = new Direction();

	// 构造私有，别人就不能无限的创建了
	private Direction() {

	}

}
