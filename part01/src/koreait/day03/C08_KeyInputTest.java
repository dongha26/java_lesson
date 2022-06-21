package koreait.day03;

import java.util.Scanner;

public class C08_KeyInputTest {

	public static void main(String[] args) {
	//김동하
	int width;
	int height;
	double half;
	final double pi = 3.14;
	Scanner sc = new Scanner(System.in);
	System.out.print("사각형의 가로를 입력하세요 : ");
	width =sc.nextInt();
	System.out.print("사각형의 세로를 입력하세요 : ");
	height = sc.nextInt();
	System.out.println("사각형의 넓이는 : "+  width*height + "입니다");
	System.out.println();
	

	System.out.print("원의 반지름을 입력하세요 ");
	half = sc.nextDouble();
	System.out.print("둘레는 : " + 2*pi*half + "입니다\n");
	System.out.print("넓이는 : " + pi*half*half + "입니다");
	sc.close();
	}

}
