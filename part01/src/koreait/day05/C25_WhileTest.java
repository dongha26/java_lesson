package koreait.day05;

import java.util.Scanner;

public class C25_WhileTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello!("+(i+1)+")");
		}
		// while문 형식
		// loop counter 변수 선언
		int j=0;
		while(j<5) {
			System.out.println("Hello!("+(j+1)+")");
			j++;
		}
		int k=0,sum=0;
		System.out.println("\n\n 입력한 정수를 모두 더해주는 계산기 입니다.(종료 -1)");
		while(k!=-1) {
			System.out.println("점수입력 : ");
			k = sc.nextInt();
			if(k!=-1)
			sum+=k;
		}
		System.out.println("sum = "+sum);
		sum =0;
		k = 0;
		System.out.println("\n\n 입력한 정수를 모두 더해주는 계산기 입니다(ver2).(종료 -1)");
		do {
			sum +=k;
			System.out.println("점수입력 : ");
			k = sc.nextInt();
			
		}while(k!=-1); // 조건을 뒤에서 검사하는 명령문입니다.
		System.out.println("sum = "+sum);
		
		System.out.println("\n\n 입력한 정수를 모두 더해주는 계산기 입니다(ver2.1).(종료 -1)");
		while(true) {
			System.out.println("점수입력 : ");
			if(k==-1)break; // 항상 참일 때 탈출(종료) 조건과 break문 사용합니다
			sum+=k;
		}
		System.out.println("\n\n 입력한 정수를 모두 더해주는 계산기 입니다(ver2.2).(종료 -1)");
		boolean isState = true;
		while(isState) {
			System.out.println("점수입력 : ");
			k=sc.nextInt();
			if(k==-1)isState = false;
			else sum+=k;
		}
		System.out.println("sum = "+sum);
		
		sum=0;
		System.out.println("\n\n 입력한 정수를 모두 더해주는 계산기 입니다(ver2.3).(종료 -1)");
		while(true) {
			System.out.println("점수 입력 >>>");
			k= sc.nextInt();
			if(k==-1)break;
			if(k%10==0)continue; // 아래 명령어 실행하지 않고 반복 처음으로
			sum+=k;
		}System.out.println("sum = "+sum);
		sc.close();
	}

}
