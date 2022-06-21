package koreait.day12;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class C51_TodayMenu {

	public static void main(String[] args) {
		System.out.println("오늘의 저녁메뉴 투표합니다 . !!!");
		System.out.println("치맥,떡볶이,곱창,불고기,햄버거");
		
		// key : 메뉴이름, value : 투표수
		// 초기화
		HashMap<String,Integer>map = new HashMap<>();
		map.put("치맥", 0);
		map.put("떡볶이", 0);
		map.put("곱창", 0);
		map.put("불고기", 0);
		map.put("햄버거", 0);
		map.put("오징어물회", 0);
		
		Scanner sc = new Scanner(System.in);
		// 메뉴 선택(반복)
		while(true) {
			System.out.println("선택 메뉴 음식명 입력하세요.(종료는 end 입력) -->");
			String menu = sc.nextLine();
			if(menu.equals("end")) break;
			
			if(!map.containsKey(menu)== false) { // map의 key값에 menu 입력 문자열이 있는지
				System.out.println("없는 메뉴입니다. 다른 것을 투표해주세요");
				map.put(menu, 1);
				continue;
		}
				// 입력받은 menu의 value 값을 가져오기 --> +1하기 -> 결과를 저장하기.
			int temp = map.get(menu);
//			++temp;
//			map.put(menu, temp);
			map.put(menu, ++temp);
			System.out.println(map);
			
			
		}
		System.out.println("투표종료합니다");
		System.out.println(map);
		System.out.println("최대 득표수 : " + Collections.max(map.values()));//가장 큰 value
		System.out.println("참고 : " + Collections.max(map.keySet()));	 //가장 큰 key
	}

}
