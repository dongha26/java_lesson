package koreait.day09a;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.act();
		animal.print();
		System.out.println("-------------------");
		Dog dog = new Dog();
		dog.run();
		dog.print(); // 상속 메소드
		System.out.println("-------------------");
		Crow crow = new Crow();
		crow.fly();
		crow.print();
		
		System.out.println("::::::::::::::::::::::");
		Animal temp =dog; // 자식객체는 부모클래스 타입으로 참조할 수 있습니다(자식클래스는 부모타입으로 자동캐스팅)
		temp.print();
//		temp.run(); 	  // 오류:부모타입 변수로는 자식 메소드 실행 못 합니다
		temp = crow;	  // 자식객체는 부모클래스 타입으로 참조할 수 있습니다
		temp.print();
//		temp.fly();		  // 오류:부모타입 변수로는 자식 메소드 실행 못 합니다
		System.out.println("--------------------------------");
		Animal puppy = new Dog(); // 자식객체는 부모클래스 타입으로 참조할 수 있습니다
		puppy.print();
//		puppy.run(); 	  // 오류: 부모타입 변수로는 자식 메소드 실행 못합니다
		Dog puddle = (Dog)puppy; //오류 : Animal 타입을 Dog 타입으로 castong.(자식클래스 Dog 객체이므로 가능)
		puddle.run();			// puppy변수가 참조하는 객체가 Dog 타입일때만 가능.
		puddle.print();			//
	}

}
