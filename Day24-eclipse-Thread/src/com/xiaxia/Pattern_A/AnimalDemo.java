package com.xiaxia.Pattern_A;

public class AnimalDemo {
	public static void main(String[] args) {
		//  ���������
		 Animal d = new Dag();
		 d.eat();
		 Animal c = new Cat();
		 c.eat();
		 System.out.println("--------------");
		
		// ����
		
		 Dag d2 = AnimalFactory.creatrDog();
		 d.eat();
		 Cat c2 = AnimalFactory.createCat();
		 c.eat();
		 System.out.println("--------------");
		
		// �����Ľ���
		 Animal a = AnimalFactory.createAnimal("dog");
		 a.eat();
		 a = AnimalFactory.createAnimal("cat");
		 a.eat();
		
		//NullPointerException
		
		Animal aa=AnimalFactory.createAnimal("pig");
		if(aa!=null){
			aa.eat();
		}else{
			System.out.println("�д���");
		}
		
		
	}

}
