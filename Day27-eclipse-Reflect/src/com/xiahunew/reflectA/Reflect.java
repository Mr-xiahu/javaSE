package com.xiahunew.reflectA;

/*
 * ���䣺����ͨ��class�ļ�����ȥʹ�ø��ļ��еĳ�Ա���������췽������Ա������
 * 
 * Person p = new Person();
 * p.ʹ��
 * 
 * Ҫ������ʹ�ã����������õ�class�ļ�������ʵҲ���ǵõ�Class��Ķ���
 * Class�ࣺ
 * 		��Ա����	Field
 * 		���췽��	Constructor
 * 		��Ա����	Method
 * 
 * ��ȡclass�ļ�����ķ�ʽ��
 * A:Object���getClass()����
 * B:�������͵ľ�̬����class
 * C:Class���еľ�̬����
 * 		public static Class forName(String className)
 * 
 * һ�����ǵ���ʹ��˭��?
 * 		A:�Լ���	��ѡһ�֣��ڶ��ֱȽϷ���
 * 		B:����	������
 * 			Ϊʲô��?��Ϊ��������һ���ַ�����������һ��������������������ǾͿ��԰��������ַ������õ������ļ��С�
 */
public class Reflect {
	public static void main(String[] args) throws Exception {
		// ��ʽһ:
		Person person = new Person();
		Class class1 = person.getClass();

		Person person2 = new Person();
		Class class2 = person2.getClass();
		System.out.println(person == person2);// false
		System.out.println(class1 == class2);// true

		// ��ʽ����
		Class class3 = Person.class;
		System.out.println(class1 == class3);// true
		System.out.println(class2 == class3);// true

		// ��ʽ��
		Class<?> class4 = Class.forName("com.xiahunew.reflectA.Person");
		System.out.println(class1 == class4);// true
		System.out.println(class2 == class4);// true
		System.out.println(class3 == class4);// true

	}

}
