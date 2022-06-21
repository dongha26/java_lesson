package koreait.day08;

import java.util.Scanner;

public class MyClass2Test {
// 하고싶은 연습을 해보세요
	public static void main(String[] args) {
		MyClass2 mc1 = new MyClass2();
		// 		 커스텀 생성자를 정의하면 기본으로 쓸 수 있는 기본생성자가
		// 		사용할 수 없게 됩니다. -> 직접 정의합니다.
		MyClass2 mc22 = new MyClass2("모모");
		System.out.println("mc1 name : "+mc1.getName());
		System.out.println("mc22 name : "+mc22.getName());
		
		//mc1 객체에 기본생성자를 허용하면 name 필드값 초기화를 못합니다.(예시적용)
		// 기본 생성자를 허용하지 않는 예시
		//Scanner sc = new Scanner();
	}

}
