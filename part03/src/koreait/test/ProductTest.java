package koreait.test;

public class ProductTest {
//±Ëµø«œ
	public static void main(String[] args) {
	
	}

}
class Electronics extends Product{
	private double kwh;
	
	public Electronics() {
		
	}
	public Electronics(int price , String prdName, double kwh) {
	this.price = price;
	this.prdName = prdName;
	this.kwh = kwh;
	
	}
	
	@Override
	public String sell(Object o) {
		
		return String.format("π≠¿ΩªÛ«∞ - %s(1set)", o);
	}
	public double power() {
		return kwh*24;
	} 
	public double getKwh() {
		return kwh;
	}
	public void setKwh(double kwh) {
		this.kwh = kwh;
	}

	public String toString() {
		return "Electronics [price=" + price + ", prdName=" + prdName + ", kwh=" +kwh+ "]";
	}
	
	
	
}
