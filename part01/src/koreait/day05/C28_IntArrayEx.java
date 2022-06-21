package koreait.day05;

import java.util.Arrays;
import java.util.Scanner;

public class C28_IntArrayEx {
	/* 김동하
	 * 1. int 배열크기 5를 선언하세요 
	 * 2. 배열 요소의 값은 사용자 입력으로 저장합니다.
	 * 3. 입력된 값의 합계, 평균을 구합니다
	 * 4. 입력된 값의 최대값, 최소값을 구하는 메소드를 만듭니다.
	 * 		ㄴ maxOfArray minOfArray : 인자는 int 배열
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score=0;
		int[] nums = new int[5];
		double avg;
		int max=nums[0];
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print("배열의 값을 입력하세요 :");
			int num = sc.nextInt();
			nums[i]= num;
			score+=num;
		}
		System.out.println(Arrays.toString(nums));
		int min=nums[0];
		for(int i=1;i<nums.length;i++)
			if(min>nums[i]) min=nums[i];
		
		System.out.println("main min="+ min);
		
		System.out.println("합은 " +score+" 평균은"+score/3);
		maxOfArray(nums);
		
		minOfArray(nums);
	}
	public static int maxOfArray(int[]nums) {
		int max=nums[0];
		for (int i = 0; i < nums.length; i++) {
			if(max<nums[i]) {
				max= nums[i];
			}
			}System.out.println("최대값 " +max);
			return max;
	}
	public static int minOfArray(int[]nums) {
		int min=nums[0];
		for (int j = 0; j < nums.length; j++) {		
			if(min>nums[j]) {
				min= nums[j];
			}
			}System.out.println("최소값 "+min);
		return min;

	}
	}


	// max,min를 배열의 0번 요소값으로 초기화합니다
	// 배열요소 1번부터 마지막 요소까지 max,min과 순서대로 비쇼해서
	// max가 그값보다 작으면 (min이 그 값보다 크면)max(min) 값을 배열 요소값으로 변경합니다
	// -> 비교가 끝나면 최종 max,min 결정이됩니다.

