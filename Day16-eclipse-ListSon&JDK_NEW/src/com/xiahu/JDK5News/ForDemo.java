package com.xiahu.JDK5News;

import java.util.ArrayList;

/*
 * JDK5�������ԣ��Զ���װ��,����,��ǿfor,��̬����,�ɱ����,ö��
 * 
 * ��ǿfor:��forѭ����һ�֡�
 * 
 * ��ʽ��
 * 		for(Ԫ���������� ���� : �������Collection����) {
 *			ʹ�ñ������ɣ��ñ�������Ԫ��
 *   	}
 *   
 * �ô�����������ͼ��ϵı�����
 * 
 * �׶ˣ� ��ǿfor��Ŀ�겻��Ϊnull��
 * ��ν����?����ǿfor��Ŀ���Ƚ��в�Ϊnull���жϣ�Ȼ����ʹ�á�
 */
public class ForDemo {
	public static void main(String[] args) {
		int[] i={1,2,3,4,5};
		for(int x=0;x<i.length;x++){
			System.out.println(i[x]);
		}
		System.out.println("--------");
		
		//��ǿFor()
		for(int s:i){
			System.out.println(s);
		}
		System.out.println("--------");
		
		String[] name={"�����","������","�����","������"};
		//��ǿFor()
		for(String s:name){
			System.out.println(s);
		}
		System.out.println("-------");
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("���Ƴ�");
		al.add("�ƺ���");
		al.add("���ϵ�");
		for(String s:al){
			System.out.println(s);
		}
	}

}
