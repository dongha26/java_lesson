package koreait.day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C63_TryCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// try ����
		try {
			// Exception ���ɼ��� �ִ� ������ �ۼ�.-> ������ ����� catch�� ���ϴ�
			// �� ��ġ���� ���� �����ϸ� try{ }�� ��������
		} catch (NullPointerException e) { // �������ο� ���� Exception ������ �˻��մϴ�.
				//NullPointerException �϶��� �Ʒ� ���ɵ� ó���մϴ�.
			e.printStackTrace(); //������ �����ϱ� ���� ������ ���(���� Exception ��� ����)
		} catch (NumberFormatException e) {
				//catch�� ������ �ۼ� �����մϴ�.
		} finally { // ���������� , ���������� : ���� �߻� ������� ����Ǵ� �κ��Դϴ�.
			// �ַ� �ڿ��� �����ϴ� �ڵ� �ۼ��մϴ�.
			sc.close();
		}
		
		//try ������ ���� �Ǵ� catch ������ ������ ������ ������ ��� �˴ϴ�.
	}

}