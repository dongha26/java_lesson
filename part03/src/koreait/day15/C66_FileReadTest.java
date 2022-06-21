package koreait.day15;

import java.io.File;		// io : input,output ����� ���õ� ��ɵ��� Ŭ����
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C66_FileReadTest {

	public static void main(String[] args){
		
//	String filename = "C:\\Users\\ITCS\\iclass05\\�ڹ��׽�Ʈ.txt";   
	String filename = "C:\\Users\\ITCS\\iclass05\\�ڹ��׽�Ʈ2.txt";   
	
	File file = new File(filename);
	//Scanner : �Է� ����� ���� Ŭ���� 
	//Unhandled exception type FileNotFoundException : ������ ���ɼ��� �����Ƿ� try~catch �ʿ��ϴ�
	Scanner sc = null;
	try {
		sc = new Scanner(file);		//System.in : ǥ�� �Է�(�ܼ� �Է�)
		/*
		System.out.println("���Ͽ��� ���� ���� : "+sc.nextLine());
		System.out.println("���Ͽ��� ���� ���� : "+sc.nextLine());
		System.out.println("���Ͽ��� ���� ���� : "+sc.nextLine());
*/
		while(sc.hasNext()) { // ������ ���͸� �������� ���� �����Ͱ� ������ true
			System.out.println(sc.nextLine());
		}
		System.out.println("���� �бⰡ �Ϸ�Ǿ����ϴ�.");
//		System.out.println("���� ����� �Ϸ�Ǿ����ϴ�."); ///System.out : ǥ�� ���(�ܼ� ���)
	}catch(FileNotFoundException e) {
	// ��� ��ɿ��� ������ ������ �ڵ����� ������ ��������ϴ�.
		System.out.println("����� ���� �߻� : " + e.getMessage());
	
	}finally {
		if(sc!=null)
		sc.close();
	}	
	}

}
// try~catch �ڿ����� ����� finally dksTmrh java 7���� ���� �ٸ� ���� ������ �����մϴ�. 