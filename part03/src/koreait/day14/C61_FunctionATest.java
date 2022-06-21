package koreait.day14;

public class C61_FunctionATest {

	public static void main(String[] args) {
		
		// 1) 익명클래스 : 추상메소드의 개수 상관없습니다
		FunctionA fa = new FunctionA() {

			@Override
			public int method(int a, int b) {
				// TODO Auto-generated method stub
				System.out.print("a*b = ");
				return a*b;
			}
			
		};
		
		System.out.println(fa.method(23, 11));
		
		//2) 람다식 : 추상메서드가 1개일 때만 가능 함수형 인터페이스만 표현이 가능합니다(메소드 이름을 생략한 형식)
		fa = (int a,int b) ->{
			System.out.print("a+b = ");
			return a+b;
		};
		
		System.out.println(fa.method(23, 11));
	}

}
