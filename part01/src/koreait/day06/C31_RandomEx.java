package koreait.day06;

import java.util.Arrays;
import java.util.Random;
//수정
public class C31_RandomEx {

	public static void main(String[] args) {
		/*
		 * 학생 성적(국어) 분포 보고서를 만듭니다
		 * 학생 인원은 100명 - 점수는 랜덤값으로 테스트(0<=난수<=100)
		 * 90~100 :0 명 (0.0%) 카운트변수 5개 필요합니다
		 * 80~89 :0 명 (0.0%)		ㄴ counts[5] : 
		 * 70~79 :0 명 (0.0%)
		 * 60~69 :0 명 (0.0%)
		 * 60점 미만 :0 명 (0.0%)
		 * 
		 */
		Random r = new Random();
		int koreans[] = new int[100];
		int[] counts = new int[5];
		for (int i = 0; i<koreans.length;i++) {
			koreans[i] = r.nextInt(101);
		}// 점수 분포 count하기 : 0<= 난수<=100 범위로 만들었으므로 조건식에서 검사하지 않아도 됩니다
		System.out.println(Arrays.toString(koreans));
		for (int i = 0; i < koreans.length; i++) { 
			koreans[i]= r.nextInt(101);

			if(90<=koreans[i]) {
				counts[0]++;
			}
			else if(80<=koreans[i]) {
				counts[1]++;
			}
			else if(70<=koreans[i]) {
				counts[2]++;
			}
			else if(60<=koreans[i]) {
				counts[3]++;
			}
			else counts[4]++;
			
		}

		System.out.println("90~100 \t80~89\t70~79\t60~69\t60미만");
		System.out.println("-----------------------------------------------------------");
		for (int i = 0; i < counts.length; i++) {
			System.out.printf("%5d",counts[i]);
		}
		System.out.println();
		for (int i = 0; i < counts.length; i++) {
			System.out.printf("%5.1f%%",(double)counts[i]/koreans.length*100);
		}

		}

	}

	
	
