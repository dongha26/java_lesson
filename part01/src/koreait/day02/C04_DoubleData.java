package koreait.day02;

public class C04_DoubleData {

	public static void main(String[] args) {
		
		System.out.println("Float 정수데이터--------");
		System.out.println("메모리크기 :"+ Float.BYTES); // 
		System.out.println("Float 정수의 최소값 :"+Float.MIN_VALUE);
		//1.4E-45 는 1.4*10의 -45승 , 3.4028235E38은 10의 38승
		System.out.println("Float 정수의 최대값 :"+Float.MAX_VALUE);

		System.out.println("Double 정수데이터--------");
		System.out.println("메모리크기 :"+ Double.BYTES); // 
		System.out.println("Double 정수의 최소값 :"+Double.MIN_VALUE);
		//4.9E-324는 4.9의 -324승 , 1.7976931348623157E308 은 10의 308승
		System.out.println("Double 정수의 최대값 :"+Double.MAX_VALUE);

	}

}
/* 실수 데이터는 컴퓨터 구조에서 부동소수점 형식으로 다룹니다.
 * 예를 들면 1.23 * 10의 23승에서 1.23(가수) 와 23(자수) 를 
 * 각각 어떤 크기만큼 할당하느냐에 따라 
 * 값의 표현범위와 정밀도(가수부 소수점이 float은 7자리, double는 16자리)가 결정됩니다.
 * 실수 데이터 기본 형식 : float ,double 
 * 	   Wrapper 클래스는 Float, Double
 * 		1.234는 double 형식입니다.
 */
