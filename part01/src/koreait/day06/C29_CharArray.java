package koreait.day06;

import java.util.Arrays;

public class C29_CharArray {
// char �迭�� Ư¡ �� ���ڿ����� ������ ���� �ľ��ϱ�!
//    - char ���� 2����Ʈ ������ �����Ͽ� ����(���)�� �����
	public static void main(String[] args) {
		char[] carr1 = {'i','a','m',' ','j','a','v','a'};
		char[] carr2 = new char[20];
		System.out.println("[[[[ char �迭 �׽�Ʈ]]]]");
		System.out.println("carr1 : "+Arrays.toString(carr1));
		System.out.println("carr1 : "+Arrays.toString(carr2));
		System.out.println("carr1 �迭 ����(ũ��)"+carr1.length);
		System.out.println("carr1 �迭 ����(ũ��)"+carr2.length);
		
		System.out.println("carr1 �迭 3��° �������� �� (����)" + carr1[2]);
		System.out.println("carr2 �迭 3��° �������� �� (����)" + carr2[2]);

		System.out.println("carr1 �迭 3��° �������� �� (����)" + (int)carr1[2]);
		System.out.println("carr2 �迭 3��° �������� �� (����)" + (int)carr2[2]);
		System.out.println();
		System.out.println("1. for������ ���");
		for (int i = 0; i < carr1.length; i++) {
			System.out.println("carr1["+i+"] �� ������ �� : "+carr1[i]);
		}
		System.out.println("\n2. for���������");
		for (int i = 0; i < carr1.length; i++) {
			System.out.print(carr1[i]);
		}
		System.out.println("\n3. �迭�̸�(����������)���� ���");
			System.out.print(carr1);
	
		String msg = "iam java";
		System.out.println(msg);
		
		System.out.println("\n[[[[ char �迭 �׽�Ʈ]]]]");
		System.out.println("4. ���ڿ��� �迭�� ����");
		carr2="hello hi goodbye".toCharArray();
		System.out.println(carr2);
		System.out.println(carr2[2]);
		System.out.println("carr2.length :"+carr2.length);
		
		carr2="hello hi goodbye hi goodbye".toCharArray(); // ���ڿ��� ����� �迭ũ�⺸�� ũ��
		System.out.println(carr2);
		System.out.println(carr2[2]);
		System.out.println("carr2.length :"+carr2.length);
		
		String temp = String.valueOf(carr2); 	//char[] �迭�� ���ڿ��� ��ȯ
												//String ��ü�� toCharArray()�޼ҵ�� �ݴ�
		//���� : String.valueOf �޼ҵ�� �������� �Ű����� ������ �ٷ�ϴ�.(�޼ҵ� overloading)
//		System.out.println("String.valueOf(carr2) : "+String.valueOf(obj));
	}

}
