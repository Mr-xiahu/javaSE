package com.xiahu.String;

import java.util.Scanner;

public class UserAndPasswordLogin {

	/**
	 * @param args
	 * ģ���½�û�
	 */
	public static void main(String[] args) {
		//����ԭ�����û���������
		String username="admin";
		String passwoed="admin";
		
		//�������ε�½�Ļ���   ��forѭ�h��ʾ
		for(int x=0;x<3;x++){
			
		
		//�������¼���¼�
		Scanner sc=new Scanner(System.in);
		System.out.println("�������û���");
		String name=sc.nextLine();
		System.out.println("����������");
		String pwd=sc.nextLine();
		
		//�жϵ�½�Ƿ�ɹ�
		if(name.equals(username)&&pwd.equals(passwoed)){
			System.out.println("��ϲ���½�ɹ�");
			System.out.println("�������ڿ�ʼ�������Ϸ");
			GressNumberGame.start();
			break;
		}else{
			if((2-x)==0){
				System.out.println("����˺ű�����,���ڹ���Ա��ϵ");
			}else{
			System.out.println("��½ʧ�ܣ��㻹��"+(2-x)+"�λ���");
			}
		}
		}

	}

}
