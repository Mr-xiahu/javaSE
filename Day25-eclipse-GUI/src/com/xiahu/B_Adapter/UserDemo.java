package com.xiahu.B_Adapter;

/*
 * 适配器模式
 * 
 * 问题：
 * 		接口(方法比较多) -- 实现类(仅仅使用一个，也得把其他的实现给提供了，哪怕是空实现)
 * 		太麻烦了。
 * 解决方案：
 * 		接口(方法比较多) -- 适配器类(实现接口,仅仅空实现) -- 实现类(用哪个重写哪个)
 */
public class UserDemo {
	public static void main(String[] args) {
		UserDao u = new UserDaoImpl();
		u.add();
	}

}
