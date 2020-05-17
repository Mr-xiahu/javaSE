package com.xiahu.C_Student;

public class SetStudent implements Runnable {

	private Student s;

	public SetStudent(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		s.name = "ÏÄ»¢";
		s.age = 20;
	}
}


