package com.xiahu.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * ����¼�������ݣ���0������Ҫ���ڿ���̨������������е����ֵ
 * 
 * ������
 * 		A:��������¼�����ݶ���
 * 		B:����¼��������,���ǲ�֪�����ٸ��������ü��ϴ洢
 * 		C:��0����,����򵥣�ֻҪ����¼���������0���ҾͲ�����¼��������
 * 		D:�Ѽ���ת������
 * 		E:����������
 * 		F:��ȡ�������е����������ֵ
 */
public class ScannerDemo {
	public static void main(String[] args) {
		// A:��������¼�����ݶ���
		Scanner sc = new Scanner(System.in);
		
		//B:����¼��������,���ǲ�֪�����ٸ��������ü��ϴ洢
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		//C:��0����,����򵥣�ֻҪ����¼���������0���ҾͲ�����¼��������
		while(true){
			System.out.println("����������");
			int number=sc.nextInt();
			if(number!=0){
				list.add(number);
			}else{
				break;
			}
		}
		//D:�Ѽ���ת������
		//public <T> T[] toArray(T[] a)
		Integer[] i=new Integer[list.size()];
		// Integer[] ii = array.toArray(i);
		list.toArray(i);
		
		//����������
		Arrays.sort(i);
		
		//��ȡ�������е����������ֵ
		System.out.println("������:"+arrayToString(i)+"���ֵ��:"+i[i.length-1]);		
	}
	
	public static String arrayToString(Integer[] i){
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(int x=0;x<i.length;x++){
			if(x==i.length-1){
				sb.append(i[x]);
			}else{
				sb.append(i[x]).append(", ");
			}
		}
		sb.append("]");
		
		return sb.toString();
	}
}
