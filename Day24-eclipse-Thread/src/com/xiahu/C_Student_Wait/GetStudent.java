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
				// �ж���û������
				if (!s.flag) {// t2�͵ȴ��ˡ������ͷ����������ѹ�����ʱ���Ǵ������ѹ�����ʱ��
					try {
						s.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(s.name + "---" + s.age);

				// �޸�����
				s.flag = false;
				// ����
				s.notify();
			}

		}
	}

}
