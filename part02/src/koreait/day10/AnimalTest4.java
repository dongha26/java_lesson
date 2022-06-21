package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest4 {
	// Animal 클래스 isDog,isCrow 테스트 : 메소드 인자 Object(다형성 구현)
	public static void main(String[] args) {
		
		Animal animal = new Dog();
		Dog puddle = new Dog();
		Crow crow = new Crow();
		Animal animal2 = new Crow();
		
		System.out.println(animal.isCrow(puddle));
		System.out.println(animal.isDog(puddle));
		System.out.println(animal.isDog("동물"));
		System.out.println(animal.isDog(1));
		System.out.println(animal.isCrow(animal));
		System.out.println(animal.isCrow(crow));
		System.out.println(animal.isCrow(animal2));
		System.out.println(animal.isCrow("까마귀"));
	}

}
