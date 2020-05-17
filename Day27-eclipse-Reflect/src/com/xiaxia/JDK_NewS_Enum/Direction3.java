package com.xiaxia.JDK_NewS_Enum;

public enum Direction3 {
	FRONT("前") {
		@Override
		public void show() {
			System.out.println("向前看");

		}
	},
	BEHING("后") {
		@Override
		public void show() {
			System.out.println("向后看");

		}
	},
	LEFT("左") {
		@Override
		public void show() {
			System.out.println("向左看");

		}
	},
	RIGHT("右") {
		@Override
		public void show() {
			System.out.println("向右看");

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
