package com.xiahu.Test;

import java.util.ArrayList;
import java.util.Random;

/*
 * ��ȡ10��1-20֮����������Ҫ�����ظ�
 * 
 * ������ʵ�֣���������ĳ����ǹ̶��ģ����Ȳ���ȷ����
 * ��������ʹ�ü���ʵ�֡�
 * 
 * ������
 * 		A:��������������Ķ���
 * 		B:����һ���洢������ļ��ϡ�
 * 		C:����һ��ͳ�Ʊ�������0��ʼ��
 * 		D:�ж�ͳ�Ʊ����Ƿ�С��10
 * 			��:�Ȳ���һ����������жϸ�������ڼ������Ƿ���ڡ�
 * 					���������:����ӣ�ͳ�Ʊ���++��
 * 					�������:�Ͳ���������
 * 			�񣺲�������
 * 		E:��������
 */
public class RandomDemo {
	public static void main(String[] args) {
		//A:��������������Ķ���
		Random random=new Random();
		
		//B:����һ���洢������ļ��ϡ�
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		//C:����һ��ͳ�Ʊ�������0��ʼ��
		int count=0;
		
		//D:�ж�ͳ�Ʊ����Ƿ�С��10
		while(count<10){
			//����һ�������
			int number=(int)(Math.random()*20)+1;
			
			//�жϸ�������ڼ������Ƿ���ڡ�
			if(!list.contains(number)){
				//���������:����ӣ�ͳ�Ʊ���++��
				list.add(number);
				count++;
			}
		}
		//E:��������
		for(Integer s:list){
			System.out.println(s);
		}
	}

}
