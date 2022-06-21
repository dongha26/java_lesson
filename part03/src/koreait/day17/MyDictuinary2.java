package koreait.day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

import koreait.day16.Word;

public class MyDictuinary2 {

	public static void main(String[] args) {
		TreeMap<String,String> note = new TreeMap<String,String>(); 
		List<Word>myword = new ArrayList<Word>(); 
		Scanner ssc = new Scanner(System.in);
		
			try {
				System.out.println("���Ͽ� �����ұ��?(Y or N)>>");
				if(ssc.nextLine().equals("Y"))
			read(myword,"C:\\Users\\ITCS\\���ǿ��ѻ���");
				else
					System.out.println("������ ���� ����ϴ�");
		} catch (FileNotFoundException e1) {
			System.out.println("���� �д� �� �����߻� :" + e1.getMessage());
		}

		String sel,kor,eng;
		int lel;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �ܾ�����\t2. �ܾ�˻�\t3. �ܾ��庸��\t4. ������ �˻�\t5. ���α׷� ������");
		boolean run = true;
		while(run) {
		System.out.print("����-->");
		sel = sc.nextLine(); 	// 
		switch (sel) {
		case "1":
		System.out.print("English -> ");
		eng = sc.nextLine();
		System.out.print("korean --> ");
		kor = sc.nextLine();
		System.out.print("level --> ");
		lel = Integer.parseInt(sc.nextLine());
		Word no = new Word(eng,kor);
		no.setLevel(lel);
		myword.add(no);
		
//		 myword.add(new Word(eng,kor));
		
		break;
		case "2":
			System.out.print("�˻� �ܾ� -> English ");
			eng = sc.nextLine();
			for (Word w : myword) {
				if(w.getEnglish().equals(eng))
					System.out.println("�ܾ��� �˻��߽��ϴ�. ��� => " +w);
			}
//			for (int i = 0; i < myword.size(); i++) {
//				if(myword.get(i).getEnglish().equals(eng))
//					System.out.println(myword.get(i));
//			}
			break;
		case "3":
//			System.out.println("�ܾ��� ��ü���� : " +myword);
			all(myword); 	// �����ϰ� ����ϱ�
			break;
		case "4":
			System.out.print("�˻��� ���� �Է�(1~3) -> ");
			int temp = Integer.parseInt(sc.nextLine());
			level(myword,temp);
			break;
		case "5":
			run = false;
			break;
			default:
				System.out.println(" �߸��� �����Դϴ� 1~4 �Է��Դϴ�");
				break;
		
		}

}
		try {
			System.out.println("���Ͽ� �����ұ��?(Y or N)>>");
			if(ssc.nextLine().equals("Y"))
				
			save(myword,"C:\\Users\\ITCS\\���ǿ��ѻ���");
			else 
				System.out.println("������ ���� ����ϴ�.");
		} catch (FileNotFoundException e) {
			System.out.println("���� �����߿� ������ ������ϴ�."+e.getMessage());
		} 
		System.out.println("::: ���� �ܾ��� �����մϴ� . :::");
		
	}
	private static void read(List<Word> myword,String filename) throws FileNotFoundException {
	File file = new File(filename);
	Scanner sc = new Scanner(file);
	StringTokenizer stk = null;
	while(sc.hasNext()) {
		String temp = sc.nextLine();	// ���Ͽ��� 1�� �о�� �� ����
		System.out.println(temp.substring(0,temp.indexOf("(")));
		stk = new StringTokenizer(temp.substring(0,temp.indexOf("(")));
		
			myword.add(new Word(stk.nextToken(),
								stk.nextToken(),
								Integer.parseInt(stk.nextToken())));
		//���� ����� ����� StringTokenizer�� Word ��ü ����� myword ����Ʈ�� �߰��ϱ�
	}
	
	
	sc.close();
	System.out.println("������ �о�Խ��ϴ�");
	}

	private static void save(List<Word> myword, String filename) throws FileNotFoundException {
		File file = new File(filename);
		PrintWriter pw = new PrintWriter(file);
		for (Word w : myword) {
			pw.println(w);
			
		}
		pw.close();
		System.out.println("���� ������ �Ϸ� �Ǿ����ϴ�");
	}
	private static void level(List<Word> myword, int temp) {
		for (Word w : myword) {
			if(w.getLevel() == temp)
				System.out.println(w);
		}
	}
	private static void all(List<Word> myword) { // mywords�� ������ ���޹޾� ������ ��ü�� ����ŵ�ϴ�.
		myword.sort(new Comparator<Word>() {
		@Override
		public int compare(Word o1, Word o2) {
			// TODO Auto-generated method stub
			return o1.getEnglish().compareTo(o2.getEnglish());
		}});
		System.out.println(String.format("%-20s %-20s %10s","English","Korean","Level" ));
		System.out.println("------------------------------------------------------");
		for (Word w : myword) {
			System.out.println(String.format("%-20s %-20s %10d",w.getEnglish(),w.getKorean(),w.getLevel()));
		}
		
	}
}