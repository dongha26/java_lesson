package koreait.day03;

import java.util.Scanner;

public class C08_KeyInputTest {

	public static void main(String[] args) {
	//�赿��
	int width;
	int height;
	double half;
	final double pi = 3.14;
	Scanner sc = new Scanner(System.in);
	System.out.print("�簢���� ���θ� �Է��ϼ��� : ");
	width =sc.nextInt();
	System.out.print("�簢���� ���θ� �Է��ϼ��� : ");
	height = sc.nextInt();
	System.out.println("�簢���� ���̴� : "+  width*height + "�Դϴ�");
	System.out.println();
	

	System.out.print("���� �������� �Է��ϼ��� ");
	half = sc.nextDouble();
	System.out.print("�ѷ��� : " + 2*pi*half + "�Դϴ�\n");
	System.out.print("���̴� : " + pi*half*half + "�Դϴ�");
	sc.close();
	}

}
