package koreait.day03;

import java.util.Scanner;

public class C16_SwithTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// swith문은 if ~ else if를 대신하는 명령문입니다
		int item_no;
		int pay = 0;
//		System.out.println("상품목록 : 1.🍕🍕 2200원 2.🌭🌭🌭🌭1900원  3.🌭🌭🌭🌭3600원 4.🥙🥙🥙🥙2870원 ");
//		System.out.println("상품번호를 선택해서 장바구니에 넣으세요. >>>");
//		item_no = sc.nextInt();
//		
//		switch (item_no) { //if문에서 조건식 작성 했을 때와 같이 비교할 변수
//		case 1:
//			pay = 2200;
//			
//			break;
//			
//		case 2 :
//			pay = 1900;
//			
//			break;
//		
//		case 3 :
//			pay = 3600;
//			
//			break;
//		
//		case 4 :
//			pay = 2870;
//			
//			break;
//		default:
//			System.out.println("상품선택이 잘못되었습니다");
//			pay = 99999;
//			break;
//		}
//		
//		System.out.println("결제금액은" + pay + "입니다");
		
		
		//위의 switch 문을 if~else if로 바꿔보세요
		System.out.println("상품목록 : 1.🍕🍕 2200원 2.🌭🌭🌭🌭1900원  3.🌭🌭🌭🌭3600원 4.🥙🥙🥙🥙2870원 ");
		System.out.println("상품번호를 선택해서 장바구니에 넣으세요. >>>");
		item_no = sc.nextInt();
		
		if(item_no == 1) {
			pay = 2200;
		}else if(item_no == 2) {
			pay = 1900;
		}else if(item_no == 3) {
			pay = 3600;
		}else if(item_no == 4) {
			pay = 2870;
		}else System.out.println("잘못선택하셨습니다");
		System.out.println("결제금액2는 " + pay + " 원 입니다");
	}

}
