package koreait.day11;
/*
 * �߻�Ŭ���� :
 *  1.��ü�� ������������ �ʴ� ������ Ŭ���� �Դϴ�. new ���� ����
    2.�߻�޼ҵ带 ���� �ֽ��ϴ�. �߻�(abstract): ��üȭ���� ���� ����.
	3.�θ�Ŭ�������� ��üȭ���� ���� �߻�޼ҵ带 �ڽ�Ŭ������ ������(�������̵�)�ϵ��� �ϴ� ���Դϴ�.
	4.���� : '���'�� �߻�ȭ ����. '�����'�� ��üȭ�� ��ü
 */
public abstract class ClassAbs {
 
	String name;
	public abstract void test();
	
	public void print() {
		System.out.println("name = "+name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
