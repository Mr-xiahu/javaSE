package com.xiahu.Set_Son;

public class Student {
	private String name;
	private int age;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
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

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		// return 0;
//		// ��Ϊ��Ա����ֵӰ���˹�ϣֵ���������ǰѳ�Ա����ֵ��Ӽ���
//		// // return this.name.hashCode() + this.age;
//		// // ������
//		// // s1:name.hashCode()=40,age=30
//		// // s2:name.hashCode()=20,age=50
//		// // �����ܵ�����,���ǿ��԰����ǳ���һЩ����
//		return this.name.hashCode() + this.age * 15;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//
//		if (!(obj instanceof Student)) {
//			return false;
//		}
//
//		Student s = (Student) obj;
//		return this.name.equals(s.name) && this.age == s.age;
//	}
	

}