
package koreait.day04;

public class C19_MethodTest {
	// main �޼ҵ� : ������ ������ ���α׷� ������ ���ؼ��� �� �־���� �޼ҵ�
	public static void main(String[] args) {
	
	System.out.println("�޼ҵ带 ���� �����ؼ� ����غ��ϴ�.");
	System.out.println("���α׷��� main �޼ҵ��� ��ɹ��� ������� �����ϰ� �߰��� �޼ҵ� ȣ���� ������ �޼ҵ尡 ���ǵ� ������ ����");
	System.out.println("��� �̵��մϴ� . �޼ҵ� ������ ����Ǹ� �ٽ� main �޼ҵ�� ��� ���ƿɴϴ�");
	methodA(); //�޼ҵ� ȣ��	
	System.out.println("2.");
	methodB(11,33);
	methodB(929,111);	
	System.out.println("3.");
	methodC(929,12.1);
	methodC(929,121);
	System.out.println("4.");
	methodD();
	System.out.println("return = " + methodD());
	int temp = methodD();
	System.out.println("return = "+ temp);
	System.out.println("5.");
	double result = methodE(314,3.14);
	System.out.println("result = "+result);
	System.out.println("6.");
	System.out.println(methodF('i',4));
	
	char ch = 'a';
	int val = 3;
	ch = methodF(ch,val);
	System.out.println("return = "+ch);
	}
	/*
	 * String Ŭ������ �޼ҵ带 �����ϱ� ���ؼ�, ���� 
	 *   								�� �޼ҵ��� ���� ����
	 * 
	 * �޼ҵ��� �ֿ��� : ��ȯ��(����), ����(argument)�Ǵ� �Ű�����:parameter),�޼ҵ� �̸�,public,static ���� ����
	 *		�� ��ȯ�� : �޼ҵ� ���� �Ϸ�Ǹ� ������� �����
	 *		�� ���� : �޼ҵ� ������ ���ؼ� �ʿ��� ������(���İ� ������ ���� �ʿ�) - ������ ������ ������ �پ��մϴ�.
	 *		�� �޼ҵ� �̸� : �ĺ���
	 *		�� public : ����������, static : ������ ���
	 *
	 *
	 */ 	
	
	// static �� main���� ������ �޼ҵ�� �����ϰ� static �̾���մϴ�
	public static void methodA() {
		System.out.println("ù��° �޼ҵ� ���� �����Դϴ�.");
	}
	public static void methodB(int a , int b) {
		System.out.println("�ι�° �޼ҵ� ���� �����Դϴ�");
		System.out.println("���޹��� �� a ="+a+",b ="+b);
	}
	public static void methodC(int a , double b) {
		System.out.println("����° �޼ҵ� ���� �����Դϴ�");
		System.out.println("���޹��� �� a ="+a+",b ="+b);
	}
	public static int methodD() {
		System.out.println("�׹�° �޼ҵ� ���� �����Դϴ�");
		return 999;
	}
	public static double methodE(int a, double b) {
		System.out.println("�ټ���° �޼ҵ� ���� �����Դϴ�");
		return a+b;
	}
	public static char methodF(char ch,int size) {
		System.out.println("������° �޼ҵ� ���� �����Դϴ�");
		return (char)(ch+size);
	}
}
