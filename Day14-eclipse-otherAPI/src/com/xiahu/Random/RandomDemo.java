package com.xiahu.Random;

import java.util.Random;

/**
 * @author Administrator
 *   
 *   Random:�������������
 * 
 *   ���췽����
 * 		public Random():û�и����ӣ��õ���Ĭ�����ӣ��ǵ�ǰʱ��ĺ���ֵ
 *		public Random(long seed):����ָ��������
 *
 *		�������Ӻ�ÿ�εõ������������ͬ�ġ�
 *
 *   ��Ա������
 * 		public int nextInt()�����ص���int��Χ�ڵ������
 *		public int nextInt(int n):���ص���[0,n)��Χ���������
 */
public class RandomDemo {
	public static void main(String[] args) {
		//�������� 
		
		//public Random():û�и����ӣ��õ���Ĭ�����ӣ��ǵ�ǰʱ��ĺ���ֵ
//		Random r=new Random();
		
		//public Random(long seed):����ָ��������
		Random r=new Random(1111);
		
		for(int x=0;x<10;x++){
			System.out.println(r.nextInt());
		}
		System.out.println("----------------->");
		for(int x=0;x<10;x++){
			System.out.println(r.nextInt(10));
		}
	}

}
