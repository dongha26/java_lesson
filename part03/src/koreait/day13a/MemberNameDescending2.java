package koreait.day13a;

import java.util.Comparator;

import koreait.day12.Member;

public class MemberNameDescending2  implements Comparator<Member>{ {

}

public int compare(Member o1, Member o2) {
	
	return o2.getName().compareTo(o1.getName());  // 오름차순 : age1<age2일때 -1을 리턴
}

}


