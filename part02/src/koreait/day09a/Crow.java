package koreait.day09a;

public class Crow extends Animal {

	protected int wings;
	
	public Crow() {
		System.out.println("새로운 동물 가족은 crow");
	}
	public void fly() {
		setName("까마귀");
		setColor("검정색");
		System.out.println("특징 : 날다");
	}
}
