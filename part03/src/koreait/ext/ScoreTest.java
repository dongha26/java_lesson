package koreait.ext;

public class ScoreTest {

	public static void main(String[] args) {
// �������� : �ʵ� �ʱⰪ�� �پ��ϰ� �ְ���� �� ����ϴ� ����
// �ʵ尡 ������ Ŀ���� �����ڰ� �������� �������� �ֱ� �����Դϴ�.
// ���� : ������� ���� ����ϴ� ����� ������ ������ ����
		
//	Score momo = Score.builder().eng(99).build();
	Score momo = Score.builder().eng(90).kor(74).build();
	Score nana= Score.builder().kor(88).build();
	Score sinbi= Score.builder().eng(77).science(100).build();
	
	Person p1 = Person.builder().age(34)
			.name("���")
			.build();
	System.out.println(momo);
	
	Score s = new Score("���",99,77,76);
	Score momo1 = new Score(null,99,0,0);
	Score sinbi1 = new Score(null,99,0,100);
	}

}
