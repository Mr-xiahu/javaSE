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
				// �ж���û������
				if (s.flag) {
					try {
						s.wait();// //t1���ţ��ͷ���
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				if (x % 2 == 0) {
					s.name = "�Ļ�";
					s.age = 20;
				} else {
					s.name = "����";
					s.age = 19;
				}
				x++;

				// �޸ı��
				s.flag = true;
				// �����߳�
				s.notify(); // ����t2,���Ѳ�����ʾ���������ִ�У����뻹����CPU��ִ��Ȩ��
			}

		}

	}

}
