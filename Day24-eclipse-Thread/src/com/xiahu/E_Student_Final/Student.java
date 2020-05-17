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

		// 修改标志
		this.flag = true;

		// 唤醒线程
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

		// 修改标签
		this.flag = false;

		// 唤醒线程
		this.notify();
	}

}
