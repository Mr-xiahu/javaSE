package com.xiahu.E_Student_Final;

public class Student {

	private boolean flag;

	private String name;
	private int age;

	public synchronized void set(String name, int age) {
		if (this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		this.name = name;
		this.age = age;

		// �޸ı�־
		this.flag = true;

		// �����߳�
		this.notify();
	}

	public synchronized void get() {
		if (!this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(this.name + "---" + this.age);

		// �޸ı�ǩ
		this.flag = false;

		// �����߳�
		this.notify();
	}

}