package com.xiahu.Arrays;

/**
 * @author Administrator
 *  ð������
 */
public class Array_MaoPao {
	public static void main(String[] args) {
		//��������
		int[] arr={23,65,78,95,43};
		printlnArray(arr);
		
		//ð������
		for(int x=0;x<arr.length;x++){
			for(int y=0;y<arr.length-1-x;y++){
				if(arr[y]>arr[y+1]){
					int temp=arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=temp;
				}
			}
		}
		printlnArray(arr);
	}
	
	//��������
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
