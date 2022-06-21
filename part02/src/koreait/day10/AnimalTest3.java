package koreait.day10;

import java.util.Iterator;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest3 {
	// 다형성 구현예시3
	public static void main(String[] args) {
		// 부모타입 클래스 배열 : 배열에는 Animal 타입 인스턴스 객체의 참조값이 저장
		Animal[] animals = new Animal[10];
		animals[0]= new Frog();
		animals[7]= new Dog();
		animals[9]= new Cat();
		animals[4]= new Crow();
		animals[2]= new Frog();
		
		for (Animal temp : animals) {
			System.out.println("::::");
			if(temp!=null) {
				Cat cat; Dog dog; Frog frog; Crow crow;
				if(temp instanceof Cat) {
				cat = (Cat)temp;
				 cat.sound();          
				 }     										 // 다운캐스팅 : animal 진짜 객체에 따라 오류 또는 오류 없음.->인스턴스오브 조건식이 필요
				if(temp instanceof Dog) {
					dog = (Dog)temp;
					dog.run();
					}
				if(temp instanceof Frog) {
					frog = (Frog)temp;
					frog.jump();
					}
				if(temp instanceof Crow) {
					crow = (Crow)temp;
					crow.fly();
					}
					temp.act();
					temp.print();
					
			} //if end
			else {
				System.out.println("null 참조입니다");
			}
			System.out.println("::::");
		}
	}
}
