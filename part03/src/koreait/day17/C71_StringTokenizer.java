package koreait.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class C71_StringTokenizer {
// token : ǥ��(�ּҴ���)
// Tokenizer : ��ūȭ(�ּҴ����� ǥ������ �����,���б�ȣ�� ����)
	public static void main(String[] args) {
		
		String temp = "��� 90 88 79";
		// ��ūȭ : StringTokenizer Ŭ������ ����� ���
		// ���б�ȣ�� �⺻ ���� : ����, ��, �ٹٲ�
		StringTokenizer stk = new StringTokenizer(temp);
		System.out.println("1. nextToken �޼ҵ�");
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println("hasMoreTokens? "+stk.hasMoreTokens());
		
		//"��� 90 88 79"
		// ��(��ũ�������� ������,nextToken �޼ҵ� �� ��ġ�̵�)
		
		System.out.println("2. �ݺ������� hasMoreToken �޼ҵ�");
		stk = new StringTokenizer(temp);//Tokenizer ��ü �ٽ� ����
		while(stk.hasMoreTokens()) {	// ������ �о�� ��ū�� ������
			System.out.println(stk.nextToken());
		}
		System.out.println("3. �������� ���б�ȣ ����ϱ�");
		temp = "���,90,88()79";
		stk = new StringTokenizer(temp," ,()"); 
		//�ι�° ���ڴ� delimiter : ���б�ȣ ���ڸ� �����մϴ�(���Խľƴմϴ�)
		while(stk.hasMoreTokens()) {	// ������ �о�� ��ū�� ������
			System.out.println(stk.nextToken());
		}
		System.out.println("4. ��ūȭ �����ͷ� ��ü �����");
		temp = "��� 90 88 79";
		stk = new StringTokenizer(temp);
		Score score = null;
		while(stk.hasMoreTokens()) {
			score = new Score(stk.nextToken(), 
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()));
		}
		System.out.println("������ Score ��ü : "+score);
		System.out.println("���� : " + score.sum());
		System.out.println("��� : " + score.average());
		System.out.println("���� : " + score.getGrade());
		
		//List�� �����
		temp = "��� 90 88 79\n���� 78 83 79\n�ź� 92 73 66";
		stk = new StringTokenizer(temp);
		List<Score>scores = new ArrayList<>();
		while(stk.hasMoreTokens()) {
			score = new Score(stk.nextToken(),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()));
			scores.add(score);
		}
		System.out.println("��ū������ ��� : "+scores);
		scores.clear();
		//split �޼ҵ带 ��� ��ü�� ���� �� �������?
		String[]result = temp.split("[ \n]");
		System.out.println(Arrays.toString(result));
		for (int i = 0; i < result.length; i+=4) {
			Score s = new Score(result[i+0],
					Integer.parseInt(result[i+1]),
					Integer.parseInt(result[i+2]),
					Integer.parseInt(result[i+3]));
			scores.add(s);
		}
		System.out.println("��ū������ ��� : "+scores);
	
	}

}