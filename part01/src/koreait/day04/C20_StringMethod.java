package koreait.day04;

public class C20_StringMethod {

	public static void main(String[] args) {
		String message = "hello~"; // java.lang.String (�⺻��Ű�� Ŭ����)
	
	// String Ŭ������ �޼ҵ�� �����ϴ�. �� �ܿ�� ����ϴ� ���� �ƴϰ� �޼ҵ��� �̸�, ����, ���������� �����ؼ� ����մϴ�
	
//		message.length(); 	//public int length()
//		message.charAt(0);	//public char charAt(int index)
//		
//		message.equals("Hello~"); // public boolean equals(Object anObject), Object�� ��� Ÿ��
//								  // message�� String Ÿ���̹Ƿ� Object�� String���� �ؼ��մϴ�
		
// ���ϰ�������?		
//		message.indexOf('e'); 	  //int
//		message.indexOf("lo");	  
//		message.substring(2); 	  //String
//		message.substring(2, 4);
//		message.replace("11", "*@"); //String
//�޼ҵ� �����ε�(overloading) : �޼ҵ� �̸��� ���������� ���� ���ڰ��� ������ ������ �ٸ��� ���ǵ� ��.
		
		
		int len = message.length();
		char temp = message.charAt(3);
		boolean isState = message.equals("Hello~");
		
		System.out.println("length() = " + len);
		System.out.println("charAt(3) = " + temp);
		System.out.println("equals(\"Hello\") = " + isState);
		
		System.out.println("indexOf('e') = "+message.indexOf('e')); // 1����ġ
		System.out.println("indexOf(\"lo\") = "+message.indexOf("lo")); // 3����ġ
		System.out.println("lastIndexOf(\"lo\") = "+message.lastIndexOf("lo"));
		System.out.println("indexOf(\"lo\") = "+message.indexOf("ol")); // -1 : ã�� ���ڿ��� ���� ��
		
		String test = "hello~hello~";
		System.out.println("test.indexOf(\"lo\") = "+test.indexOf("lo")); //3�� 
		System.out.println("test.lastIndexOf(\"lo\") = "+test.lastIndexOf("lo")); // lo�� ��ġ�ϴ� ��������ġ 9�� 
		
		System.out.println("message.substring(2) = "+message.substring(2) ); // �κ����� : �ӤӤ�~
		System.out.println("message.substring(2, 4) = "+message.substring(1, 3)); // �Ӥ�, 2������ 2��(4-2)
		System.out.println("message.replace(\"11\", \"*@\") = "+message.replace("ll", "*@")); // ġȲ : he*@o~
		System.out.println("startsWith(\"H\") = " + message.startsWith("h")); // false
		System.out.println("endWith(\"~\") = " + message.endsWith("~")); //true
	
		
	}

}
