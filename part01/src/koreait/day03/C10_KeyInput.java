package koreait.day03;

import java.util.Scanner;

public class C10_KeyInput {

	public static void main(String[] args) {
	// sc �� �������Դϴ� . �⺻�� ������ �ƴ� Ŭ���� Ÿ���� �����Դϴ�. ->����������
	//  ��  new �������� ����� ��ü�� Ŭ���� �̸��� ���� �̸����� ���� �����մϴ�.
	Scanner sc = new Scanner(System.in);		
	// Ű���� �Է��� ���� ���� ����
	int data;
	System.out.print("������ �Է��ϼ��� ->");
	data = sc.nextInt();  // ����ڷκ��� Ű���� �Է¹ް� �� ���� ������ ��ȯ�Ͽ� data ������ ����
	System.out.println("�Էµ� ���� "+ data + " �Դϴ�");
	
	
	}

}
/*
 * 	ǥ�� ��� : System.out(out�� System Ŭ������ ������ �ʵ�)
 *  ǥ�� �Է� : System.in -> in�� System Ŭ������ ������ �ʵ�
 *  				   -> Scanner Ŭ������ �̿��ؼ� �Է°��� Ư�� �⺻�������� ��ȯ���Ѵ� ��� ���.
 * 					  -> �⺻ ��Ű���� Ŭ������  �ƴϹǷ� import �� �ʿ��մϴ�.	
 * 					*���� : �⺻��Ű�� java.lang�� import ���� ����մϴ�
 */
