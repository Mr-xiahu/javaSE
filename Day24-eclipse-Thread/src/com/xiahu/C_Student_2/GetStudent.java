package com.xiahu.C_Student_2;

public class GetStudent implements Runnable {

	private Student s;

	public GetStudent(Student student) {
		this.s = student;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				System.out.println(s.name + "---" + s.age);
			}

		}
	}

}
