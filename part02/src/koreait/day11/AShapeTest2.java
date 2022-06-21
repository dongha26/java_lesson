package koreait.day11;

import koreait.day09a.Animal;

public class AShapeTest2 {
	// �͸�Ŭ���� : anonymous
	public static void main(String[] args) {
		//�������
		//�͸��� ����(Inner)Ŭ���� 1ȸ�� Ŭ����
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
		System.out.println("sha ���� = "+sha.getArea());
		System.out.println("sha2 ���� = "+sha2.getArea());
		
		Animal snake = new Animal() {
			int length;
			@Override
			public void act() {
				setName("�̱��ƴ�");
				setColor("�����");
				this.length = 3;
				System.out.println("action : ���ٴϱ�");
			}
			public String toString() {
				return "length = " +length;
			}
		};
		snake.act();
		System.out.println(snake);

	}

}
