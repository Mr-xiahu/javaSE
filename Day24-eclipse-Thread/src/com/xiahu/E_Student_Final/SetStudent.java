package com.xiahu.E_Student_Final;

public class SetStudent implements Runnable {

	private Student s;

	private int x = 0;

	public SetStudent(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				s.set("�Ļ�", 20);
			} else {
				s.set("����", 19);
			}
			x++;
		}
	}

}
