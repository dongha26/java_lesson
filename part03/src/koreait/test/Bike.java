package koreait.test;

public class Bike extends Product{
	//김동하
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
		return "당신은 "+ prdName+"를 시속"+speed+"Km로 탈 수 있습니다";
	}



	@Override
	public String sell(Object o) {		
		return String.format("추가 할인 행사 %d%% 인하", o);
	}
	
	public String toString() {
		return "Bike [price=" + price + ", prdName=" + prdName + ", speed=" +speed+ "]";
	}


}

