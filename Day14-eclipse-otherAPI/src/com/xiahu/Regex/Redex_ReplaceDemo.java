package com.xiahu.Regex;

/**
 * @author Administrator
 * 
 * �滻����
 *  	String���public String replaceAll(String regex,String replacement)
 *  	ʹ�ø����� replacement �滻���ַ�������ƥ�������������ʽ�����ַ����� 
 */
public class Redex_ReplaceDemo {
	public static void main(String[] args) {
		//����һ���ַ���
		String s="alsdj lk123132asd 21654";
		
		//�������
		String regex="\\d";
		//String���public String replaceAll(String regex,String replacement)
		String ss="*";
		String result=s.replaceAll(regex, ss);
		System.out.println(result);
	}

}
