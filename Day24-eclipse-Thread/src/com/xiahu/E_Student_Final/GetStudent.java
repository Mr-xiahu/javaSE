package com.xiahu.E_Student_Final;

public class GetStudent implements Runnable {

	private Student s;

	public GetStudent(Student student) {
		this.s = student;
	}

	@Override
	public void run() {
		while (true) {
			s.get();
		}
	}

}
