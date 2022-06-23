package koreait.ext;

public class ScoreTest {

	public static void main(String[] args) {
// 빌더패턴 : 필드 초기값을 다양하게 주고싶을 때 사용하는 패턴
// 필드가 많으면 커스텀 생성자가 많아지는 문제점이 있기 떄문입니다.
// 패턴 : 사람들이 자주 사용하는 기능을 구현한 형식을 정의
		
//	Score momo = Score.builder().eng(99).build();
	Score momo = Score.builder().eng(90).kor(74).build();
	Score nana= Score.builder().kor(88).build();
	Score sinbi= Score.builder().eng(77).science(100).build();
	
	Person p1 = Person.builder().age(34)
			.name("모모")
			.build();
	System.out.println(momo);
	
	Score s = new Score("모모",99,77,76);
	Score momo1 = new Score(null,99,0,0);
	Score sinbi1 = new Score(null,99,0,100);
	}

}
