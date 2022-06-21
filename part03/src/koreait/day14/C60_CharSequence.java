package koreait.day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class C60_CharSequence {

	
	// CharSeqence 인터페이스 구현체 : String, StringBuffer StringBuilder....
	public static void main(String[] args) {
		String result = new String();  // result = "test"; result = new String("test");
		System.out.println("1. String 타입 테스트");
		for (int i = 2; i < 6; i++) {
			// 문자열 내용이 바뀌면 문자열 객체가 새로 생성되고 위치가 달라집니다.
			result += i+"/";
			System.out.println("result : "+ result);
		}
		StringBuffer sb = new StringBuffer();
		System.out.println("2. StringBuffer 타입 테스트");
		for (int i = 2; i < 6; i++) {
			// StringBuffer 객체의  문자열 내용이 바뀌어도 기존 객체에 추가되는 동작을 합니다
			// 반복되는 연결 연산이 많은 경우 String? x StringBuffer? O 효율적입니다.
			sb.append(i).append(";");	// 문자열 연결 연산 +와 같은 동작
			System.out.println("sb : " + sb);
		}
		//CharSeqence 인터페이스 사용 : contains 메소드의 매게변수 타입
		// boolean java.lang.String.contains(CharSeqence s)
		String sample = "abc2/3/4/5/xyz";
		System.out.println("3. contain 메소드 확인");
		System.out.println("contains(result)"+sample.contains(result));
		System.out.println("contains(sb)"+sample.contains(sb));
		
		// 메소드의 형식 또는 다른 여러 형식들을 확인할 때 : 1)클래스 or 인터페이스 2) 인터페이스일때 구현체는 무엇인가?
		
		
		// 참고 : ArrayList 선언할 때 변수 선언 List 인터페이스 타입으로 합시다
		//		HashMap		  "			Map      " 
		List<String> names = new ArrayList<>();
		names = new Vector<String>();
		
		Map<String,Integer>map = new HashMap<>();
		map = new TreeMap<String , Integer>();
		
	}

}
