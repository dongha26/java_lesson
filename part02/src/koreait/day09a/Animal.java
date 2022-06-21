package koreait.day09a;

public class Animal {
	private String name;
	private String color;
	
	public Animal() {
		System.out.println("새로운 Animal 가족이 생겼습니다");
	}
	public void act() {
		System.out.println("Animal 행동 : 아직 모름(unknown)");
	}
	public void print() {
		System.out.println("name: " + name+" ,color"+color);
	}
	public boolean isDog(Object object) {
		return object instanceof Dog;
	}
	public boolean isCrow(Object object) {
		return object instanceof Crow;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
