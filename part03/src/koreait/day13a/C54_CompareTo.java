package koreait.day13a;

public class C54_CompareTo {

	public static void main(String[] args) {
// ��� ��ü���� compareTo��� �޼ҵ尡 �ֽ��ϴ�. : ���� ��
		String na = "kim";
		String you = "momo";
		String he = "Son";
		
		// String�� ���ĺ�(������)�� : �빮�� < �ҹ���
		System.out.println("kim��momo : "+na.compareTo(you)); //-2(����) : "kim" < "momo"
		System.out.println("kim��Som : "+na.compareTo(he));	 // 24(���) : "kim" > "Son"
				
		int a =12, b=45;
		System.out.println("a-b : " +(a-b));
		
		Integer aa =12;
		Integer bb =45;
		System.out.println("aa�� bb : " + aa.compareTo(bb));
		aa = 90;
		System.out.println("90��45 : " + aa.compareTo(bb));
		aa = 45;
		System.out.println("45��45 : " + aa.compareTo(bb));

//		compareTo�� ���� �񱳴� sort (����)�� ���˴ϴ�.
//		������ �������� ,  �������� 2���� ���·� ������ �� �ִ�
	}

}
