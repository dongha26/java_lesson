package koreait.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// C42번을 MathProblem 클래스를 사용하는 것으로 바꾸기 : 연산은 덧셈
public class C48_MathList{
//김동하
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int sz =5;
		int max_size = MathProblem.max_size;
		ArrayList<MathProblem> problem = new ArrayList<>();
		ArrayList<Integer> no = new ArrayList<>();
		// 모든 문제를 저장하는 배열
		// 배열의 타입은 MathProblem


		// 배열의 타입은 MathProblem 객체참조형 : n1,n2,op,isCorrect
		
		int n1,n2,ans;
		int cnt=0;
		System.out.println("----------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("----------------------------");
		System.out.println("시작합니다");
		for (int i = 0; i < sz; i++) {
			MathProblem temp = new MathProblem('+');
			temp.makeProb();
		
			System.out.println("문제"+(i+1)+". "+temp.problem() + " 답 입력 : ");

			ans = sc.nextInt();
			if(ans != temp.showAnswer()) {
				no.add(ans);
				temp.setCorrect(false);
				}
			if(ans == temp.showAnswer()) {
				cnt++;
				temp.setCorrect(true);
				
		}problem.add(temp);
			}
		System.out.println("------------------------------------");
		System.out.println("채점합니다 맞은갯수"+(cnt)+"("+((cnt)*100/sz)+"점");
		System.out.println("틀린 문제 정답보기");
		for (int i = 0; i < problem.size(); i++) {
			if(!problem.get(i).isCorrect()) {
				System.out.println("문제"+(i+1)+". "+ problem.get(i).problem() + problem.get(i).showAnswer());
				
			}
		}System.out.println("----사용자가 틀린 문제와 오답----");
		// 추가 : 사용자 입력한 ans를 저장해서 오답 출력시 같이 보여주고 싶다면?
		for (int i = 0; i < sz; i++) {
			if(!problem.get(i).isCorrect()) {
				System.out.println("문제"+(i+1)+". "+ problem.get(i).problem()+ no.get(i));
				
			}
		}
		
	}

}
