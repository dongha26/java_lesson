package koreait.day03;

import java.util.Scanner;

public class C13_MaxMinEx {

	public static void main(String[] args) {
	//�赿��
	Scanner sc = new Scanner(System.in);
	int n1;
	int n2;
	int n3;
	int max;
	int min;
	System.out.print("ù��° ������ �Է��ϼ��� ");
	n1 =sc.nextInt();
	System.out.print("ù��° ������ �Է��ϼ��� ");
	n2 =sc.nextInt();
	System.out.print("ù��° ������ �Է��ϼ��� ");
	n3 =sc.nextInt();
	if(n1>=n2 && n1 >=n3) {
		max = n1;
	}else if(n2>=n1 && n2>=n3){
		max = n2;
	}else {
		max=n3;
	}
	System.out.println("���� ū ���� "+max+" �Դϴ�");
	
	System.out.print("ù��° ������ �Է��ϼ��� ");
	n1 =sc.nextInt();
	System.out.print("ù��° ������ �Է��ϼ��� ");
	n2 =sc.nextInt();
	System.out.print("ù��° ������ �Է��ϼ��� ");
	n3 =sc.nextInt();
	if(n1<=n2 && n1 <=n3) {
		min = n1;
	}else if(n2<=n1 && n2<=n3){
		min = n2;
	}else {
		min=n3;
	}
	System.out.println("���� ���� ���� "+min+" �Դϴ�");
}

	

}
