package com.xiaxia.JDK_NewS_Enum;

/*
 * ͨ��JDK5�ṩ��ö������ö����
 */
public enum Direction2 {
	FRONT("ǰ"), BEHING("��"), LEFT("��"), RIGHT("��");

	private String name;

	private Direction2(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

}
