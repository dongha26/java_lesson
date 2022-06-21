package koreait.day03;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
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
	System.out.printf("n1 = %d\t n2 = %d\t n3 = %d\n",n1,n2,n3);
	if(n1>n2) {
		max = n1;
		min = n2;
	}else {
		max = n2;
		min = n1;
	}
	if(max<n3){
		max=n3;
	}
	if(min>n3) {
		min = n3;
	}
	System.out.println("가장 큰 값은 "+max+" 입니다\n 가장 작은 값은 "+min+"입니다");
}
}
