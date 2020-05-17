package com.xiahu.String;

import java.util.Scanner;

/**
 * @author Administrator
 *  输出大写符号，小写符号  ，空格，数字，其他符号出现的次数
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
		System.out.println("请输入一行字符串");
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
		System.out.println("大写字符的个数是"+bigcoun);
		System.out.println("小写字母的个数是"+smallcount);
		System.out.println("空格的个数是:"+space);
		System.out.println("其他字符的个数是"+other);
		System.out.println("数字的个数是"+num);
		
	}

}
