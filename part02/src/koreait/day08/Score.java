package koreait.day08;

public class Score {

	private int korean;
	private int english;
	private int science;
	private String grade;

	// 기본생성자 숨어있습니다 어떤 코드일까요 접근한정자는 
//	public Score() {
//	}
	void setKorean(int korean) {
		this.korean = korean;
		// this는 setKorean 메소드를 실행 시키는 객체
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
