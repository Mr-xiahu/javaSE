package com.xiahu.Math;

/**
 * @author Administrator
 *  Math: 
 *     Math ���������ִ�л�����ѧ����ķ����������ָ����������ƽ���������Ǻ�����
 * ��Ա������
 * 		public static final double PI
 * 		public static final double E
 * ��Ա������
 * 		public static int abs(int a)������ֵ
 *		public static double ceil(double a):����ȡ��
 *		public static double floor(double a):����ȡ��
 *		public static int max(int a,int b):���ֵ (min��ѧ)
 *		public static double pow(double a,double b):a��b����
 *		public static double random():����� [0.0,1.0)
 *		public static int round(float a) ��������(����Ϊdouble����ѧ)
 *		public static double sqrt(double a):��ƽ����
 */
public class MathDemo {
	public static void main(String[] args) {
		//public static final double PI
		System.out.println(Math.PI);
		System.out.println("------------");
		//public static final double E
		System.out.println(Math.E);
		System.out.println("------------");
		
		//public static int abs(int a)������ֵ
		System.out.println("abs:"+Math.abs(10));
		System.out.println("------------");
		
		//public static double ceil(double a):����ȡ��
		System.out.println("ceil:"+Math.ceil(15.4));
		System.out.println("------------");
		
		//public static double floor(double a):����ȡ��
		System.out.println("floor:"+Math.floor(15.7));
		System.out.println("------------");
		
		//public static int max(int a,int b)���ֵ
		System.out.println("max:"+Math.max(34, 49));
		System.out.println("------------");
		
		//public static int min(int a,int b)���ֵ
		System.out.println("min:" + Math.min(34, 49));
		System.out.println("------------");
		
		// ������Ҫ��ȡ���������е����ֵ
		System.out.println("max1:"+Math.max(Math.max(15, 23), 56));
		System.out.println("------------");
		
		// ������Ҫ��ȡ�ĸ������е����ֵ
		System.out.println("max2:"+Math.max(Math.max(23, 32), Math.max(45, 56)));
		System.out.println("------------");
		
		//public static double pow(double a,double b):a��b����
		System.out.println("pow:"+Math.pow(3, 4));
		System.out.println("------------");
		
		//public static double random():����� [0.0,1.0)
		System.out.println("random:"+((int)(Math.random()*10)+1));
		System.out.println("------------");
		
		//public static int round(float a) ��������(����Ϊdouble����ѧ)
		System.out.println("round:"+Math.round(4.5));
		System.out.println("------------");
		System.out.println("round:"+Math.round(4.f));
		System.out.println("------------");
		
		//public static double sqrt(double a):��ƽ����
		System.out.println("sqrt:" + Math.sqrt(5));
		System.out.println("------------");
	}

}
