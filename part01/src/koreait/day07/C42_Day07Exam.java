package koreait.day07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C42_Day07Exam {
//김동하
	public static void main(String[] args) {
		Random r = new Random();
		int[]math= new int[10];
		int[]n1 = new int[10];
		int[]n2 = new int[10];
		int count =0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < math.length; i++) {
			int nums = r.nextInt(90)+10;	
			int nums2 = r.nextInt(90)+10;
			System.out.print("문제"+(i+1)+". "+ nums +"+"+ nums2 +" 답 입력 : ");
			int d= sc.nextInt();
			math[i] = d;
			n1[i] = nums;
			n2[i] = nums2;
			
		}
		for (int i = 0; i < math.length; i++) {
			if(math[i]== n1[i]+n2[i]) {
				count++;
			}
		}
		System.out.println("--------------------------------------");
		System.out.println("채점합니다 맞은 갯수 : "+count);
		System.out.println("틀린 문제 정답 보기");
		for (int i = 0; i < math.length; i++) {
			if(math[i]!= n1[i]+n2[i]) {
				System.out.println("문제"+(i+1)+".\t"+n1[i]+"+"+n2[i]+"="+(n1[i]+n2[i]));
			}
		}
		
	}

}
