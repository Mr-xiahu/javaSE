package com.xiaxia.JDK_NewS;

public abstract class Direction3 {
	public static final Direction3 FRONT = new Direction3("ǰ") {

		@Override
		public void show() {
			System.out.println("��ǰ��");

		}

	};
	public static final Direction3 BEHING = new Direction3("��") {

		@Override
		public void show() {
			System.out.println("���");

		}

	};
	public static final Direction3 LEFT = new Direction3("��") {

		@Override
		public void show() {
			System.out.println("����");

		}

	};
	public static final Direction3 RIGHT = new Direction3("��") {

		@Override
		public void show() {
			System.out.println("���ҿ�");

		}

	};

	// ����˽�У����˾Ͳ������޵Ĵ�����
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
