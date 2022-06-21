package koreait.day04;

import java.util.Scanner;

public class C21_StringEx {

	public static void main(String[] args) {
		/*  구글 이메일 계정을 체크하는 기능 구현 
		 *  1. @ 기호가 1개 포함되어야 합니다.	(메시지 : 이메일 형식이 아닙니다.)
		 *  		ㄴ indexof 가 -1이 아니고 indexof 와 lastindexof 가 같은 값인가?
		 *  
		 *  2. 1번이 참일 때 @ 뒤에는 gmail.com 이어야 합니다. (메시지 : 도메인 이름이 틀립니다.)
		 *  		ㄴ '@' 의 indexof 를 구해서 그 뒤부터 끝까지 substring 추출한 문자열을 equals 비교
		 *  
		 *  3. 2번이 참일 떄 @ 앞까지의 문자열(계정이름)만 추출합니다.
		 *  		ㄴ '@' 의 indexof 를 구해서 처음 부터 '@' 이전 까지의 문자열 substring 저장
		 *  
		 *  4. 3번의 계정이름은 6글자 이상이어야 합니다.
		 *  		ㄴ 3번의 문자열이 length() 값 6인지 비교
		 *  
		 *  5. 3번의 계정이름에는 특수기호 $,%가 포함되면 안됩니다. 
		 *   		ㄴ indexof('$') , indexof('%') 가 모두 -1이 아니면 허용안하는 기호 포함
		 */
	Scanner sc = new Scanner(System.in);
	String email;
	boolean isvalid = true;
	System.out.print("사용할 이메일을 입력하세요 >>>");
	email = sc.nextLine();	// 키보드 입력을 문자열로 처리합니다.
	int last = email.lastIndexOf("m");
	int lastidx = email.lastIndexOf("@");
	int idx = email.indexOf("@");
	String domain = email.substring(idx+1,last+1);
	String fi = "gmail.com";
	
	if(idx ==-1) {
		System.out.println("이메일 형식이 아닙니다");
		isvalid = false;
		
	}else if(lastidx==idx) {
		String account = email.substring(0, idx);
		int t1 = email.indexOf('%');
		int t2 = email.indexOf('$');
		if(fi.equals(domain)) {
			}else {System.out.println("도메인 이름이 틀립니다"); isvalid = false;}
		if(account.length()>5) {
		}else {System.out.println("계정은 6글자 이상 설정하셔야합니다");isvalid = false;}
		if(t1!=-1) {
			System.out.println("계정에는 특수문자가 들어가면 안됩니다");isvalid = false;}
		if(t2!=-1) {
			System.out.println("계정에는 특수문자가 들어가면 안됩니다");isvalid = false;}
		}System.out.println(isvalid);sc.close();
		}

//	// 처리조건 1,2,4,5에 해갈하지 않으면 메세지 출력하고 isValid 변수를 false로 합니다
//	}

	}
	
