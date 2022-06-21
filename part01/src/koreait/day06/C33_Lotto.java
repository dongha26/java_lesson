package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_Lotto {
//김동하
	public static void main(String[] args) {
		int[]numbers = new int[45]; //로또번호 수를 가지고있는 배열 45개 생성
		Random r = new Random(); 	// 무작위 숫자 생성 랜덤클래스 생성가능
		
		for (int i = 0; i < 45; i++) {
			numbers[i]=i+1; //값의 범위 : 1 ~ 45  -> lotto배열에 저장되는 값
		}
		System.out.println("numbers 배열 초기값-----------------------------");
		System.out.println(Arrays.toString(numbers)); // 로또 번호가 될 수 있는 번호 나열
		System.out.println("---------------------------------------------");
		
		int[]lotto = new int[6]; //선택된 6개 숫자를 담을 배열 생성
		int k; //선택된 무작위 숫자 하나를 저장할 변수 생성
		for (int cnt = 0; cnt < 6; cnt++) {
			k=r.nextInt(45-cnt); //1~45사이의 무작위 숫자를 cnt가 6일때까지 45에서 하나씩 줄여가며 변수k에 저장
			System.out.println("k = "+k+",number = "+numbers[k]); //선택된 k변수와 로또번호 변수를 출력
			lotto[cnt]=numbers[k]; //6개의 숫자를 담을 배열에 선택된 숫자 저장
		for (int i = k; i < numbers.length-1; i++){//k가 6개 선택됬고 선택된 숫자의 중복을 없애기위해서 배열을 하나씩 삭제 
			numbers[i] = numbers[i+1]; //선택된 배열을 없애고 나머지 배열을 없앤 배열의 인덱스로 이동
		}
		System.out.println(Arrays.toString(numbers)); // 선택된 숫자와 남은 숫자들 순서대로 출려
		}
		System.out.print("최종 선택 숫자 : ");
		System.out.println(Arrays.toString(lotto)); //최종선택 숫자를 크기 상관없이 출력
		Arrays.sort(lotto); //숫자의 크기 순서대로 정렬
		System.out.println(Arrays.toString(lotto)); //크기순으로 정렬된 숫자를  출력
	}

}
