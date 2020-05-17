package com.xiaxia.Pattern_B;

/*
 * 创建一个制造动物工厂类实现制造动物接口
 * 实际上就是创建一个制造狗的工厂类
 */

public class DogFactory implements Factory {

	@Override
	public Animal creatrAnimal() {

		return new Dog();
	}

}
