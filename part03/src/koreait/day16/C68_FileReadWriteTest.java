package koreait.day16;

import java.io.File;		// io : input,output ����� ���õ� ��ɵ��� Ŭ����
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

// Exception ó�� ����� ���� �޼ҵ忡�� ���ǵɶ� �ٸ� ��� :1 ,2
public class C68_FileReadWriteTest {
	// main �޼ҵ尡 throws Exception �Ѵٸ� jvm���� �ѱ�ϴ�. ó�������� printStackTrace ����� ����.
	//���1: Exception�� try ~catch �� ���� ó���մϴ�
	public static void main(String[] args){
		
	String filename = "C:\\\\Users\\\\user\\\\iclass05\\\\�ڹ�.txt";   
	try {
		fileWrite2(filename);
		filename = "C:\\\\Users\\\\user\\\\iclass05\\\\�ڹ�.txt";
//		filename = "C:\\\\Users\\\\user\\\\iclass05\\\\�ڹ�18.txt"; // ���������׽�Ʈ
		fileRead(filename);
	} catch (FileNotFoundException e) {
		System.out.println("����� ���� ���� : " +e.getMessage());
		System.out.println("������ �����ϴ��� Ȯ���ϼ��� ");
	}
	

	}
	
	public static void fileWrite(String filename) {
		
		File file = new File(filename);
		PrintWriter pw = null;
// ������ �޼ҵ� java.io.PrintWriter.PrintWriter(File file) throws FileNotFoundException
		try {
		pw = new PrintWriter(file); // file �� ������ ��ġ�� ����� ���� ��ü
		pw.println("��� 90 89 82");
		pw.println("���� 89 90 82");
		pw.println("���� 82 89 90");
		System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.");  //System.out : ǥ�� ���(�ܼ� ���)
		}catch(FileNotFoundException e) {
		// ��� ��ɿ��� ������ ������ �ڵ����� ������ ��������ϴ�.
			System.out.println("����� ���� �߻� : " + e.getMessage());
		
		}finally {
			pw.close();
		}	
	}
	// ���2: throws Ű����� �ش� Exception�� ȣ���� ��(���⼭�� main�޼ҵ�)���� �ѱ��.
	//		 throws �ڿ� , �� �����ؼ� �������� ������ �� �ֽ��ϴ�.
	//		 Exception�� ó���ؾ��� �޼ҵ尡 ���� ���ǵǰ� ���� �� �Ѱ����� ��� ó���� �� �ֽ��ϴ�
	
	public static void fileWrite2(String filename) throws FileNotFoundException {
		
		File file = new File(filename);
		PrintWriter pw = null;
		pw = new PrintWriter(file); // file �� ������ ��ġ�� ����� ���� ��ü
		pw.println("��� 90 89 82");
		pw.println("���� 89 90 82");
		pw.println("���� 82 89 90");
		System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.");  //System.out : ǥ�� ���(�ܼ� ���)
		
			pw.close();
	}
	
	public static void fileRead(String filename)throws FileNotFoundException{
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
}
