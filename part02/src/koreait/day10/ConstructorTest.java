package koreait.day10;

public class ConstructorTest {

	public static void main(String[] args) {

	}

}
class Product{
	int price;
	
	// 디폴트 생성자는 동작을 안합니다

	
	public Product(int price) {
		this.price = price;
	}
}
class Food extends Product{ 
	//Product() 디폴트 생성자 실행 없으면 오류 
	// 자식클래스도 커스텀 생성자를 정의해서 부모클래스 커스텀 생성자를 호출
	
	public Food(int price) {
		super(price);
	}
}
class Electronics extends Product{
public Electronics(int price) {
	super(price);		// Super() 디폴트 생성자 대신에 커스텀 생성자 호출
}	
}