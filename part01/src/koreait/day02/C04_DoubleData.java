package koreait.day02;

public class C04_DoubleData {

	public static void main(String[] args) {
		
		System.out.println("Float ����������--------");
		System.out.println("�޸�ũ�� :"+ Float.BYTES); // 
		System.out.println("Float ������ �ּҰ� :"+Float.MIN_VALUE);
		//1.4E-45 �� 1.4*10�� -45�� , 3.4028235E38�� 10�� 38��
		System.out.println("Float ������ �ִ밪 :"+Float.MAX_VALUE);

		System.out.println("Double ����������--------");
		System.out.println("�޸�ũ�� :"+ Double.BYTES); // 
		System.out.println("Double ������ �ּҰ� :"+Double.MIN_VALUE);
		//4.9E-324�� 4.9�� -324�� , 1.7976931348623157E308 �� 10�� 308��
		System.out.println("Double ������ �ִ밪 :"+Double.MAX_VALUE);

	}

}
/* �Ǽ� �����ʹ� ��ǻ�� �������� �ε��Ҽ��� �������� �ٷ�ϴ�.
 * ���� ��� 1.23 * 10�� 23�¿��� 1.23(����) �� 23(�ڼ�) �� 
 * ���� � ũ�⸸ŭ �Ҵ��ϴ��Ŀ� ���� 
 * ���� ǥ�������� ���е�(������ �Ҽ����� float�� 7�ڸ�, double�� 16�ڸ�)�� �����˴ϴ�.
 * �Ǽ� ������ �⺻ ���� : float ,double 
 * 	   Wrapper Ŭ������ Float, Double
 * 		1.234�� double �����Դϴ�.
 */
