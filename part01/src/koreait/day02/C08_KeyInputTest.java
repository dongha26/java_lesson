package koreait.day02;

public class C08_KeyInputTest {

	public static void main(String[] args) {
	//�赿��
	int	k=23;
	int s=19;
	int i = k*s;
	System.out.printf("����%d�� x����%d�� = ���� %d�� \n",k,s,i);
	System.out.println("���̴�"+i+"���Դϴ�");
	
	final double PI = 3.14;
	double b = 23.230;
	double o = 2*PI*b;
	double n = PI*b*b;
	System.out.printf("�ѷ��� ���߽��ϴ� �ѷ��� = %.3f\n��",o);
	System.out.printf("���̸� ���߽��ϴ� ���̴� = %.3f��",n);
	
	
	//final �׽�Ʈ
	//		�������� �տ� final Ű���带 ���̸� ���� �������� ���մϴ�.
	
	final int test = 123; // ���� ���� ���ϴ� ����Դϴ�.
	System.out.println("test ="+test);
	}

}
