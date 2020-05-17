package com.xiahu.inner;

/*
 * 需求:请分别输出30，20，10
 */
class Outer7 {
	private int num = 10;

	class Inner7 {
		private int num = 20;
		public void show(){
			int num = 30;
			System.out.println(num);
			System.out.println(new Outer7().new Inner7().num);
			System.out.println(new Outer7().num);
		}
	}
}

public class InnerClassDemo7 {
	public static void main(String[] args) {
		Outer7.Inner7 oInner7 = new Outer7().new Inner7();
		oInner7.show();
	}

}
