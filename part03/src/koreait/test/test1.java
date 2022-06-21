package koreait.test;

public class test1 {
//±èµ¿ÇÏ
	public static void main(String[] args) {
		Product[] cart = new Product[10];//13
		cart[0] = new Bike(123000,"MTB",25);
		cart[3] = new Bike(99000,"»ïÃµ¸®",15);
		cart[1] = new Electronics(35000,"USB",0);
		cart[5] = new Electronics(117000,"ipad",0);
		cart[7] = new Electronics(2250000,"lg³ÃÀå°í",0);
		
		((Electronics) cart[7]).setKwh(0.9);
		
		
		
		System.out.println(((Electronics) cart[7]).power());//14
		
		for(Product temp : cart)
			if(temp!=null && temp.price >= 100000)
				System.out.println(temp); //15
		
		for (int i = 0; i < cart.length; i++) {
			if(cart[i] != null && cart[i] instanceof Bike)
				System.out.println(((Bike)cart[i]).ride()); //16
		}

		}

	}


