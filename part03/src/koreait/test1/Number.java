package koreait.test1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import koreait.day16.Word;

public class Number {

	public static void main(String[] args) {
		List<Person>book = new ArrayList<Person>();
		String sel,num,nam;
		int gro;
		Scanner sc= new Scanner(System.in);
		System.out.println("���ñ��-> [n]������ó ����\t[s]����ó ã��\t[g]�׷켱�ú���\t[a]��ü����\t[e]���α׷� ������");
		
		boolean run = true;
		while(run) {
		System.out.print("����-->");
		sel = sc.nextLine(); 	// 
		switch (sel) {
		case "n":
		System.out.print("�̸��Է� -> ");
		nam = sc.nextLine();
		System.out.print("��ȭ��ȣ -> ");
		num = sc.nextLine();
		System.out.print("�׷�(1:ģ��,2:����,3.:�����Ͻ�) -> ");
		gro = Integer.parseInt(sc.nextLine());
		Person ps = new Person(nam,num);
		ps.setMobile(num);
		ps.setGroup(gro);
		book.add(ps);
		
		
		break;
		
		case "s":
			System.out.print("�˻� �̸� ->  ");
			nam = sc.nextLine();
//			for (Person p : book) {
//				if(p.getName().equals(nam))
//					System.out.println(p);
//				else
//					System.out.println("ã�� ����� �����ϴ�");
//			}
			for (int i = 0; i < book.size(); i++) {
				if(book.get(i).getName().equals(nam))
					System.out.println(book.get(i)+"\n"+(i+1)+"�� �˻��Ǿ����ϴ�");
				else 
					System.out.println("ã�� ����� �����ϴ�");
					
				
				
			}
			break;
			
			
		case "g":
			System.out.println("�׷�(1:ģ��,2:����,3:�����Ͻ�) ->");
			int temp = Integer.parseInt(sc.nextLine());
			group1(book,temp);
			break;
			
		case "a":
			all(book);
			break;
		case "e":
			run = false;
			break;
			default:
				System.out.println(" �߸��� �����Դϴ� �޴��� �´� ���ĺ� �Է��ϼ���..");
				break;
	}
}
		System.out.println(":::: ���� �ּҷ� �����մϴ� ::::");
}
	private static void all(List<Person> book) { // mywords�� ������ ���޹޾� ������ ��ü�� ����ŵ�ϴ�.
		book.sort(new Comparator<Person>() {
		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}});
		System.out.println("����ó ��ü ���");
		System.out.println(String.format("%-20s %20s ","�̸�","�޴���ȭ" ));
		System.out.println("------------------------------------------------------");
		for (Person p : book) {
			System.out.println(String.format("%-20s %-20s", p.getName(),p.getMobile()));
		}
	}
	private static void group1(List<Person> book, int temp) {
		for (Person p : book) {
			if(p.getGroup() == temp)
				System.out.println(p);
}
		}
	}