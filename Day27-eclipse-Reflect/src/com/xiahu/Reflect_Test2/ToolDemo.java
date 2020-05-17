package com.xiahu.Reflect_Test2;

public class ToolDemo {
	public static void main(String[] args) throws Exception {
		Person p = new Person();
		Tool t = new Tool();
		t.setProperty(p, "name", "ÏÄ»¢");
		t.setProperty(p, "age", 20);
		System.out.println(p);

	}

}

class Person {
	private String name;
	public int age;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "----" + age;
	}
}
