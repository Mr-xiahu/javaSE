package com.xiahu.C_Student_Wait;

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
				// 判读有没有数据
				if (s.flag) {
					try {
						s.wait();// //t1等着，释放锁
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				if (x % 2 == 0) {
					s.name = "夏虎";
					s.age = 20;
				} else {
					s.name = "杨铭";
					s.age = 19;
				}
				x++;

				// 修改标记
				s.flag = true;
				// 唤醒线程
				s.notify(); // 唤醒t2,唤醒并不表示你立马可以执行，必须还得抢CPU的执行权。
			}

		}

	}

}
