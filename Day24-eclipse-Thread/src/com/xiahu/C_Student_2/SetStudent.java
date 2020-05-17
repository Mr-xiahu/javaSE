package com.xiahu.C_Student_2;

public class SetStudent implements Runnable {

	private Student s;

	private int x = 0;

	public SetStudent(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				if (x % 2 == 0) {
					s.name = "ÏÄ»¢";
					s.age = 20;
				} else {
					s.name = "ÑîÃú";
					s.age = 19;
				}
				x++;

			}

		}

	}

}
