package com.xiahu.E_Student_Final;

/*
 * ������
 * 		��Դ�ࣺStudent	
 * 		����ѧ������:SetThread(������)
 * 		��ȡѧ�����ݣ�GetThread(������)
 * 		������:StudentDemo
 * 
 *  
 * ���հ�����У�
 * 		��Student�ĳ�Ա������˽�е��ˡ�
 * 		�����úͻ�ȡ�Ĳ�������װ���˹��ܣ�������ͬ����
 * 		���û��߻�ȡ���߳�����ֻ��Ҫ���÷������ɡ�
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();

		SetStudent set = new SetStudent(s);
		GetStudent get = new GetStudent(s);

		Thread th2 = new Thread(get);
		Thread th1 = new Thread(set);

		th1.start();
		th2.start();

	}

}
