package koreait.day08;

public class Score {

	private int korean;
	private int english;
	private int science;
	private String grade;

	// �⺻������ �����ֽ��ϴ� � �ڵ��ϱ�� ���������ڴ� 
//	public Score() {
//	}
	void setKorean(int korean) {
		this.korean = korean;
		// this�� setKorean �޼ҵ带 ���� ��Ű�� ��ü
	}
	int getKorean() {
		return korean;
	}
	void setEnglish(int english) {
		this.english = english;
	}
	int getEnglish() {
		return english;
	}
	void setGrade(String grade) {
		this.grade = grade;
	}
	String getGrade() {
		return grade;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getScience() {
		return science;
	}
//	void setScience(int science) {
//		this.science = science;
//	}
//	int getScience() {
//		return science;
//	}

}
