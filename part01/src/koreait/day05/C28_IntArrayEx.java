package koreait.day05;

import java.util.Arrays;
import java.util.Scanner;

public class C28_IntArrayEx {
	/* �赿��
	 * 1. int �迭ũ�� 5�� �����ϼ��� 
	 * 2. �迭 ����� ���� ����� �Է����� �����մϴ�.
	 * 3. �Էµ� ���� �հ�, ����� ���մϴ�
	 * 4. �Էµ� ���� �ִ밪, �ּҰ��� ���ϴ� �޼ҵ带 ����ϴ�.
	 * 		�� maxOfArray minOfArray : ���ڴ� int �迭
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score=0;
		int[] nums = new int[5];
		double avg;
		int max=nums[0];
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print("�迭�� ���� �Է��ϼ��� :");
			int num = sc.nextInt();
			nums[i]= num;
			score+=num;
		}
		System.out.println(Arrays.toString(nums));
		int min=nums[0];
		for(int i=1;i<nums.length;i++)
			if(min>nums[i]) min=nums[i];
		
		System.out.println("main min="+ min);
		
		System.out.println("���� " +score+" �����"+score/3);
		maxOfArray(nums);
		
		minOfArray(nums);
	}
	public static int maxOfArray(int[]nums) {
		int max=nums[0];
		for (int i = 0; i < nums.length; i++) {
			if(max<nums[i]) {
				max= nums[i];
			}
			}System.out.println("�ִ밪 " +max);
			return max;
	}
	public static int minOfArray(int[]nums) {
		int min=nums[0];
		for (int j = 0; j < nums.length; j++) {		
			if(min>nums[j]) {
				min= nums[j];
			}
			}System.out.println("�ּҰ� "+min);
		return min;

	}
	}


	// max,min�� �迭�� 0�� ��Ұ����� �ʱ�ȭ�մϴ�
	// �迭��� 1������ ������ ��ұ��� max,min�� ������� ����ؼ�
	// max�� �װ����� ������ (min�� �� ������ ũ��)max(min) ���� �迭 ��Ұ����� �����մϴ�
	// -> �񱳰� ������ ���� max,min �����̵˴ϴ�.

