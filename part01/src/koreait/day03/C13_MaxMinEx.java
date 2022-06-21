package koreait.day03;

import java.util.Scanner;

public class C13_MaxMinEx {

	public static void main(String[] args) {
	//김동하
	Scanner sc = new Scanner(System.in);
	int n1;
	int n2;
	int n3;
	int max;
	int min;
	System.out.print("첫번째 정수를 입력하세요 ");
	n1 =sc.nextInt();
	System.out.print("첫번째 정수를 입력하세요 ");
	n2 =sc.nextInt();
	System.out.print("첫번째 정수를 입력하세요 ");
	n3 =sc.nextInt();
	if(n1>=n2 && n1 >=n3) {
		max = n1;
	}else if(n2>=n1 && n2>=n3){
		max = n2;
	}else {
		max=n3;
	}
	System.out.println("가장 큰 값은 "+max+" 입니다");
	
	System.out.print("첫번째 정수를 입력하세요 ");
	n1 =sc.nextInt();
	System.out.print("첫번째 정수를 입력하세요 ");
	n2 =sc.nextInt();
	System.out.print("첫번째 정수를 입력하세요 ");
	n3 =sc.nextInt();
	if(n1<=n2 && n1 <=n3) {
		min = n1;
	}else if(n2<=n1 && n2<=n3){
		min = n2;
	}else {
		min=n3;
	}
	System.out.println("가장 작은 값은 "+min+" 입니다");
}

	

}
