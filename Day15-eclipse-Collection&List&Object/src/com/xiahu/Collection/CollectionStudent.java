package com.xiahu.Collection;

/**
 * @author Administrator
 *
 */

//A:创建学生类
public class CollectionStudent {
	private String name;
	private int age;
	
	
	public CollectionStudent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public CollectionStudent() {
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
	
	@Override
	public String toString() {
		return "CollectionStudent [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	

}
