package com.xiaxia.Pattern_A;

public class AnimalFactory {
	private AnimalFactory() {
	}

	 public static Dag creatrDog() {
	 return new Dag();
	 }
	
	 public static Cat createCat() {
	 return new Cat();
	 }

	public static Animal createAnimal(String type) {
		if ("dog".equals(type)) {
			return new Dag();
		} else if ("cat".equals(type)) {
			return new Cat();
		} else {
			return null;
		}
	}
}
