package koreait.day04;

import java.util.Scanner;

public class C21_StringEx {

	public static void main(String[] args) {
		/*  ���� �̸��� ������ üũ�ϴ� ��� ���� 
		 *  1. @ ��ȣ�� 1�� ���ԵǾ�� �մϴ�.	(�޽��� : �̸��� ������ �ƴմϴ�.)
		 *  		�� indexof �� -1�� �ƴϰ� indexof �� lastindexof �� ���� ���ΰ�?
		 *  
		 *  2. 1���� ���� �� @ �ڿ��� gmail.com �̾�� �մϴ�. (�޽��� : ������ �̸��� Ʋ���ϴ�.)
		 *  		�� '@' �� indexof �� ���ؼ� �� �ں��� ������ substring ������ ���ڿ��� equals ��
		 *  
		 *  3. 2���� ���� �� @ �ձ����� ���ڿ�(�����̸�)�� �����մϴ�.
		 *  		�� '@' �� indexof �� ���ؼ� ó�� ���� '@' ���� ������ ���ڿ� substring ����
		 *  
		 *  4. 3���� �����̸��� 6���� �̻��̾�� �մϴ�.
		 *  		�� 3���� ���ڿ��� length() �� 6���� ��
		 *  
		 *  5. 3���� �����̸����� Ư����ȣ $,%�� ���ԵǸ� �ȵ˴ϴ�. 
		 *   		�� indexof('$') , indexof('%') �� ��� -1�� �ƴϸ� �����ϴ� ��ȣ ����
		 */
	Scanner sc = new Scanner(System.in);
	String email;
	boolean isvalid = true;
	System.out.print("����� �̸����� �Է��ϼ��� >>>");
	email = sc.nextLine();	// Ű���� �Է��� ���ڿ��� ó���մϴ�.
	int last = email.lastIndexOf("m");
	int lastidx = email.lastIndexOf("@");
	int idx = email.indexOf("@");
	String domain = email.substring(idx+1,last+1);
	String fi = "gmail.com";
	
	if(idx ==-1) {
		System.out.println("�̸��� ������ �ƴմϴ�");
		isvalid = false;
		
	}else if(lastidx==idx) {
		String account = email.substring(0, idx);
		int t1 = email.indexOf('%');
		int t2 = email.indexOf('$');
		if(fi.equals(domain)) {
			}else {System.out.println("������ �̸��� Ʋ���ϴ�"); isvalid = false;}
		if(account.length()>5) {
		}else {System.out.println("������ 6���� �̻� �����ϼž��մϴ�");isvalid = false;}
		if(t1!=-1) {
			System.out.println("�������� Ư�����ڰ� ���� �ȵ˴ϴ�");isvalid = false;}
		if(t2!=-1) {
			System.out.println("�������� Ư�����ڰ� ���� �ȵ˴ϴ�");isvalid = false;}
		}System.out.println(isvalid);sc.close();
		}

//	// ó������ 1,2,4,5�� �ذ����� ������ �޼��� ����ϰ� isValid ������ false�� �մϴ�
//	}

	}
	
