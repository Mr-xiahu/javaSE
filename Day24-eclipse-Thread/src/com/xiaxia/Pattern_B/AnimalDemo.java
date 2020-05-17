package com.xiaxia.Pattern_B;

/*
 * 工厂方法模式
 */
public class AnimalDemo {
	public static void main(String[] args) {
		// 需求:我要买只狗
		// 从工厂创造一只狗
		Factory f = new DogFactory();
		Animal a = f.creatrAnimal();
		a.eat();
		System.out.println("-------");
		f = new CatFactory();
		a = f.creatrAnimal();
		a.eat();
	}

}
