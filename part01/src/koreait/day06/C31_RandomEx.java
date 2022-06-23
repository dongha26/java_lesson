package koreait.day06;

import java.util.Arrays;
import java.util.Random;
//����
public class C31_RandomEx {

	public static void main(String[] args) {
		/*
		 * �л� ����(����) ���� ������ ����ϴ�
		 * �л� �ο��� 100�� - ������ ���������� �׽�Ʈ(0<=����<=100)
		 * 90~100 :0 �� (0.0%) ī��Ʈ���� 5�� �ʿ��մϴ�
		 * 80~89 :0 �� (0.0%)		�� counts[5] : 
		 * 70~79 :0 �� (0.0%)
		 * 60~69 :0 �� (0.0%)
		 * 60�� �̸� :0 �� (0.0%)
		 * 
		 */
		Random r = new Random();
		int koreans[] = new int[100];
		int[] counts = new int[5];
		for (int i = 0; i<koreans.length;i++) {
			koreans[i] = r.nextInt(101);
		}// ���� ���� count�ϱ� : 0<= ����<=100 ������ ��������Ƿ� ���ǽĿ��� �˻����� �ʾƵ� �˴ϴ�
		System.out.println(Arrays.toString(koreans));
		for (int i = 0; i < koreans.length; i++) { 
			koreans[i]= r.nextInt(101);

			if(90<=koreans[i]) {
				counts[0]++;
			}
			else if(80<=koreans[i]) {
				counts[1]++;
			}
			else if(70<=koreans[i]) {
				counts[2]++;
			}
			else if(60<=koreans[i]) {
				counts[3]++;
			}
			else counts[4]++;
			
		}

		System.out.println("90~100 \t80~89\t70~79\t60~69\t60�̸�");
		System.out.println("-----------------------------------------------------------");
		for (int i = 0; i < counts.length; i++) {
			System.out.printf("%5d",counts[i]);
		}
		System.out.println();
		for (int i = 0; i < counts.length; i++) {
			System.out.printf("%5.1f%%",(double)counts[i]/koreans.length*100);
		}

		}

	}

	
	
