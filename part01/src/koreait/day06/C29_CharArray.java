package koreait.day06;

import java.util.Arrays;

public class C29_CharArray {
// char 배열의 특징 및 문자열과의 연관된 내용 파악하기!
//    - char 형은 2바이트 정수를 저장하여 문자(모양)을 만든다
	public static void main(String[] args) {
		char[] carr1 = {'i','a','m',' ','j','a','v','a'};
		char[] carr2 = new char[20];
		System.out.println("[[[[ char 배열 테스트]]]]");
		System.out.println("carr1 : "+Arrays.toString(carr1));
		System.out.println("carr1 : "+Arrays.toString(carr2));
		System.out.println("carr1 배열 길이(크기)"+carr1.length);
		System.out.println("carr1 배열 길이(크기)"+carr2.length);
		
		System.out.println("carr1 배열 3번째 데이터의 값 (문자)" + carr1[2]);
		System.out.println("carr2 배열 3번째 데이터의 값 (문자)" + carr2[2]);

		System.out.println("carr1 배열 3번째 데이터의 값 (정수)" + (int)carr1[2]);
		System.out.println("carr2 배열 3번째 데이터의 값 (정수)" + (int)carr2[2]);
		System.out.println();
		System.out.println("1. for문으로 출력");
		for (int i = 0; i < carr1.length; i++) {
			System.out.println("carr1["+i+"] 의 데이터 값 : "+carr1[i]);
		}
		System.out.println("\n2. for문으로출력");
		for (int i = 0; i < carr1.length; i++) {
			System.out.print(carr1[i]);
		}
		System.out.println("\n3. 배열이름(참조형변수)으로 출력");
			System.out.print(carr1);
	
		String msg = "iam java";
		System.out.println(msg);
		
		System.out.println("\n[[[[ char 배열 테스트]]]]");
		System.out.println("4. 문자열을 배열로 변경");
		carr2="hello hi goodbye".toCharArray();
		System.out.println(carr2);
		System.out.println(carr2[2]);
		System.out.println("carr2.length :"+carr2.length);
		
		carr2="hello hi goodbye hi goodbye".toCharArray(); // 문자열이 선언된 배열크기보다 크다
		System.out.println(carr2);
		System.out.println(carr2[2]);
		System.out.println("carr2.length :"+carr2.length);
		
		String temp = String.valueOf(carr2); 	//char[] 배열을 문자열로 변환
												//String 객체의 toCharArray()메소드와 반대
		//참고 : String.valueOf 메소드는 여러가지 매개변수 형식을 다룹니다.(메소드 overloading)
//		System.out.println("String.valueOf(carr2) : "+String.valueOf(obj));
	}

}
