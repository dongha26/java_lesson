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
	System.out.print("ù��° ������ �Է��ϼ��� ");
	n1 =sc.nextInt();
	System.out.print("ù��° ������ �Է��ϼ��� ");
	n2 =sc.nextInt();
	System.out.print("ù��° ������ �Է��ϼ��� ");
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
	System.out.println("���� ū ���� "+max+" �Դϴ�\n ���� ���� ���� "+min+"�Դϴ�");
}
}
