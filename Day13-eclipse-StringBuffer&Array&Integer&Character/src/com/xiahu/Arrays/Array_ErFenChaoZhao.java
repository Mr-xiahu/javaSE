package com.xiahu.Arrays;

/**
 * @author Administrator
 *  ���ң�
 * 		��������:����Ԫ������(��ͷ�ҵ�β)
 * 		���ֲ���(�۰����):����Ԫ������
 * 
 * ������
 * 		A:���������������С����
 * 		B:������м�����
 * 		C:���м�������ֵ��Ҫ���ҵ�ֵ���бȽ�
 * 			��ȣ��ͷ��ص�ǰ���м�����
 * 			����ȣ�
 * 				��	�����
 * 				С	�ұ���
 * 		D:���¼�����м�����
 * 			��	�����
 * 				max = mid - 1;
 * 			С	�ұ���
 * 				min = mid + 1;
 * 		E:�ص�B
 *  
 */
public class Array_ErFenChaoZhao {
	public static void main(String[] args) {
		//��������
		int[] arr = {11,22,33,44,55,66,77};
		int s=getIndex(arr, 33);
		System.out.println(s);
		
		
	}
	
	/*
	 * ������ȷ��
	 * ����ֵ���ͣ�int
	 * �����б�int[] arr,int value
	 */
	public static int getIndex(int[] arr,int value){
		//���������������С����
		int max = arr.length -1;
		int min = 0;
		
		//������м�����
		int mid = (max +min)/2;
		
		//���м�������ֵ��Ҫ���ҵ�ֵ���бȽ�
		while(arr[mid] != value){
			if(arr[mid]>value){
				max = mid - 1;
			}else if(arr[mid]<value){
				min = mid + 1;
			}
			
			//�����ж�
			if(min > max){
				return -1;
			}
			
			mid = (max +min)/2;
		}
		
		return mid;
	}
		
	

}
