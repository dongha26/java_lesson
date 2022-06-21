package koreait.day07;

import java.util.Arrays;

public class Singer {
/*
 * 클래스 정의 하는 것은 현실 세계의 데이터를 처리하기 위한 형식을 지정
 */
	//Singer 객체가 만들어질 때마다 다른 값 : 인스턴스 필드
	String genre;
	String name_eng;
	String name_kor;;
	int debutYear;
	String[] members;
	static final String JOB ="연예인";
	static String Label="굿";
	
	void printMembers() {
		if(members==null)
			System.out.println("솔로가수입니다");
		else
		for (int i = 0; i < members.length; i++) {
			if(members[i]!=null)
				System.out.println((i+1)+":"+members[i]);
		}

	}
	int actYears(int year) {
		return year-debutYear+1;
	}
	@Override
	public String toString() {
		return "Singer [genre=" + genre + ", name_eng=" + name_eng + ", name_kor=" + name_kor + ", debutYear="
				+ debutYear + "]";
	}


}
