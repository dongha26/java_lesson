package koreait.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// C42���� MathProblem Ŭ������ ����ϴ� ������ �ٲٱ� : ������ ����
public class C48_MathList{
//�赿��
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int sz =5;
		int max_size = MathProblem.max_size;
		ArrayList<MathProblem> problem = new ArrayList<>();
		ArrayList<Integer> no = new ArrayList<>();
		// ��� ������ �����ϴ� �迭
		// �迭�� Ÿ���� MathProblem


		// �迭�� Ÿ���� MathProblem ��ü������ : n1,n2,op,isCorrect
		
		int n1,n2,ans;
		int cnt=0;
		System.out.println("----------------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("----------------------------");
		System.out.println("�����մϴ�");
		for (int i = 0; i < sz; i++) {
			MathProblem temp = new MathProblem('+');
			temp.makeProb();
		
			System.out.println("����"+(i+1)+". "+temp.problem() + " �� �Է� : ");

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
		System.out.println("ä���մϴ� ��������"+(cnt)+"("+((cnt)*100/sz)+"��");
		System.out.println("Ʋ�� ���� ���亸��");
		for (int i = 0; i < problem.size(); i++) {
			if(!problem.get(i).isCorrect()) {
				System.out.println("����"+(i+1)+". "+ problem.get(i).problem() + problem.get(i).showAnswer());
				
			}
		}System.out.println("----����ڰ� Ʋ�� ������ ����----");
		// �߰� : ����� �Է��� ans�� �����ؼ� ���� ��½� ���� �����ְ� �ʹٸ�?
		for (int i = 0; i < sz; i++) {
			if(!problem.get(i).isCorrect()) {
				System.out.println("����"+(i+1)+". "+ problem.get(i).problem()+ no.get(i));
				
			}
		}
		
	}

}
