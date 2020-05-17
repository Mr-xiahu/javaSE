package com.xiahu.C_Student_Wait;

public class GetStudent implements Runnable {

	private Student s;

	public GetStudent(Student student) {
		this.s = student;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				// 判断有没有数据
				if (!s.flag) {// t2就等待了。立即释放锁。将来醒过来的时候，是从这里醒过来的时候
					try {
						s.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(s.name + "---" + s.age);

				// 修改数据
				s.flag = false;
				// 唤醒
				s.notify();
			}

		}
	}

}
