package koreait.day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class MyDictuinary {

	public static void main(String[] args) {
//		HashMap<String,String> note = new HashMap<>();
		TreeMap<String,String> note = new TreeMap<String,String>(); // 이진 검색한 구조로 Map을 생성 : 정렬이되는 Map
		List<Word>myword = new ArrayList<Word>(); //*** note를 mywords로 바꿔서 구현해보기***
		String sel,kor,eng;
		int lel;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 단어저장\t2. 단어검색\t3. 단어장보기\t4. 레벨로 검색\t5. 프로그램 끝내기");
		boolean run = true;
		while(run) {
		System.out.print("선택-->");
		sel = sc.nextLine(); 	// 
		switch (sel) {
		case "1":
		System.out.print("English -> ");
		eng = sc.nextLine();
		System.out.print("korean --> ");
		kor = sc.nextLine();
		System.out.print("level --> ");
		lel = Integer.parseInt(sc.nextLine());
		Word no = new Word(eng,kor);
		no.setLevel(lel);
		myword.add(no);
		
//		 myword.add(new Word(eng,kor));
		
		break;
		case "2":
			System.out.print("검색 단어 -> English ");
			eng = sc.nextLine();
			for (Word w : myword) {
				if(w.getEnglish().equals(eng))
					System.out.println("단어장 검색했습니다. 결과 => " +w);
			}
//			for (int i = 0; i < myword.size(); i++) {
//				if(myword.get(i).getEnglish().equals(eng))
//					System.out.println(myword.get(i));
//			}
			break;
		case "3":
//			System.out.println("단어장 전체보기 : " +myword);
			all(myword); 	// 정렬하고 출력하기
			break;
		case "4":
			System.out.print("검색할 레벨 입력(1~3) -> ");
			int temp = Integer.parseInt(sc.nextLine());
			level(myword,temp);
			break;
		case "5":
			run = false;
			break;
			default:
				System.out.println(" 잘못된 선택입니다 1~4 입력입니다");
				break;
		
		}

}
		System.out.println("::: 너의 단어장 종료합니다 . :::");
}	
	private static void level(List<Word> myword, int temp) {
		for (Word w : myword) {
			if(w.getLevel() == temp)
				System.out.println(w);
		}
	}
	private static void all(List<Word> myword) { // mywords의 참조값 전달받아 동일한 객체를 가리킵니다.
		myword.sort(new Comparator<Word>() {
		@Override
		public int compare(Word o1, Word o2) {
			// TODO Auto-generated method stub
			return o1.getEnglish().compareTo(o2.getEnglish());
		}});
		System.out.println(String.format("%-20s %-20s %10s","English","Korean","Level" ));
		System.out.println("------------------------------------------------------");
		for (Word w : myword) {
			System.out.println(String.format("%-20s %-20s %10d",w.getEnglish(),w.getKorean(),w.getLevel()));
		}
		
	}
}