package com.xiahu.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Administrator ��ȡ���ܣ� ��ȡ��������ַ������������ַ���ɵĵ��� da jia ting wo shuo,jin tian
 *         yao xia yu,bu shang wan zi xi,gao xing bu?
 *         
 *         ����group()֮ǰ�������ȵ���find()��������group()����
 *         //public boolean find();
//		  boolean flag=m.find();
//		  System.out.println(flag);
//
//		  public String group();
//		  String ss=m.group();
//		  System.out.println(ss);
 */
public class Redex_PatternAndMatcherTest {
	public static void main(String[] args) {
		// �����ַ���
		String s = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";

		// ����
		String regex = "\\b\\w{4}\\b";
		
		//�ѹ�������ģʽ����
		Pattern p=Pattern.compile(regex);
		
		//ͨ��ģʽ����õ�ƥ��������
		Matcher m=p.matcher(s);
		//����ƥ��������Ĺ���
		//ͨ��find����������û��������Ӵ�
		//public boolean find();
//		boolean flag=m.find();
//		System.out.println(flag);
//		//��εõ����ֵ�أ�
//		//public String group();
//		String ss=m.group();
//		System.out.println(ss);
		while(m.find()){
			String ss=m.group();
			System.out.println(ss);
		}
	}

}
