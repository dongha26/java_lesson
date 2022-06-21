package koreait.day04;

import java.util.Scanner;

public class C18_RevoewEx {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String best = "";
	int max;
	int korean;
	int english;
	int science; 
	System.out.print("국어 점수 : ");
	korean = sc.nextInt();
	System.out.print("영어 점수 : ");
	english = sc.nextInt();
	System.out.print("과학 점수 : ");
	science = sc.nextInt();
	System.out.println("총점은"+(korean+english+science)+"점 입니다");
	System.out.printf("평균은 %d (%.2f)   과목수 : 3\n",(korean+english+science)/3,(double)(korean+english+science)/3);
	if(korean>english) {
		max = korean;
		best="국어";
	}else {
		max = english;
		best = "영어";
	}if(max<science) {
		max=science;
		best = "과학";
	}
	System.out.printf("이 학생의 특기과목은 %s %d점 입니다",best,max);
	}

}
