package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_Lotto {
//�赿��
	public static void main(String[] args) {
		int[]numbers = new int[45]; //�ζǹ�ȣ ���� �������ִ� �迭 45�� ����
		Random r = new Random(); 	// ������ ���� ���� ����Ŭ���� ��������
		
		for (int i = 0; i < 45; i++) {
			numbers[i]=i+1; //���� ���� : 1 ~ 45  -> lotto�迭�� ����Ǵ� ��
		}
		System.out.println("numbers �迭 �ʱⰪ-----------------------------");
		System.out.println(Arrays.toString(numbers)); // �ζ� ��ȣ�� �� �� �ִ� ��ȣ ����
		System.out.println("---------------------------------------------");
		
		int[]lotto = new int[6]; //���õ� 6�� ���ڸ� ���� �迭 ����
		int k; //���õ� ������ ���� �ϳ��� ������ ���� ����
		for (int cnt = 0; cnt < 6; cnt++) {
			k=r.nextInt(45-cnt); //1~45������ ������ ���ڸ� cnt�� 6�϶����� 45���� �ϳ��� �ٿ����� ����k�� ����
			System.out.println("k = "+k+",number = "+numbers[k]); //���õ� k������ �ζǹ�ȣ ������ ���
			lotto[cnt]=numbers[k]; //6���� ���ڸ� ���� �迭�� ���õ� ���� ����
		for (int i = k; i < numbers.length-1; i++){//k�� 6�� ���É�� ���õ� ������ �ߺ��� ���ֱ����ؼ� �迭�� �ϳ��� ���� 
			numbers[i] = numbers[i+1]; //���õ� �迭�� ���ְ� ������ �迭�� ���� �迭�� �ε����� �̵�
		}
		System.out.println(Arrays.toString(numbers)); // ���õ� ���ڿ� ���� ���ڵ� ������� ���
		}
		System.out.print("���� ���� ���� : ");
		System.out.println(Arrays.toString(lotto)); //�������� ���ڸ� ũ�� ������� ���
		Arrays.sort(lotto); //������ ũ�� ������� ����
		System.out.println(Arrays.toString(lotto)); //ũ������� ���ĵ� ���ڸ�  ���
	}

}
