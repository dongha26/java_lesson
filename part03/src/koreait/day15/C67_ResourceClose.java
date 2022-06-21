package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C67_ResourceClose implements AutoCloseable{

	public static void main(String[] args) {
		String filename = "C:\\Users\\ITCS\\iclass05\\�ڹ��׽�Ʈ2.txt";   
		
		File file = new File(filename);
		
		try(PrintWriter pw = new PrintWriter(file)) {
		pw.println("��� 90 89 82");
		pw.println("���� 89 90 82");
		pw.println("���� 82 89 90");
		pw.println("�ѳ� 85 36 58");
		System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.");  
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("����� ���� �߻� : " + e.getMessage());
		}  
		
		
		try(Scanner sc = new Scanner(file)) {
	//		sc = new Scanner(file);	
			while(sc.hasNext()) { 
				System.out.println(sc.nextLine());
			}
			System.out.println("���� �бⰡ �Ϸ�Ǿ����ϴ�.");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("����� ���� �߻� : " + e.getMessage());
		
		}
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
//try~catch �ڿ����� ����� finally dksTmrh java 7���� ���� �ٸ� ���� ������ �����մϴ�. 
//      �� ������ �������̽��� ���������� ã�ƺ���

//  try - with - resource
//  try ��� �ȿ� �ڿ� �Ҵ��� �ϴ� �ڵ尡 �����ϴ�
//  resource�� �ݴ� close()�޼ҵ� ����
//  ���õ� �������̽��� AutoCloseable �Դϴ�
