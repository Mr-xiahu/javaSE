package com.xiahu.Math;

/**
 * @author Administrator
 *  Math: 
 *     Math 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。
 * 成员变量：
 * 		public static final double PI
 * 		public static final double E
 * 成员方法：
 * 		public static int abs(int a)：绝对值
 *		public static double ceil(double a):向上取整
 *		public static double floor(double a):向下取整
 *		public static int max(int a,int b):最大值 (min自学)
 *		public static double pow(double a,double b):a的b次幂
 *		public static double random():随机数 [0.0,1.0)
 *		public static int round(float a) 四舍五入(参数为double的自学)
 *		public static double sqrt(double a):正平方根
 */
public class MathDemo {
	public static void main(String[] args) {
		//public static final double PI
		System.out.println(Math.PI);
		System.out.println("------------");
		//public static final double E
		System.out.println(Math.E);
		System.out.println("------------");
		
		//public static int abs(int a)：绝对值
		System.out.println("abs:"+Math.abs(10));
		System.out.println("------------");
		
		//public static double ceil(double a):向上取整
		System.out.println("ceil:"+Math.ceil(15.4));
		System.out.println("------------");
		
		//public static double floor(double a):向下取整
		System.out.println("floor:"+Math.floor(15.7));
		System.out.println("------------");
		
		//public static int max(int a,int b)最大值
		System.out.println("max:"+Math.max(34, 49));
		System.out.println("------------");
		
		//public static int min(int a,int b)最大值
		System.out.println("min:" + Math.min(34, 49));
		System.out.println("------------");
		
		// 需求：我要获取三个数据中的最大值
		System.out.println("max1:"+Math.max(Math.max(15, 23), 56));
		System.out.println("------------");
		
		// 需求：我要获取四个数据中的最大值
		System.out.println("max2:"+Math.max(Math.max(23, 32), Math.max(45, 56)));
		System.out.println("------------");
		
		//public static double pow(double a,double b):a的b次幂
		System.out.println("pow:"+Math.pow(3, 4));
		System.out.println("------------");
		
		//public static double random():随机数 [0.0,1.0)
		System.out.println("random:"+((int)(Math.random()*10)+1));
		System.out.println("------------");
		
		//public static int round(float a) 四舍五入(参数为double的自学)
		System.out.println("round:"+Math.round(4.5));
		System.out.println("------------");
		System.out.println("round:"+Math.round(4.f));
		System.out.println("------------");
		
		//public static double sqrt(double a):正平方根
		System.out.println("sqrt:" + Math.sqrt(5));
		System.out.println("------------");
	}

}
