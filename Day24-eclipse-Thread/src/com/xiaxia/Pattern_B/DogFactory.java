package com.xiaxia.Pattern_B;

/*
 * ����һ�����춯�﹤����ʵ�����춯��ӿ�
 * ʵ���Ͼ��Ǵ���һ�����칷�Ĺ�����
 */

public class DogFactory implements Factory {

	@Override
	public Animal creatrAnimal() {

		return new Dog();
	}

}
