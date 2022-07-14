package main;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import dao.CustomDao;
import vo.CustomVo;

public class CustomMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.ȸ�����  2.ȸ������Ʈ  3.ȸ����ȸ  4.ȸ������ ����  5.ȸ�� ���� ���� 6.���α׷�����");
		
		boolean run = true;
		CustomDao dao = CustomDao.getInstance();	//�̱��������� dao��ü ����
		while(run) {
			System.out.print("���� >>>");
			String sel = sc.nextLine();
		switch(sel) {
		case "1":
			// ȸ�� ID�� ���Ἲ ���� �˻�(�ߺ��� �˻�)
			String custom_id;
			
			while(true) {
			System.out.println("����� ID �Է� >>>");
			custom_id = sc.nextLine();
			if(dao.getOne(custom_id)!=null) {
				System.out.println("����� �� ���� id �Դϴ�");}
			else {
			System.out.println("����� �� �ִ� id �Դϴ�");
			break;
			}
		}
			System.out.println("�̸� : >>>");
			String name = sc.nextLine();
			System.out.println("�̸��� >>>");
			String email = sc.nextLine();
			System.out.println("���� >>>");
			int age = Integer.parseInt(sc.nextLine());
			CustomVo vo2 = new CustomVo(); vo2.setName(name);
			vo2.setCustom_id(custom_id);vo2.setEmail(email);vo2.setAge(age);
			dao.insert(vo2);
			break;
		case "2":
			List<CustomVo> list = dao.getList();
			System.out.print(list);
			break;
		case "3":
			System.out.print("��ȸ�� �� ID �Է� >>>");
			String id = sc.nextLine();
			CustomVo vo = dao.getOne(id);
			System.out.println(vo);
			break;
		case "4":
			System.out.println("������ ���̵� �Է� >>>");
			custom_id = sc.nextLine();
			vo2 = dao.getOne(custom_id);
			if(vo2 == null)
				System.out.println("���� ȸ�� id�Դϴ�.");
			else {
				System.out.println(String.format("����ȸ������ email : %s , age : %d",vo2.getEmail(),vo2.getAge()));
				System.out.println("������ �̸��� �Է� >>>");
				email = sc.nextLine();
				System.out.println("������ ���� �Է� >>>");
				age = Integer.parseInt(sc.nextLine());
				CustomVo vo3 = new CustomVo();vo2.setEmail(email);
				vo2.setAge(age);vo2.setCustom_id(custom_id);
				dao.update(vo2);
				System.out.println("���� �Ϸ� �Ǿ����ϴ�");
			}break;
//			System.out.println("������ �̸��� �Է� >>>");
//			email = sc.nextLine();
//			System.out.println("������ ���� �Է� >>>");
//			age = Integer.parseInt(sc.nextLine());
//			CustomVo vo3 = new CustomVo();vo3.setEmail(email);
//			vo3.setAge(age);vo3.setCustom_id(custom_id);
//			dao.update(vo3);
//			System.out.println("���� �Ϸ� �Ǿ����ϴ�");
//			break;
		case "5":
			System.out.println("������ ȸ���� ���̵� �Է��ϼ��� >>>");
			custom_id = sc.nextLine();
			if(dao.getOne(custom_id)==null)
				System.out.println("���� ȸ��");
			else {
				System.out.println("Ż��? >>>");
				if(sc.nextLine().equals("y")) {
					if(dao.delete(custom_id)==1)
						System.out.println("�Ϸ�");
				}else System.out.println("ȸ��Ż���ּ�");
			}
//			CustomVo vo4 = new CustomVo();vo4.setCustom_id(custom_id);
//			dao.delete(vo4);
//			System.out.println("�����Ǿ����ϴ�");
//			break;
		case "6":
			run = false;
			break;
		default:
			System.out.println("�޴� ���� �ٽ� �ϼ���(1~5)");
			break;
		
		} // switch end
	
	
	}
		System.out.println("THE END!");
		sc.close();
	}
}
