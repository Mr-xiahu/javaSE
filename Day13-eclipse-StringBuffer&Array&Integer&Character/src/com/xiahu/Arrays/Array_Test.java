package com.xiahu.Arrays;

/**
 * @author Administrator
 *  
 *  
 * ���ַ����е��ַ���������
 * 		������"dacgebf"
 * 		�����"abcdefg"
 * 
 * ������
 * 		A:����һ���ַ���
 * 		B:���ַ���ת��Ϊ�ַ�����
 * 		C:���ַ������������
 * 		D:���������ַ�����ת���ַ���
 * 		E:��������ַ���
 */
public class Array_Test {
	public static void main(String[] args) {
		//A:����һ���ַ���
		String s="dacgebf";
		
		//B:���ַ���ת��Ϊ�ַ�����
		char[] ch=s.toCharArray();
		
		//C:���ַ������������
		maopao(ch);
		
		//D:���������ַ�����ת���ַ���
		String result=String.valueOf(ch);
		
		//E:��������ַ���
		System.out.println(result);
	}
	
	//ð������
	public static void maopao(char[] ch){
		for(int x=0;x<ch.length;x++){
			for(int y=0;y<ch.length-1-x;y++){
				if(ch[y]>ch[y+1]){
					char temp=ch[y];
					ch[y]=ch[y+1];
					ch[y+1]= temp;
				}
			}
		}
	}

}
