package com.xiahu.Regex;

/**
 * @author Administrator 分割功能练习：
 */
public class Redex_SplitTest {
	public static void main(String[] args) {
		String s1 = "aa,bb,cc";
		String[] str1 = s1.split(",");
		for (int x = 0; x < str1.length; x++) {
			System.out.println(str1[x]);
		}
		System.out.println("--------------");

		String s2 = "aa.bb.cc";
		String[] str2 = s2.split("\\.");
		for (int y = 0; y < str2.length; y++) {
			System.out.println(str2[y]);
		}
		System.out.println("--------------");

		String s3 = "aa    bb                cc";
		String[] str3Array = s3.split(" +");
		for (int x = 0; x < str3Array.length; x++) {
			System.out.println(str3Array[x]);
		}
		System.out.println("---------------------");

		// 硬盘上的路径，我们应该用\\替代\
		String s4 = "E:\\JavaSE\\day14\\avi";
		String[] str4Array = s4.split("\\\\");
		for (int x = 0; x < str4Array.length; x++) {
			System.out.println(str4Array[x]);
		}
		System.out.println("---------------------");

	}

}
