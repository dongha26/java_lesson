package koreait.day02;

public class C08_KeyInputTest {

	public static void main(String[] args) {
	//김동하
	int	k=23;
	int s=19;
	int i = k*s;
	System.out.printf("가로%d㎠ x세로%d㎠ = 넓이 %d㎠ \n",k,s,i);
	System.out.println("넓이는"+i+"㎠입니다");
	
	final double PI = 3.14;
	double b = 23.230;
	double o = 2*PI*b;
	double n = PI*b*b;
	System.out.printf("둘레를 구했습니다 둘레는 = %.3f\n㎠",o);
	System.out.printf("넓이를 구했습니다 넓이는 = %.3f㎠",n);
	
	
	//final 테스트
	//		변수선언 앞에 final 키워드를 붙이면 값을 변경하지 못합니다.
	
	final int test = 123; // 값을 변경 못하는 상수입니다.
	System.out.println("test ="+test);
	}

}
