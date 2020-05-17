package com.xiahu.Regex;

/**
 * @author Administrator
 * 
 * 替换功能
 *  	String类的public String replaceAll(String regex,String replacement)
 *  	使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。 
 */
public class Redex_ReplaceDemo {
	public static void main(String[] args) {
		//定义一个字符串
		String s="alsdj lk123132asd 21654";
		
		//定义规则
		String regex="\\d";
		//String类的public String replaceAll(String regex,String replacement)
		String ss="*";
		String result=s.replaceAll(regex, ss);
		System.out.println(result);
	}

}
