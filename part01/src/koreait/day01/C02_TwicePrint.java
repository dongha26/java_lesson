package koreait.day01;

public class C02_TwicePrint {

	public static void main(String[] args) {
		System.out.println("트와이스");
		System.out.println("이름\t생년월일\t\t나이");
		System.out.println("-------------------");
		System.out.println("사나\t1996.12.29\t27");
		System.out.println("지효\t1997.02.01\t26");
		System.out.println("미나\t1998.03.24\t25");
		// ptintf() 메소드를 사용해서 출력 형식을 지정합니다
		// 12칸 문자열 + 자리수 지정하지 않은 문자열 + 5칸 정수
		// %s는 지정된 칸에서 오른쪽 맞춤 , -기호는 왼쪽 맞춤
		System.out.printf("%-12s%s%5d\n","dayeon","1998.05.28",25);
		System.out.printf("%-12s%s%5d\n","momo","1999.04.23",24);
		System.out.printf("%-12s%s%5d\n","nana","1997.06.14",27);
		// printf 메소드에서 형식문자 갯수만큼 뒤에 나오는 데이터 갯수가 일치해야 합니다.
		// System.out.printf("%-12s%s%5d\n","nayon","1997.06.14");
		// printf 메소드에서 형식문자와 뒤에 나오는 데이터 형식이 일치하지 않아 오류 발생.
		// System.out.printf("%-12s%5d\n","nayon","1997.06.14");
		
		// 연습 ㅣ System.out.printf(%12s%s%5d\n","dayeon","1998.05.28",25);
		//   ㄴ 생년월일 "1998.05.28" 을 정수형식(데이터)로 출력하도록 수정해봅시다.
		System.out.println("///////연습///////");
		System.out.printf("%-12s %4d.%02d.%2d %5d\n","dayeon",1998,5,28,25);
		System.out.printf("%-12s %4d.%2d.%2d %5d\n","momo",1999,11,23,24);
		System.out.printf("%-12s %4d.%02d.%02d %5d\n","nayon",1997,6,3,27);
		System.out.printf("%-12s %4d.%02d.%02d %5d\n",1997,"1997",6,3,27);
	}
/*
 * 출력에 사용되는 형식
 * 
 *  \(역슬래쉬) 사용하는 이스케이프문자 : \n (줄바꿈), \t (tap)
 *  형식지정문자 %기호 사용 : %s(문자열) , %d(정수형) 자리수를 지정해서 쓸 수 있습니다.
 *  								ㄴ 남은 자리 0으로 채울 때에는 %03d 와 같이 합니다.
 *  
 * 
 */
}
