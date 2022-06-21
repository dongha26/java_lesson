package koreait.day09a;

public class ClassAA extends ClassA { //super(부모) 클래스는 ClassA
	//ClassAA의 인스턴스 메소드
	void test() {
		setName("나연");
		System.out.println("*name = " + name);
	}
}

