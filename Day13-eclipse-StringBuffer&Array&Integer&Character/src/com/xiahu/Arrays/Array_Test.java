package com.xiahu.Arrays;

/**
 * @author Administrator
 *  
 *  
 * 把字符串中的字符进行排序。
 * 		举例："dacgebf"
 * 		结果："abcdefg"
 * 
 * 分析：
 * 		A:定义一个字符串
 * 		B:把字符串转换为字符数组
 * 		C:把字符数组进行排序
 * 		D:把排序后的字符数组转成字符串
 * 		E:输出最后的字符串
 */
public class Array_Test {
	public static void main(String[] args) {
		//A:定义一个字符串
		String s="dacgebf";
		
		//B:把字符串转换为字符数组
		char[] ch=s.toCharArray();
		
		//C:把字符数组进行排序
		maopao(ch);
		
		//D:把排序后的字符数组转成字符串
		String result=String.valueOf(ch);
		
		//E:输出最后的字符串
		System.out.println(result);
	}
	
	//冒泡排序
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
