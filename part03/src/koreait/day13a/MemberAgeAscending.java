package koreait.day13a;

import java.util.Comparator;

import koreait.day12.Member;
public class MemberAgeAscending implements Comparator<Member>{ {

}

@Override
public int compare(Member o1, Member o2) {
	Integer age1 = o1.getAge();
	Integer age2 = o2.getAge();
	
	// age 필드(1차 기준) 값이 같을 때 name필드 (2차 기준) 오름차순으로 정렬
	
	if(age1 == age2)
		return o1.getName().compareTo(o2.getName());
	else
		return age1.compareTo(age2);  // 오름차순 : age1<age2일때 -1을 리턴
}

}
