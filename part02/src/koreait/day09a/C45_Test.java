package koreait.day09a;

import koreait.day09b.ClassAB;

public class C45_Test {

	//������ ������ ���� �׽�Ʈ�� ���� �ֽ��ϴ�.
		public static void main(String[] args) {
			ClassAA test1 = new ClassAA();
			ClassAB test2 = new ClassAB();
			test1.ab = 123;		//test1�� �����ϴ� ��ü�� ��ӹ��� �ʵ�
			test1.name = "hong";// "
			// ��ӹ��� �޼ҵ�
			test1.print();
			// ClassAA���� ���ǵ� �޼ҵ�
			test1.test();
			test2.test();
			System.out.println(test2.getName());
		}
	}


