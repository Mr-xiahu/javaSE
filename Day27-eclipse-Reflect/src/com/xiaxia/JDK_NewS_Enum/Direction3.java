package com.xiaxia.JDK_NewS_Enum;

public enum Direction3 {
	FRONT("ǰ") {
		@Override
		public void show() {
			System.out.println("��ǰ��");

		}
	},
	BEHING("��") {
		@Override
		public void show() {
			System.out.println("���");

		}
	},
	LEFT("��") {
		@Override
		public void show() {
			System.out.println("����");

		}
	},
	RIGHT("��") {
		@Override
		public void show() {
			System.out.println("���ҿ�");

		}
	};

	private String name;

	private Direction3(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public abstract void show();

}
