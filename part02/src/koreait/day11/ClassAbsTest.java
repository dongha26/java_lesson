package koreait.day11;

import koreait.day10.Person;

public class ClassAbsTest {

	public static void main(String[] args) {
		Person momo = new Person(); 	//일반클래스
//		ClassAbs abs = new ClassAbs();  //오류 ClassAbs는 추상클래스, new 못합니다
		ClassAbs abs = new ClassX();	//부모타입참조
		ClassX cls = new ClassX();		//구현(자식) 클래스타입 참조
		System.out.println("테스트 첫번째 : test 메소드");
		abs.test();				//부모
		cls.test();				//자식
		abs.name = "손흥민";		//name은 부모 클래스 필드
		cls.name = "모모";
		abs.print();			//print() 부모클래스 메소드
		cls.print();
		System.out.println("테스트 두번째 : 자식필드 num");
		cls.setNum(23);
		cls.test();
		ClassX x =(ClassX)abs;
		x.setNum(100);
		abs.test();
	}

}
