package koreait.ext;

import java.util.Scanner;

public class BinaryTest2 {

	public static void main(String[] args) {
		int n10 =123;
		int n16 =0xa41c; // 16����ǥ��
		int n2 = 0b1010010000011100;
		
		System.out.println("���� �״�� ����ϱ�");
		System.out.println("10����"+n10);
		System.out.println("16���� 0xa41c: "+n16);
		System.out.println("2���� 0b1010010000011100: "+n2);
	
		System.out.println("2. format ����");
		System.out.println(String.format("16���� ���ͷ� 0xa41c %x", n16));
		System.out.println(String.format("2���� ���ͷ� 0b1010010000011100%x", n2));
		System.out.println(String.format("10���� ���ͷ� 42012 %x", 42012));
	//��� 10���� 42012 , n16�� n2���� ���� �޸𸮿� ����� ���� ��� ������ 0,1 ǥ�����Դϴ�
		System.out.println("3. -1�� 2����, 16���� ǥ��Ȯ��");
		 n16 = 0xffffffff;
		System.out.println(n16);
		System.out.printf("-1�� 16���� %x\n",-1);
		System.out.println("2���� : "+Integer.toBinaryString(-1));	
		System.out.println("34. �Է��� 2���� 16���� ���� 10������ �ٲپ� �帳�ϴ�");
		Scanner sc = new Scanner(System.in);
		System.out.print("2���� �Է��ϼ��� >>>");
		String t2 = sc.nextLine();	
		System.out.print("16���� �Է��ϼ��� >>>");
		String t16 = sc.nextLine();	
// ������ Integer.parseInt(s) �����̾��� s���ڿ��� 10���� ǥ���̶�� �ǹ��Դϴ�. 
		System.out.println(String.format("2���� %s�� 10���� %d �Դϴ�", 
				t2,Integer.parseInt(t2, 2))); //t2�� 2���� -> �޼ҵ� ��� ������
		System.out.println(String.format("16���� %s�� 10���� %d �Դϴ�", 
				t16,Integer.parseInt(t16, 16))); // t16�� 16������. ->�޼ҵ��� ������
						// ������ -��ȣ �Ἥ ���밪 �����ʴ� �������� ���ڿ� �Է�
	
	}			

}
/*
 * n���� ���ڿ� -> 10���� ������ ��ȯ Integer.parseInt(���ڿ�,n)
 * 10���� ������ -> n���� ���ڿ� Integer.toBinaryString �޼ҵ�,toHexString�޼ҵ� 
 * 
 * format���� %d�� 10���� , %x�� 16����,%o�� 8���� ����� 2������ �������� �����ϴ�
 * 
 * 2������ ��Ʈ���� : &,|,^,~,>>,<< ���
 */