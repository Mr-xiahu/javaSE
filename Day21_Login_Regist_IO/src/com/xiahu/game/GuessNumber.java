package com.xiahu.game;

import java.util.Scanner;



/**
 * ���ǲ�����С��Ϸ
 * 
 * @author ��СFu
 * @version v1.1
 * 
 */
public class GuessNumber {
	private GuessNumber() {
	}

	public static void start() {
		// ����һ�������
		int number = (int) (Math.random() * 100) + 1;

		// ����һ��ͳ�Ʊ���
		int count = 0;

		while (true) {
			// ����¼������
			Scanner sc = new Scanner(System.in);
			System.out.println("����������(1-100):");
			int guseenum = sc.nextInt();
			count++;

			// �ж�
			if (guseenum > number) {
				System.out.println("��µ�����" + guseenum + "̫����");
			} else if (guseenum > number) {
				System.out.println("��µ�����" + guseenum + "̫С��");
			} else {
				System.out.println("��ϲ��¶��ˣ�" + count + "�ξͲ�����");
				break;
			}

		}
	}

}
