package koreait.day06;

import java.util.Random;

public class C30_RandomTest {
// ���� �߻��ϴ� Random Ŭ������ �޼ҵ带 �׽�Ʈ�մϴ�
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println("1.������ ������ 10�� ");
		for (int i = 0; i < 10;i++) {
			int inum = r.nextInt();
			System.out.println(inum);
		}
		System.out.println("2.������ ������ 10�� bound(��谪)����. ");
		for (int i = 0; i < 10;i++) {
			int inum = r.nextInt(100);
			System.out.println(inum);
		}
		System.out.println("3. Ư�� ������ ������ 10�� ��� - bound�� �̿��� ����");
		for (int i = 0; i < 10;i++) {
			int inum = r.nextInt(100)+1;
			System.out.println(inum);
		}
		System.out.println("4. "
				+ ""
				+ "2~46 ������ ������ ���� 10��");
		for (int i = 0; i < 10; i++) {
			int inum = r.nextInt(44)+2;
			System.out.println(inum);
		}
	}

}
