package koreait.day05;

import java.util.Iterator;
import java.util.Scanner;

public class C24_StartPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[[영화감상후기]]");
		System.out.println("평점을 몇 점 주시겠습니까?(1~5)>>>");
		int count = sc.nextInt();
		
		System.out.println("방법1");
		for (int i = 0; i < count; i++) {
			System.out.print("★");
		}
		System.out.println("\n\n방법2");
		for (int i = 0; i < count; i++) {
			System.out.print("★");
		}
		for (int i = 0; i < 5-count; i++) {
			System.out.print("☆");
		}
		System.out.println("\n\n방법2_");
		for (int i = 0; i < 5; i++) {
			if(i<count) {
				System.out.print("★");
			}else {
				System.out.print("☆");
			}
		}
		System.out.println("\n\n방법2__");
		int k;
		for (k = 0; k < count; k++) { 
			System.out.print("★");
		}
		for(;k<5;k++) { 
			System.out.print("☆");
		}
		}
	}


