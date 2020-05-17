package com.xiahu.StringBuffer;

/**
 * @author Administrator
 *  数组拼接成字符串
 */
public class StringBufferTest {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr={21,23,56,84,91};
		
		// 定义功能
		// 方式1：用String做拼接的方式
		String s1=arrayToString(arr);
		System.out.println(s1);
		
		//方式2:用StringBuffer做拼接方式
		String s2=arrayToString2(arr);
		System.out.println(s2);
	}
	
	//用String做拼接的方式
	public static String arrayToString(int[] arr){
		String s="";
		s+="[";
		for(int x=0;x<arr.length;x++){
			if(x==arr.length-1){
				s+=arr[x];
			}else{
				s+=arr[x];
				s+=", ";
			}
		}
		s+="]";
		return s;
	}
	
	//用StringBuffer做拼接的方式
	public static String arrayToString2(int[] arr){
		StringBuffer sb=new StringBuffer();
		sb.append("[");
		for(int x=0;x<arr.length;x++){
			if(x==arr.length-1){
				sb.append(arr[x]);
			}else{
				sb.append(arr[x]);
				sb.append(", ");
			}
		}
		sb.append("]");
		
		return sb.toString();
	}

}
