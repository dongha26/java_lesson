package koreait.day14;

public class C61_FunctionATest {

	public static void main(String[] args) {
		
		// 1) �͸�Ŭ���� : �߻�޼ҵ��� ���� ��������ϴ�
		FunctionA fa = new FunctionA() {

			@Override
			public int method(int a, int b) {
				// TODO Auto-generated method stub
				System.out.print("a*b = ");
				return a*b;
			}
			
		};
		
		System.out.println(fa.method(23, 11));
		
		//2) ���ٽ� : �߻�޼��尡 1���� ���� ���� �Լ��� �������̽��� ǥ���� �����մϴ�(�޼ҵ� �̸��� ������ ����)
		fa = (int a,int b) ->{
			System.out.print("a+b = ");
			return a+b;
		};
		
		System.out.println(fa.method(23, 11));
	}

}
