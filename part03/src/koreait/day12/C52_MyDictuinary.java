package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictuinary {

	public static void main(String[] args) {
//		HashMap<String,String> note = new HashMap<>();
		TreeMap<String,String> note = new TreeMap<String,String>(); // 이진 검색한 구조로 Map을 생성 : 정렬이되는 Map
		String sel,eng,kor;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 단어저장\t2. 단어검색\t3. 단어장보기\t4. 프로그램 끝내기");
		boolean run = true;
		while(run) {
		System.out.print("선택-->");
		sel = sc.nextLine(); 	// sc.nextInt();
		switch (sel) {
		case "1":
		System.out.print("English -> ");
		eng = sc.nextLine();
		System.out.print("korean --> ");
		kor = sc.nextLine();
		note.put(eng, kor);
		break;
		case "2":
			System.out.print("검색 단어 -> English");
			eng = sc.nextLine();
			System.out.println("단어장 검색했습니다 . 결과 ->"+ note.get(eng));
			break;
		case "3":
			System.out.println("단어장 전체보기 : " +note);
			break;
		case "4":
			run = false;
			break;
			default:
				System.out.println(" 잘못된 선택입니다 1~4 입력입니다");
				break;
		
		}

}
		System.out.println("::: 너의 단어장 종료합니다 . :::");
}	// 참고 : 정수 입력을 받아야한다면 문자열 입력받고 nextLine() 받아서 정수고 변환합니다. 
	// int score = Integer.parseInt(sc.nextLine())
	// 이유 : nextInt() : 엔터를 처리하지 않아서 다음에 나오는 nextLine()에게 전달되어 입력 흐름에 방해가됩니다
	// 결론 : 한 소스 파일에서 nextInt()만 사용 또는 nextLine()만 사용하거나 합니다.
}