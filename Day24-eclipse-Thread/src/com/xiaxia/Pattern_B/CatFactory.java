package com.xiaxia.Pattern_B;

/*
 * ����һ�����춯�﹤����ʵ�����춯��ӿ�
 * ʵ���Ͼ��Ǵ���һ������è�Ĺ�����
 */
public class CatFactory implements Factory {

	@Override
	public Animal creatrAnimal() {
		// TODO Auto-generated method stub
		return new Cat();
	}

}
