package koreait.day07;


public class C41_StudentScore {

	public static void main(String[] args) {
		
		Student[] stus = new Student[5];	// 배열요소 10개
		String[]names = {"이하늬","김모모","박나연","홍길동","박지성"};
		stus[0] = new Student();
		stus[0].name = names[0];
		stus[0].no = 1;
		stus[0].grade = 3;
		
		for (int i = 1; i < stus.length; i++) {
			stus[i] = new Student();
			stus[i].name =names[i];
			stus[i].no = i+1;
			stus[i].grade = 3;
		}
		for (int i = 0; i < stus.length; i++) {
			System.out.println(stus[i]);
		}
		// 각 생성된 Student 객체가  Score 객체를 필드로 갖도록 합니다.
//		for (int i = 0; i < stus.length; i++) {
//			System.out.println(stus[i].name + "점수입력하세요");
//			Score temp = new Score();
//			temp.input();
//			stus[i].score = temp;
//			System.out.println(stus[i]);
//		}
		for (int i = 0; i < stus.length; i++) {
			System.out.println(stus[i].name + " 점수입력하세요");
			stus[i].score = new Score();
			stus[i].score.input();
			System.out.println(stus[i]);
			
		}
		System.out.println("[[성적 통계]]");
		System.out.printf("%8s %10s %8s %8s\n","번호","이름","총점","평균");
		for (int i = 0; i < stus.length; i++) {
			System.out.printf("%5d %7s %8d %8.1f\n",stus[i].no,stus[i].name,
					stus[i].score.sum(),stus[i].score.average());
		}
	}

}
