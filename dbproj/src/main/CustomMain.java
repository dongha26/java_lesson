package main;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import dao.CustomDao;
import vo.CustomVo;

public class CustomMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.회원등록  2.회원리스트  3.회원조회  4.회원정보 변경  5.회원 정보 삭제 6.프로그램종료");
		
		boolean run = true;
		CustomDao dao = CustomDao.getInstance();	//싱글턴패턴의 dao객체 생성
		while(run) {
			System.out.print("선택 >>>");
			String sel = sc.nextLine();
		switch(sel) {
		case "1":
			// 회원 ID의 무결성 조건 검사(중복값 검사)
			String custom_id;
			
			while(true) {
			System.out.println("사용할 ID 입력 >>>");
			custom_id = sc.nextLine();
			if(dao.getOne(custom_id)!=null) {
				System.out.println("사용할 수 없는 id 입니다");}
			else {
			System.out.println("사용할 수 있는 id 입니다");
			break;
			}
		}
			System.out.println("이름 : >>>");
			String name = sc.nextLine();
			System.out.println("이메일 >>>");
			String email = sc.nextLine();
			System.out.println("나이 >>>");
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
			System.out.print("조회할 고객 ID 입력 >>>");
			String id = sc.nextLine();
			CustomVo vo = dao.getOne(id);
			System.out.println(vo);
			break;
		case "4":
			System.out.println("수정할 아이디 입력 >>>");
			custom_id = sc.nextLine();
			vo2 = dao.getOne(custom_id);
			if(vo2 == null)
				System.out.println("없는 회원 id입니다.");
			else {
				System.out.println(String.format("현재회원정보 email : %s , age : %d",vo2.getEmail(),vo2.getAge()));
				System.out.println("수정할 이메일 입력 >>>");
				email = sc.nextLine();
				System.out.println("수정할 나이 입력 >>>");
				age = Integer.parseInt(sc.nextLine());
				CustomVo vo3 = new CustomVo();vo2.setEmail(email);
				vo2.setAge(age);vo2.setCustom_id(custom_id);
				dao.update(vo2);
				System.out.println("변경 완료 되었습니다");
			}break;
//			System.out.println("수정할 이메일 입력 >>>");
//			email = sc.nextLine();
//			System.out.println("수정할 나이 입력 >>>");
//			age = Integer.parseInt(sc.nextLine());
//			CustomVo vo3 = new CustomVo();vo3.setEmail(email);
//			vo3.setAge(age);vo3.setCustom_id(custom_id);
//			dao.update(vo3);
//			System.out.println("변경 완료 되었습니다");
//			break;
		case "5":
			System.out.println("삭제할 회원의 아이디를 입력하세요 >>>");
			custom_id = sc.nextLine();
			if(dao.getOne(custom_id)==null)
				System.out.println("없는 회원");
			else {
				System.out.println("탈퇴? >>>");
				if(sc.nextLine().equals("y")) {
					if(dao.delete(custom_id)==1)
						System.out.println("완료");
				}else System.out.println("회원탈퇴최소");
			}
//			CustomVo vo4 = new CustomVo();vo4.setCustom_id(custom_id);
//			dao.delete(vo4);
//			System.out.println("삭제되었습니다");
//			break;
		case "6":
			run = false;
			break;
		default:
			System.out.println("메뉴 선택 다시 하세요(1~5)");
			break;
		
		} // switch end
	
	
	}
		System.out.println("THE END!");
		sc.close();
	}
}
