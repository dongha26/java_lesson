package koreait.test;

public class Bike extends Product{
	//�赿��
	private int speed;
	
	
	public Bike() {
	}
	public Bike(int price , String prdName , int speed) {
		this.price = price;
		this.prdName =prdName;
		this.speed = speed;
		
	}
	
	
	
	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String ride() {
		return "����� "+ prdName+"�� �ü�"+speed+"Km�� Ż �� �ֽ��ϴ�";
	}



	@Override
	public String sell(Object o) {		
		return String.format("�߰� ���� ��� %d%% ����", o);
	}
	
	public String toString() {
		return "Bike [price=" + price + ", prdName=" + prdName + ", speed=" +speed+ "]";
	}


}

