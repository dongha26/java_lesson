package koreait.day09a;
/*
 * Ŭ������ ���
 * -> Ŭ���� ���� �θ�(����Ŭ����,super) - �ڽ�(����Ŭ����)���谡 ��������ϴ�
 * -> �θ��� Ŭ���� ������Ҹ� �ڽ��� ����� �� �ֽ��ϴ� ��ӵǴ� ��Ҵ� �ʵ�,�޼ҵ�
 * -> extends Ű���� ����Ͽ� �θ�Ŭ������ �����մϴ�. ����Ŭ������ ���� 1���Դϴ�
 * -> private ���������ڴ� ��� �ȵ˴ϴ�.
 * -> protected�� �ٸ� ��Ű���� �ڽ�Ŭ������ ��ӹ��� �� �ֵ��� �մϴ�
 * -> ���Ǽ�����  �ݷ��������� �. ������ ������ ���ؼ� Ŭ������ ����. ������ ���� ��,�����,�ܽ���...
 * �ϳ��� �׷����� Animal Ŭ���� �����ϰ� �������� ��Ҹ� ����
 * -> ������ ��Ұ� �ƴѰ��� ��ü���� Ŭ������ �����մϴ�(�� , Cat,Dog,Rabbit)�׸��� Animal Ŭ������ ��ӹ޽��ϴ�
 * 
 */
public class ClassA { //�θ�Ŭ����
	int ab;
	String name;
	protected String title; // protected�� default �����������̳� �ڽ�Ŭ������ ���ܷ� ���
	
	void print() {
		System.out.println("ab = "+ab);
		System.out.println("name = "+name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
