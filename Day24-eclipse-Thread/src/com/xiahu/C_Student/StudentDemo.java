package com.xiahu.C_Student;

/*
 * ������
 * 		��Դ�ࣺStudent	
 * 		����ѧ������:SetThread(������)
 * 		��ȡѧ�����ݣ�GetThread(������)
 * 		������:StudentDemo
 * 
 * ����1������˼·д���룬��������ÿ�ζ���:null---0
 * ԭ��������ÿ���߳��ж��������µ���Դ,������Ҫ���ʱ�����úͻ�ȡ�̵߳���ԴӦ����ͬһ��
 * ���ʵ����?
 * 		������������ݴ���������ͨ�����췽�����ݸ��������ࡣ
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();

		SetStudent set = new SetStudent(s);
		GetStudent get = new GetStudent(s);

		Thread th1 = new Thread(set);
		Thread th2 = new Thread(get);

		th2.start();
		th1.start();

	}

}
