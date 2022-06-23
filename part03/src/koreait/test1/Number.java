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
		System.out.println("선택기능-> [n]새연락처 저장\t[s]연락처 찾기\t[g]그룹선택보기\t[a]전체보기\t[e]프로그램 끝내기");
		
		boolean run = true;
		while(run) {
		System.out.print("선택-->");
		sel = sc.nextLine(); 	// 
		switch (sel) {
		case "n":
		System.out.print("이름입력 -> ");
		nam = sc.nextLine();
		System.out.print("전화번호 -> ");
		num = sc.nextLine();
		System.out.print("그룹(1:친구,2:가족,3.:비지니스) -> ");
		gro = Integer.parseInt(sc.nextLine());
		Person ps = new Person(nam,num);
		ps.setMobile(num);
		ps.setGroup(gro);
		book.add(ps);
		
		
		break;
		
		case "s":
			System.out.print("검색 이름 ->  ");
			nam = sc.nextLine();
//			for (Person p : book) {
//				if(p.getName().equals(nam))
//					System.out.println(p);
//				else
//					System.out.println("찾는 결과가 없습니다");
//			}
			for (int i = 0; i < book.size(); i++) {
				if(book.get(i).getName().equals(nam))
					System.out.println(book.get(i)+"\n"+(i+1)+"개 검색되었습니다");
				else 
					System.out.println("찾는 결과가 없습니다");
					
				
				
			}
			break;
			
			
		case "g":
			System.out.println("그룹(1:친구,2:가족,3:비지니스) ->");
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
				System.out.println(" 잘못된 선택입니다 메뉴에 맞는 알파벳 입력하세요..");
				break;
	}
}
		System.out.println(":::: 너의 주소록 종료합니다 ::::");
}
	private static void all(List<Person> book) { // mywords의 참조값 전달받아 동일한 객체를 가리킵니다.
		book.sort(new Comparator<Person>() {
		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}});
		System.out.println("연락처 전체 목록");
		System.out.println(String.format("%-20s %20s ","이름","휴대전화" ));
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