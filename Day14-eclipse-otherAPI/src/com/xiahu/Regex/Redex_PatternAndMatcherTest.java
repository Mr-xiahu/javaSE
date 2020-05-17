package com.xiahu.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Administrator 获取功能： 获取下面这个字符串中由三个字符组成的单词 da jia ting wo shuo,jin tian
 *         yao xia yu,bu shang wan zi xi,gao xing bu?
 *         
 *         调用group()之前，必须先调用find()方法，有group()返回
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
		// 定义字符串
		String s = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";

		// 规则
		String regex = "\\b\\w{4}\\b";
		
		//把规则编译成模式对象
		Pattern p=Pattern.compile(regex);
		
		//通过模式对象得到匹配器对象
		Matcher m=p.matcher(s);
		//调用匹配器对象的功能
		//通过find方法查找有没有满足的子串
		//public boolean find();
//		boolean flag=m.find();
//		System.out.println(flag);
//		//如何得到这个值呢？
//		//public String group();
//		String ss=m.group();
//		System.out.println(ss);
		while(m.find()){
			String ss=m.group();
			System.out.println(ss);
		}
	}

}
