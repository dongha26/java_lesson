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
	System.out.print("���� ���� : ");
	korean = sc.nextInt();
	System.out.print("���� ���� : ");
	english = sc.nextInt();
	System.out.print("���� ���� : ");
	science = sc.nextInt();
	System.out.println("������"+(korean+english+science)+"�� �Դϴ�");
	System.out.printf("����� %d (%.2f)   ����� : 3\n",(korean+english+science)/3,(double)(korean+english+science)/3);
	if(korean>english) {
		max = korean;
		best="����";
	}else {
		max = english;
		best = "����";
	}if(max<science) {
		max=science;
		best = "����";
	}
	System.out.printf("�� �л��� Ư������� %s %d�� �Դϴ�",best,max);
	}

}
