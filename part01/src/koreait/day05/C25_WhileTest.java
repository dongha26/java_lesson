package koreait.day05;

import java.util.Scanner;

public class C25_WhileTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello!("+(i+1)+")");
		}
		// while�� ����
		// loop counter ���� ����
		int j=0;
		while(j<5) {
			System.out.println("Hello!("+(j+1)+")");
			j++;
		}
		int k=0,sum=0;
		System.out.println("\n\n �Է��� ������ ��� �����ִ� ���� �Դϴ�.(���� -1)");
		while(k!=-1) {
			System.out.println("�����Է� : ");
			k = sc.nextInt();
			if(k!=-1)
			sum+=k;
		}
		System.out.println("sum = "+sum);
		sum =0;
		k = 0;
		System.out.println("\n\n �Է��� ������ ��� �����ִ� ���� �Դϴ�(ver2).(���� -1)");
		do {
			sum +=k;
			System.out.println("�����Է� : ");
			k = sc.nextInt();
			
		}while(k!=-1); // ������ �ڿ��� �˻��ϴ� ��ɹ��Դϴ�.
		System.out.println("sum = "+sum);
		
		System.out.println("\n\n �Է��� ������ ��� �����ִ� ���� �Դϴ�(ver2.1).(���� -1)");
		while(true) {
			System.out.println("�����Է� : ");
			if(k==-1)break; // �׻� ���� �� Ż��(����) ���ǰ� break�� ����մϴ�
			sum+=k;
		}
		System.out.println("\n\n �Է��� ������ ��� �����ִ� ���� �Դϴ�(ver2.2).(���� -1)");
		boolean isState = true;
		while(isState) {
			System.out.println("�����Է� : ");
			k=sc.nextInt();
			if(k==-1)isState = false;
			else sum+=k;
		}
		System.out.println("sum = "+sum);
		
		sum=0;
		System.out.println("\n\n �Է��� ������ ��� �����ִ� ���� �Դϴ�(ver2.3).(���� -1)");
		while(true) {
			System.out.println("���� �Է� >>>");
			k= sc.nextInt();
			if(k==-1)break;
			if(k%10==0)continue; // �Ʒ� ��ɾ� �������� �ʰ� �ݺ� ó������
			sum+=k;
		}System.out.println("sum = "+sum);
		sc.close();
	}

}
