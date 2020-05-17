package com.xiahu.Arrays;

/**
 * @author Administrator
 *  选择排序
 */
public class Array_XuanZe {
	public static void main(String[] args) {
		//定义数组
		int[] arr={23,65,78,95,43};
		printlnArray(arr);
		//选择排序数组
		for(int x=0;x<arr.length;x++){
			for(int y=x+1;y<arr.length;y++){
				if(arr[y]<arr[x]){
					int temp=arr[x];
					arr[x]=arr[y];
					arr[y]=temp;
				}
			}
		}
		printlnArray(arr);
	}
	
	
	//遍历功能
    public static void printlnArray(int[] arr){
    System.out.print("[");
    for(int x= 0;x<arr.length;x++){
    	if(x==arr.length-1){
    		System.out.print(arr[x]+"]");
    	}else{
    		System.out.print(arr[x]+", ");
    	}
    }
    System.out.println();
    }

}
