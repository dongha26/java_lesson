package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C67_ResourceClose implements AutoCloseable{

	public static void main(String[] args) {
		String filename = "C:\\Users\\ITCS\\iclass05\\자바테스트2.txt";   
		
		File file = new File(filename);
		
		try(PrintWriter pw = new PrintWriter(file)) {
		pw.println("모모 90 89 82");
		pw.println("다현 89 90 82");
		pw.println("나연 82 89 90");
		pw.println("한나 85 36 58");
		System.out.println("파일 출력이 완료되었습니다.");  
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("사용자 오류 발생 : " + e.getMessage());
		}  
		
		
		try(Scanner sc = new Scanner(file)) {
	//		sc = new Scanner(file);	
			while(sc.hasNext()) { 
				System.out.println(sc.nextLine());
			}
			System.out.println("파일 읽기가 완료되었습니다.");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("사용자 오류 발생 : " + e.getMessage());
		
		}
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
//try~catch 자원해제 방법을 finally dksTmrh java 7버전 부터 다른 구문 형식이 가능합니다. 
//      ㄴ 관현된 인터페이스가 무엇인지도 찾아보기

//  try - with - resource
//  try 블록 안에 자원 할당을 하는 코드가 들어갔습니다
//  resource를 닫는 close()메소드 제거
//  관련된 인터페이스는 AutoCloseable 입니다
