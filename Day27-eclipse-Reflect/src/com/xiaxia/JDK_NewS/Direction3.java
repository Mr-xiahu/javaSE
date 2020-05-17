package com.xiaxia.JDK_NewS;

public abstract class Direction3 {
	public static final Direction3 FRONT = new Direction3("前") {

		@Override
		public void show() {
			System.out.println("向前看");

		}

	};
	public static final Direction3 BEHING = new Direction3("后") {

		@Override
		public void show() {
			System.out.println("向后看");

		}

	};
	public static final Direction3 LEFT = new Direction3("左") {

		@Override
		public void show() {
			System.out.println("向左看");

		}

	};
	public static final Direction3 RIGHT = new Direction3("右") {

		@Override
		public void show() {
			System.out.println("向右看");

		}

	};

	// 构造私有，别人就不能无限的创建了
	// private Direction2() {
	//
	// }

	private String name;

	private Direction3(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}

	public abstract void show();

}
