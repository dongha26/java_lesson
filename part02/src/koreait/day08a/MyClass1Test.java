package koreait.day08a;

import koreait.day08.MyClass1;
import koreait.day08.Score;

public class MyClass1Test {

	public static void main(String[] args) {
		//MyClass1 ��ü ����
		MyClass1 my = new MyClass1();
		Score score = new Score();
		//MyClass1 Ŭ������ �ʵ� �� ����� �� �ִ°���?
//		my.name = "momo";
		my.point = 1.234;
//		my.age=23; ���� private ������ �ʵ�
//		my.setAge(23); // private �ʵ尪 ����(����)�ϴ� �޼ҵ� : setter
//		System.out.println("age = "+my.age); ���� private ������ �ʵ�
//		System.out.println("age = "+my.getAge()); //private �ʵ尪 �о���� �޼ҵ� : getter
//		my.setAge(-100);
//		System.out.println("age = "+my.getAge()); //private �ʵ尪 �о���� �޼ҵ� : getter
		System.out.println("point = "+my.point);  // public ������ �ʵ�
//		System.out.println("name = "+my.name);  // package �⺻ ������ �ʵ�
	}

}
