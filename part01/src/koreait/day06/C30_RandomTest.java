package koreait.day06;

import java.util.Random;

public class C30_RandomTest {
// 난수 발생하는 Random 클래스의 메소드를 테스트합니다
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println("1.정수형 랜덤값 10개 ");
		for (int i = 0; i < 10;i++) {
			int inum = r.nextInt();
			System.out.println(inum);
		}
		System.out.println("2.정수형 랜덤값 10개 bound(경계값)있음. ");
		for (int i = 0; i < 10;i++) {
			int inum = r.nextInt(100);
			System.out.println(inum);
		}
		System.out.println("3. 특정 범위의 랜덤값 10개 출력 - bound를 이용한 수식");
		for (int i = 0; i < 10;i++) {
			int inum = r.nextInt(100)+1;
			System.out.println(inum);
		}
		System.out.println("4. "
				+ ""
				+ "2~46 범위의 값으로 난수 10개");
		for (int i = 0; i < 10; i++) {
			int inum = r.nextInt(44)+2;
			System.out.println(inum);
		}
	}

}
