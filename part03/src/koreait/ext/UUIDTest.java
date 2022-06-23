package koreait.ext;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.UUID;

import com.google.common.hash.Hashing;

public class UUIDTest {

	public static void main(String[] args) {
		
		String uuid; 
		//16���� 32�ڸ� +������ ��ȣ 4���� ��������� �������ڿ�
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
		 * git ��ū�� : 16���� 36�ڸ� ->
		 * ������Ʈ���� ȸ�����Խ� ��й�ȣ�� �����մϴ�.(�н����� ����)��й�ȣ�� �������� ��� ������ �ɱ��?
		 * 	-> �ؽ� (��ȣȭ�� �ȵǴ� �Լ�) �Լ��� �̿��ؼ� ���ڿ��� ���� �ĺ�������
		 *  -> ��й�ȣ 1234�� ���� �ؽ��Լ� ���� ���� �α��� 1234
		 *  -> ��ǥ���� �ؽ��Լ� sha256 �˰���(�ڹٿ��� �������� MessageDigest Ŭ�������)
		 *  
		 * ��ȣȭ : �� -> ��ȣ��,��ȣȭ : ��ȣ�� -> �� (����Ű�� ����Ű�� �̿�)
		 * 
		 * 
		 * 
		 */
	String password; 	// ��
	String sha256 = Hashing
			.sha256().hashString("test#12",StandardCharsets.UTF_8)
			.toString(); 	//sha 256���� ������� �ؽ̰�(������ ����Ȱ��̶�� �����ϱ�)
	System.out.println("sha256 �� :" +sha256);
	Scanner sc = new Scanner(System.in);
	System.out.print("��ȣ �Է��ϼ��� ");
	String you = sc.nextLine();
	password = Hashing.sha256().hashString(you,StandardCharsets.UTF_8).toString();
	System.out.println("�Է��� sha256 �� : "+password);
			
	if(sha256.equals(password))		//�ؽ̰� ��
		System.out.println("��ȣ�� ��ġ�մϴ�");
	else 
		System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�");
}

}
