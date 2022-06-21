package koreait.day05;

import java.util.Scanner;
/*
 * GUI : Graphic User Interface
 * CLI : Command Line Interface
 */

public class C26_BankExam {
	// CLI 방식의 메뉴 선택을 while문으로 연습
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run =true;
		int sel;
		int balance =0;
		
		while(run) {
			int money;
			System.out.println("-----------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 확인 | 4.종료");
			System.out.println("-----------------------");
			System.out.println("메뉴선택 >>>");
			sel = sc.nextInt();
		switch(sel) {
		case 1: // 예금처리 (예금금액 입력->잔액에더하기)
			System.out.println("예금액 >");
			money = sc.nextInt();
			balance+=money;
			System.out.println("고객님의 잔액은 "+balance+"원 입니다");
			break;
		
		case 2 :
			System.out.println("출금액 >");
			money = sc.nextInt();
			if(money<balance) {
				balance-=money;
			}else {System.out.println("남은 잔액보다 큰 금액은 출금할 수 없습니다");break;
			}
			
		case 3 : 
		System.out.println("현재 잔고 : "+balance);
		System.out.println();
		break;
		case 4 : 
			System.out.println("프로그램을 종료합니다.");
			run= false;
			break;
		default : 
			System.out.println("잘못된 선택입니다 값은 1~4번 중 선택하세요");
			}
		}

	}

}
