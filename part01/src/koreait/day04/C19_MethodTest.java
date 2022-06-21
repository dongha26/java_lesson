
package koreait.day04;

public class C19_MethodTest {
	// main 메소드 : 실행의 시작점 프로그램 실행을 위해서는 꼭 있어야할 메소드
	public static void main(String[] args) {
	
	System.out.println("메소드를 직접 정의해서 사용해봅니다.");
	System.out.println("프로그램은 main 메소드의 명령문을 순서대로 실행하고 중간에 메소드 호출을 만나면 메소드가 정의된 실행을 위해");
	System.out.println("제어를 이동합니다 . 메소드 실행이 종료되면 다시 main 메소드로 제어가 돌아옵니다");
	methodA(); //메소드 호출	
	System.out.println("2.");
	methodB(11,33);
	methodB(929,111);	
	System.out.println("3.");
	methodC(929,12.1);
	methodC(929,121);
	System.out.println("4.");
	methodD();
	System.out.println("return = " + methodD());
	int temp = methodD();
	System.out.println("return = "+ temp);
	System.out.println("5.");
	double result = methodE(314,3.14);
	System.out.println("result = "+result);
	System.out.println("6.");
	System.out.println(methodF('i',4));
	
	char ch = 'a';
	int val = 3;
	ch = methodF(ch,val);
	System.out.println("return = "+ch);
	}
	/*
	 * String 클래스의 메소드를 이해하기 위해서, 먼저 
	 *   								ㄴ 메소드의 구조 연습
	 * 
	 * 메소드의 주요요소 : 반환값(형식), 인자(argument)또는 매개변수:parameter),메소드 이름,public,static 등의 설정
	 *		ㄴ 반환값 : 메소드 실행 완료되면 얻어지는 결과값
	 *		ㄴ 인자 : 메소드 실행을 위해서 필요한 데이터(형식과 변수명 선언 필요) - 인자의 갯수와 형식은 다양합니다.
	 *		ㄴ 메소드 이름 : 식별자
	 *		ㄴ public : 접근한정자, static : 정적인 요소
	 *
	 *
	 */ 	
	
	// static 안 main에서 실행할 메소드는 동일하게 static 이어야합니다
	public static void methodA() {
		System.out.println("첫번째 메소드 정의 연습입니다.");
	}
	public static void methodB(int a , int b) {
		System.out.println("두번째 메소드 정의 연습입니다");
		System.out.println("전달받은 값 a ="+a+",b ="+b);
	}
	public static void methodC(int a , double b) {
		System.out.println("세번째 메소드 정의 연습입니다");
		System.out.println("전달받은 값 a ="+a+",b ="+b);
	}
	public static int methodD() {
		System.out.println("네번째 메소드 정의 연습입니다");
		return 999;
	}
	public static double methodE(int a, double b) {
		System.out.println("다섯번째 메소드 정의 연습입니다");
		return a+b;
	}
	public static char methodF(char ch,int size) {
		System.out.println("여섯번째 메소드 정의 연습입니다");
		return (char)(ch+size);
	}
}
