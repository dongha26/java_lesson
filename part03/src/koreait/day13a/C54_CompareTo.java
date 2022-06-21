package koreait.day13a;

public class C54_CompareTo {

	public static void main(String[] args) {
// 모든 객체에는 compareTo라는 메소드가 있습니다. : 값의 비교
		String na = "kim";
		String you = "momo";
		String he = "Son";
		
		// String은 알파벳(사전식)비교 : 대문자 < 소문자
		System.out.println("kim과momo : "+na.compareTo(you)); //-2(음수) : "kim" < "momo"
		System.out.println("kim과Som : "+na.compareTo(he));	 // 24(양수) : "kim" > "Son"
				
		int a =12, b=45;
		System.out.println("a-b : " +(a-b));
		
		Integer aa =12;
		Integer bb =45;
		System.out.println("aa와 bb : " + aa.compareTo(bb));
		aa = 90;
		System.out.println("90과45 : " + aa.compareTo(bb));
		aa = 45;
		System.out.println("45와45 : " + aa.compareTo(bb));

//		compareTo와 같은 비교는 sort (정렬)에 사용됩니다.
//		정렬은 오름차순 ,  내림차순 2가지 상태로 정렬할 수 있다
	}

}
