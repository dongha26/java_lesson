package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictuinary {

	public static void main(String[] args) {
//		HashMap<String,String> note = new HashMap<>();
		TreeMap<String,String> note = new TreeMap<String,String>(); // ���� �˻��� ������ Map�� ���� : �����̵Ǵ� Map
		String sel,eng,kor;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �ܾ�����\t2. �ܾ�˻�\t3. �ܾ��庸��\t4. ���α׷� ������");
		boolean run = true;
		while(run) {
		System.out.print("����-->");
		sel = sc.nextLine(); 	// sc.nextInt();
		switch (sel) {
		case "1":
		System.out.print("English -> ");
		eng = sc.nextLine();
		System.out.print("korean --> ");
		kor = sc.nextLine();
		note.put(eng, kor);
		break;
		case "2":
			System.out.print("�˻� �ܾ� -> English");
			eng = sc.nextLine();
			System.out.println("�ܾ��� �˻��߽��ϴ� . ��� ->"+ note.get(eng));
			break;
		case "3":
			System.out.println("�ܾ��� ��ü���� : " +note);
			break;
		case "4":
			run = false;
			break;
			default:
				System.out.println(" �߸��� �����Դϴ� 1~4 �Է��Դϴ�");
				break;
		
		}

}
		System.out.println("::: ���� �ܾ��� �����մϴ� . :::");
}	// ���� : ���� �Է��� �޾ƾ��Ѵٸ� ���ڿ� �Է¹ް� nextLine() �޾Ƽ� ������ ��ȯ�մϴ�. 
	// int score = Integer.parseInt(sc.nextLine())
	// ���� : nextInt() : ���͸� ó������ �ʾƼ� ������ ������ nextLine()���� ���޵Ǿ� �Է� �帧�� ���ذ��˴ϴ�
	// ��� : �� �ҽ� ���Ͽ��� nextInt()�� ��� �Ǵ� nextLine()�� ����ϰų� �մϴ�.
}