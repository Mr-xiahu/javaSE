package com.xiahu.Test;

import java.util.ArrayList;

import com.xiahu.ArrayList.Student;

/*
 * ���ϵ�Ƕ�ױ���
 * ����
 * 		���ǰ���ѧ����ÿһ��ѧ���ǲ���һ�������������ǿ���ʹ��һ�����ϱ�ʾ���ǰ༶��ѧ����ArrayList<Student>
 * 		�����أ������Ա��ǲ��ǻ��а༶��ÿ���༶�ǲ���Ҳ��һ��ArrayList<Student>��
 * 		���������ж��ArrayList<Student>��ҲҪ�ü��ϴ洢����ô����?
 * 		����������ӵģ�ArrayList<ArrayList<Student>>
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//�����󼯺�
		ArrayList<ArrayList<Student>> al=new ArrayList<ArrayList<Student>>();
		
		Student s1=new Student("��ɮ", 30);
		Student s2=new Student("�����", 28);
		Student s3=new Student("��˽�", 27);
		Student s4=new Student("ɳ����", 26);
		Student s5=new Student("������", 24);
		Student s6=new Student("�����", 23);
		Student s7=new Student("˾��ܲ", 22);
		Student s8=new Student("���", 21);
		Student s9=new Student("�ν�", 20);
		Student s10=new Student("�ֳ�", 19);
		Student s11=new Student("��ʦʦ", 22);
		Student s12=new Student("��ٴ", 26);
		//����С����
		ArrayList<Student> al1=new ArrayList<Student>();
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		al1.add(s4);
		al1.add(s5);
		
		ArrayList<Student> al2=new ArrayList<Student>();
		al2.add(s6);
		al2.add(s7);
		al2.add(s8);
		
		ArrayList<Student> al3=new ArrayList<Student>();
		al3.add(s9);
		al3.add(s10);
		al3.add(s11);
		al3.add(s12);
		
		al.add(al1);
		al.add(al2);
		al.add(al3);
		
		for(ArrayList<Student> array:al ){
			for(Student s:array){
				System.out.println(s.getName()+"--"+s.getAge());
			}
			
		}
	}

}
