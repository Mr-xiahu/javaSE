package com.xiahu.Object;
/**
 * 
 * @author Administrator
 *   ����5��ѧ����������5��ѧ������Ϣ�洢�������У����������飬��ȡ�õ�ÿһ��ѧ����Ϣ��
 *	
 *	 ѧ����Student
 *	 	��Ա������name,age
 *		���췽�����޲�,����
 *		��Ա������getXxx()/setXxx()
 *
 *   ����
 *     A������ѧ����
 *     B������ѧ������(��������)
 *     C:����ѧ�����󲡸�ֵ
 *     D:��C����Ķ�����뵽������
 *     E:��������
 */

public class ObjectArraysTest {
	public static void main(String[] args) {
		//B������ѧ������(��������)
		Student[] stu=new Student[5];
		// C:����ѧ������ֵ
		Student s1=new Student("��������", 15);
		Student s2=new Student("��ӯӯ", 26);
		Student s3=new Student("����", 37);
		Student s4=new Student("������", 48);
		Student s5=new Student("�����", 59);
		
		// D:��C����Ķ�����뵽������
		stu[0]=s1;
		stu[1]=s2;
		stu[2]=s3;
		stu[3]=s4;
		stu[4]=s5;
		
		// E:��������
		for(int x=0;x<stu.length;x++){
//			System.out.println(stu[x]);
			Student s=stu[x];
			System.out.println("����:"+s.getName());
			System.out.println("����:"+s.getAge());
		}
	}

}
//����ѧ����
class Student{
	private String name;
	private int age;
		
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	
}