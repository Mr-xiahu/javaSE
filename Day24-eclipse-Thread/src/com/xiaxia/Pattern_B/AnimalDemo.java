package com.xiaxia.Pattern_B;

/*
 * ��������ģʽ
 */
public class AnimalDemo {
	public static void main(String[] args) {
		// ����:��Ҫ��ֻ��
		// �ӹ�������һֻ��
		Factory f = new DogFactory();
		Animal a = f.creatrAnimal();
		a.eat();
		System.out.println("-------");
		f = new CatFactory();
		a = f.creatrAnimal();
		a.eat();
	}

}
