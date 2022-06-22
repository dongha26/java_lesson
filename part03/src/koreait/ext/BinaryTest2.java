package koreait.ext;

import java.util.Scanner;

public class BinaryTest2 {

	public static void main(String[] args) {
		int n10 =123;
		int n16 =0xa41c; // 16진수표기
		int n2 = 0b1010010000011100;
		
		System.out.println("변수 그대로 출력하기");
		System.out.println("10진수"+n10);
		System.out.println("16진수 0xa41c: "+n16);
		System.out.println("2진수 0b1010010000011100: "+n2);
	
		System.out.println("2. format 지정");
		System.out.println(String.format("16진수 리터럴 0xa41c %x", n16));
		System.out.println(String.format("2진수 리터럴 0b1010010000011100%x", n2));
		System.out.println(String.format("10진수 리터럴 42012 %x", 42012));
	//결론 10진수 42012 , n16과 n2변수 값이 메모리에 저장될 때는 모두 동일한 0,1 표현값입니다
		System.out.println("3. -1의 2진수, 16진수 표현확인");
		 n16 = 0xffffffff;
		System.out.println(n16);
		System.out.printf("-1은 16진수 %x\n",-1);
		System.out.println("2진수 : "+Integer.toBinaryString(-1));	
		System.out.println("34. 입력한 2진수 16진수 값을 10진수로 바꾸어 드립니다");
		Scanner sc = new Scanner(System.in);
		System.out.print("2진수 입력하세요 >>>");
		String t2 = sc.nextLine();	
		System.out.print("16진수 입력하세요 >>>");
		String t16 = sc.nextLine();	
// 원래는 Integer.parseInt(s) 형식이었고 s문자열이 10진수 표현이라는 의미입니다. 
		System.out.println(String.format("2진수 %s는 10진수 %d 입니다", 
				t2,Integer.parseInt(t2, 2))); //t2는 2진수 -> 메소드 결과 정수값
		System.out.println(String.format("16진수 %s는 10진수 %d 입니다", 
				t16,Integer.parseInt(t16, 16))); // t16은 16진수다. ->메소드결과 정수값
						// 음수는 -기호 써서 절대값 넘지않는 범위에서 문자열 입력
	
	}			

}
/*
 * n진법 문자열 -> 10진수 정수값 변환 Integer.parseInt(문자열,n)
 * 10진수 정수값 -> n진법 문자열 Integer.toBinaryString 메소드,toHexString메소드 
 * 
 * format에서 %d는 10진수 , %x는 16진수,%o는 8진수 참고로 2진수는 포멧형식 없습니다
 * 
 * 2진수의 비트연산 : &,|,^,~,>>,<< 등등
 */