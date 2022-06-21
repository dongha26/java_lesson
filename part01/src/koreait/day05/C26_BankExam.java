package koreait.day05;

import java.util.Scanner;
/*
 * GUI : Graphic User Interface
 * CLI : Command Line Interface
 */

public class C26_BankExam {
	// CLI ����� �޴� ������ while������ ����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run =true;
		int sel;
		int balance =0;
		
		while(run) {
			int money;
			System.out.println("-----------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� Ȯ�� | 4.����");
			System.out.println("-----------------------");
			System.out.println("�޴����� >>>");
			sel = sc.nextInt();
		switch(sel) {
		case 1: // ����ó�� (���ݱݾ� �Է�->�ܾ׿����ϱ�)
			System.out.println("���ݾ� >");
			money = sc.nextInt();
			balance+=money;
			System.out.println("������ �ܾ��� "+balance+"�� �Դϴ�");
			break;
		
		case 2 :
			System.out.println("��ݾ� >");
			money = sc.nextInt();
			if(money<balance) {
				balance-=money;
			}else {System.out.println("���� �ܾ׺��� ū �ݾ��� ����� �� �����ϴ�");break;
			}
			
		case 3 : 
		System.out.println("���� �ܰ� : "+balance);
		System.out.println();
		break;
		case 4 : 
			System.out.println("���α׷��� �����մϴ�.");
			run= false;
			break;
		default : 
			System.out.println("�߸��� �����Դϴ� ���� 1~4�� �� �����ϼ���");
			}
		}

	}

}
