package com.xiahu.C_Student;

public class GetStudent implements Runnable {

	private Student s;

	public GetStudent(Student student) {
		this.s = student;
	}

	@Override
	public void run() {
		System.out.println(s.name + "---" + s.age);
	}

}
