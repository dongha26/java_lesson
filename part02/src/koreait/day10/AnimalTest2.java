package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest2 {

	public static void main(String[] args) {
		Animal ani1 = new Frog();	// 업 캐스팅 <-> 다운캐스팅 : 강제변환
		Animal ani2 = new Cat();
		Dog puddle = new Dog();
		Crow crow = new Crow();
		// 자식 객체가 생성될 때 먼저 부모클래스 객체를 생성하면서 부모 클래스 생성자 실행.
		Dog dog = new Dog();
		System.out.println("::::::::");
//		animal(ani1);
//		animal(ani2);
		animal(puddle);
//		animal(crow);
//		animal(new Frog());
	}
	// 다형성
	// 구현예시1
	// 매소드 인자(또는 리턴) 타입이 Animal : Animal, Dog, Cat, Frog , Crow 객체 모두 가능합니다
	public static void animal(Animal animal) {
		// 구현예시2 : 메소드 재정의 animal 객체 인스턴스 타입에 따라서 실행되는 act가 다르다 
		
		animal.print();
		// 인자로 전달받은 animal 객체가 참조하는 것의 진짜 타입(인스턴스 타입) 검사 : instanceof
		System.out.println("dog ?"+(animal instanceof Dog)); // 객체 참조 변수 instanceof 클래스명
		System.out.println("frog ?"+(animal instanceof Frog));
		System.out.println("crow ?"+(animal instanceof Crow));
		System.out.println("cat ?"+(animal instanceof Cat));
	/*	animal.jump(); //Frog
		animal.run();  //Dog
		animal.fly();  //Crow
		animal.sound();//Cat
	*/
		Cat cat; Dog dog; Frog frog; Crow crow;
		if(animal instanceof Cat) {
		cat = (Cat)animal;
		 cat.sound();          
		 }     										 // 다운캐스팅 : animal 진짜 객체에 따라 오류 또는 오류 없음.->인스턴스오브 조건식이 필요
		if(animal instanceof Dog) {
			dog = (Dog)animal;
			dog.run();
			}
		if(animal instanceof Frog) {
			frog = (Frog)animal;
			frog.jump();
			}
		if(animal instanceof Crow) {
			crow = (Crow)animal;
			crow.fly();
		}
		animal.print();
	}	// animal 메소드  end
	
}

class Frog extends Animal {

	protected String mouth;
	
	public Frog() {
		System.out.println("새로운 동물 가족은 Frog");
	}
	public void jump() {
		setName("개구리");
		setColor("초록");
		System.out.println("특징 : 점핑");
	}
	//다형성 구현 메소드 오버라이드 		*비교 오버로딩(overloading)
	//				ㄴ 부모클래스의 메소드를 재정의
	@Override	//annotation 에너테이션 : 코딩(또는 실행) 할 때 참고가 되는 주석
	public void act() {
//		super.act();  부모클래스의 act 실행
		System.out.println("animal 행동 : 수시로 점핑하기" );
	}
}
class Cat extends Animal {
	protected String eyes;
	public Cat() {
		System.out.println("새로운 동물 가족은 Cat");
	}
	public void sound() {
		setName("고양이");
		setColor("화이트");
		System.out.println("특징: 야옹야옹");
	}
	@Override
	public void act() {
//		super.act();
		System.out.println("animal 행동 : 수시로 야옹울기" );
	}
}