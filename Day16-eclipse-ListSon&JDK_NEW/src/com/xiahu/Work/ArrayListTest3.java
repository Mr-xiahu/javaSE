package com.xiahu.Work;

import java.util.ArrayList;
import java.util.Iterator;

import com.xiahu.ArrayList.Student;

/*
 * 
 * ����ȥ���������Զ��������ظ�ֵ(����ĳ�Ա����ֵ����ͬ)
 * 
 * ���ǰ��պ��ַ���һ���Ĳ��������ֳ������ˡ�
 * Ϊʲô��?
 * 		���Ǳ���˼������������?
 * 		ͨ���򵥵ķ���������֪��������������ж��ϡ�
 * 		������жϹ����Ǽ����Լ��ṩ�ģ��������������������֪����������жϵģ���Ӧ��ȥ��Դ�롣
 * contains()�����ĵײ���������equals()������
 * �����ǵ�ѧ������û��equals()���������ʱ��Ĭ��ʹ�õ���������Object��equals()����
 * Object()��equals()Ĭ�ϱȽϵ��ǵ�ֵַ�����ԣ����ǽ�ȥ�ˡ���Ϊnew�Ķ�������ֵַ����ͬ��
 * ���������Լ������󣬱Ƚϳ�Ա������ֵ����дequals()���ɡ�
 * �Զ����ɼ��ɡ�
 */
public class ArrayListTest3 {
	public static void main(String[] args) {
		// �������϶���
		ArrayList array = new ArrayList();

		// ����ѧ������
		Student s1 = new Student("����ϼ", 27);
		Student s2 = new Student("��־��", 40);
		Student s3 = new Student("���", 35);
		Student s4 = new Student("ܽ�ؽ��", 18);
		Student s5 = new Student("�仨", 16);
		Student s6 = new Student("����ϼ", 27);
		Student s7 = new Student("����ϼ", 18);

		// ���Ԫ��
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		array.add(s6);
		array.add(s7);

		// �����¼���
		ArrayList newArray = new ArrayList();
		
		//D:�����ɼ���,��ȡ�õ�ÿһ��Ԫ��
		Iterator it=array.iterator();
		while(it.hasNext()){
			Student s=(Student)it.next();
			if(!newArray.contains(s)){
				newArray.add(s);
			}
		}
		
		for(int x=0;x<newArray.size();x++){
			Student ss=(Student)newArray.get(x);
			System.out.println(ss.getName()+"--"+ss.getAge());
		}
	}

}
