package koreait.day11;

import koreait.day09a.Animal;

public class AShapeTest2 {
	// 익명클래스 : anonymous
	public static void main(String[] args) {
		//마름모꼴
		//익명의 내부(Inner)클래스 1회용 클래스
		AShape sha = new AShape() {
			
			@Override
			public double getArea() {
				return width+height;
			}
		};
		AShape sha2 = new AShape(20,13) {
			
			@Override
			public double getArea() {
				return width+height;
			}
		};
		System.out.println("sha 넓이 = "+sha.getArea());
		System.out.println("sha2 넓이 = "+sha2.getArea());
		
		Animal snake = new Animal() {
			int length;
			@Override
			public void act() {
				setName("이구아니");
				setColor("얼룩이");
				this.length = 3;
				System.out.println("action : 기어다니기");
			}
			public String toString() {
				return "length = " +length;
			}
		};
		snake.act();
		System.out.println(snake);

	}

}
