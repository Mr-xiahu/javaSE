package com.xiahu.String;

import java.util.Scanner;

/**
 * @author Administrator
 *  �����д���ţ�Сд����  ���ո����֣��������ų��ֵĴ���
 */
public class String_BianLi {
	public static void main(String[] args) {
		
		
//		String s="alsnd lkasnd ladas nlmad s";
//		
//		for(int x=0;x<s.length();x++){
//			System.out.print(s.charAt(x));
//		}
//		System.out.println();
		int bigcoun=0;
		int smallcount=0;
		int num=0;
		int space=0;
		int other=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String s=sc.nextLine();
		for(int x=0;x<s.length();x++){
			char ch=s.charAt(x);
			if(ch>='a'&&ch<='z'){
				smallcount++;
			}else if (ch>='A'&&ch<='Z') {
				bigcoun++;
			}else if (ch>='0'&&ch<='9') {
				num++;
			}else if (ch==32) {
				space++;
			}else {
				other++;
			}
			
			
		}
		System.out.println("��д�ַ��ĸ�����"+bigcoun);
		System.out.println("Сд��ĸ�ĸ�����"+smallcount);
		System.out.println("�ո�ĸ�����:"+space);
		System.out.println("�����ַ��ĸ�����"+other);
		System.out.println("���ֵĸ�����"+num);
		
	}

}
