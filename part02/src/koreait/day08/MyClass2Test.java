package koreait.day08;

import java.util.Scanner;

public class MyClass2Test {
// �ϰ���� ������ �غ�����
	public static void main(String[] args) {
		MyClass2 mc1 = new MyClass2();
		// 		 Ŀ���� �����ڸ� �����ϸ� �⺻���� �� �� �ִ� �⺻�����ڰ�
		// 		����� �� ���� �˴ϴ�. -> ���� �����մϴ�.
		MyClass2 mc22 = new MyClass2("���");
		System.out.println("mc1 name : "+mc1.getName());
		System.out.println("mc22 name : "+mc22.getName());
		
		//mc1 ��ü�� �⺻�����ڸ� ����ϸ� name �ʵ尪 �ʱ�ȭ�� ���մϴ�.(��������)
		// �⺻ �����ڸ� ������� �ʴ� ����
		//Scanner sc = new Scanner();
	}

}
