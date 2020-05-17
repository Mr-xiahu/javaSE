package com.xiahu.Object;
/**
 * 
 * @author Administrator
 *   我有5个学生，请把这个5个学生的信息存储到数组中，并遍历数组，获取得到每一个学生信息。
 *	
 *	 学生：Student
 *	 	成员变量：name,age
 *		构造方法：无参,带参
 *		成员方法：getXxx()/setXxx()
 *
 *   分析
 *     A：创建学生类
 *     B：创建学生数组(对象数组)
 *     C:创建学生对象病赋值
 *     D:把C步骤的对象加入到数组中
 *     E:遍历数组
 */

public class ObjectArraysTest {
	public static void main(String[] args) {
		//B：创建学生数组(对象数组)
		Student[] stu=new Student[5];
		// C:创建学生对象赋值
		Student s1=new Student("东方不败", 15);
		Student s2=new Student("任盈盈", 26);
		Student s3=new Student("杨幂", 37);
		Student s4=new Student("风清扬", 48);
		Student s5=new Student("令狐冲", 59);
		
		// D:把C步骤的对象加入到数组中
		stu[0]=s1;
		stu[1]=s2;
		stu[2]=s3;
		stu[3]=s4;
		stu[4]=s5;
		
		// E:遍历数组
		for(int x=0;x<stu.length;x++){
//			System.out.println(stu[x]);
			Student s=stu[x];
			System.out.println("姓名:"+s.getName());
			System.out.println("年龄:"+s.getAge());
		}
	}

}
//创建学生类
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