package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame2Start {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int max =10;
		int[]triallst = new int[max];
		GameValue[]history = new GameValue[10];
		int k=0;
		
		System.out.println("숫자 맞추기 게임 시작합니다.");
		System.out.println("게임을 시작하려면 너 휴먼의 이름을 쓰시오 >>>");
		String gamer = sc.nextLine();
		int rmin =11,rmax = 29;
		
		
		do {
			GameValue temp = new GameValue(gamer);
			System.out.println("이제 게임 시작합니다. 나 컴퓨터는 숫자를 결정했습니다");
			System.out.println(String.format("너, 휴먼은 맞춰보세요.(%d~%d)", rmin,rmax));
			int numComputer = GameValue.makeNumber(11, 29);
			int numHuman;
			int i = 0;
			do {
				System.out.print("생각한 숫자 입력(기회 : "+(max-i)+") -> ");
				numHuman = sc.nextInt();	
			if(numComputer > numHuman) {
				triallst[i] = numHuman;
				i++;
				System.out.println("아닙니다 더 큰 값입니다");
			}else if(numComputer < numHuman) {
				triallst[i] = numHuman;
				i++;
				System.out.println("아닙니다 더 작은 값입니다.");
			} 
			if(i==max) break;
			}while(numComputer != numHuman);
			// numComputer == numHuman 이면 답을 맞춘 것. -> do~while 종료
			if(i==max) {
				System.out.println("너 휴먼 입력 내용 : " + Arrays.toString(triallst));
				System.out.println("주어진 기회를 다 쓰셨습니다. 게임을 다시 시작하세요");
				System.out.println("답은 " + numComputer);
				temp.setCount(max);
			}else {
				System.out.println("딩동댕~ 맞추셨습니다. 성공까지 시도횟수 : "+(i+1));
				temp.setCount(i+1);
				temp.setSuccess(true);
			}
			history[k] = temp; //temp는 GameValue 객체의 참조값
			k++;
			
			System.out.println("게임을 계속하시겠습니까? 계속하려면 0 입력 >>>");
			}while(sc.nextInt() == 0);
			System.out.println(":::::::::게임스코어::::::::");
			// for 반복으로 history 배열에 저장된 값 출력하기
			for (int j = 0; j < k; j++) {
				history[j].print();    //history[j]타입은 GameValue
			}
			System.out.println(":::::::::게임 끝:::::::::");
			
		}
	}
	


