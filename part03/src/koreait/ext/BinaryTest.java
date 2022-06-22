package koreait.ext;

public class BinaryTest {

	public static void main(String[] args) {
	System.out.println(String.format("%8s\t %8s\t %8s", "10진수","2진수","16진수"));
	for (int i = 0; i < 10000; i++) {
		System.out.println(String.format("%8d\t %8s\t %8s",i,Integer.toBinaryString(i),
				Integer.toHexString(i) ));
	}
	/*
	 * 10진수 정수값을 다른 진법(진수)로 문자열 변환
	 * Integer.toBinaryString(i) ->2진수로 변환 
	 * Integer.toOctalString(i) ->8진수로 변환
	 * Integer.toHexString(i) -> 16진수로 변환
	 * 
	 * int형식은 4바이트 32비트 16진수로는 8자리 10진수로는 값범위 -2147483648~2147483648 
	 * 						00000000~FFFFFFFF(32비트가 모두 1,-1)
	 * 젤 앞자리가 0이면 양수 1이면 음수
	 * 
	 */
	}

}
