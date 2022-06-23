package koreait.ext;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.UUID;

import com.google.common.hash.Hashing;

public class UUIDTest {

	public static void main(String[] args) {
		
		String uuid; 
		//16진수 32자리 +하이폰 기호 4개로 만들어지는 랜덤문자열
		for (int i = 0; i < 10; i++) {
			uuid= UUID.randomUUID().toString();
			System.out.println(uuid);
		}
		for (int j = 0; j < 10; j++) {
			uuid= UUID.randomUUID().toString();
			System.out.println(uuid.replace("-", ""));
		}
		for (int j = 0; j < 10; j++) {
			uuid= UUID.randomUUID().toString();
			System.out.println(uuid.replace("-", "").substring(0,12));
		}
		
		/*
		 * git 토큰값 : 16진수 36자리 ->
		 * 웹사이트에서 회원가입시 비밀번호를 설정합니다.(패스워드 인증)비밀번호는 서버에서 어떻게 관리가 될까요?
		 * 	-> 해싱 (복호화가 안되는 함수) 함수를 이용해서 문자열에 대한 식별값저장
		 *  -> 비밀번호 1234에 대한 해싱함수 값을 저장 로그인 1234
		 *  -> 대표적인 해시함수 sha256 알고리즘(자바에서 직접구현 MessageDigest 클래스사용)
		 *  
		 * 암호화 : 평문 -> 암호문,복호화 : 암호문 -> 평문 (공개키와 개인키를 이용)
		 * 
		 * 
		 * 
		 */
	String password; 	// 평문
	String sha256 = Hashing
			.sha256().hashString("test#12",StandardCharsets.UTF_8)
			.toString(); 	//sha 256으로 만들어진 해싱값(서버에 저장된값이라고 생각하기)
	System.out.println("sha256 값 :" +sha256);
	Scanner sc = new Scanner(System.in);
	System.out.print("암호 입력하세요 ");
	String you = sc.nextLine();
	password = Hashing.sha256().hashString(you,StandardCharsets.UTF_8).toString();
	System.out.println("입력한 sha256 값 : "+password);
			
	if(sha256.equals(password))		//해싱값 비교
		System.out.println("암호가 일치합니다");
	else 
		System.out.println("암호가 일치하지 않습니다");
}

}
