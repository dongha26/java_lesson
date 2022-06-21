package koreait.day11.test;

public class AnimalTest5 {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[10];
		animals[0] = new Dog();
		animals[2] = new Dog();
		animals[3] = new Frog();
		animals[3].setName("개굴A");
		animals[4] = new Frog();
		animals[4].setName("개굴B");
		animals[6] = new Crow();
		
		for(Animal temp : animals)
			if(temp != null) {
				temp.act(); 
			}	
		
		//현재시간 : ms ,ns (1970년 1월1일 자정을 기준으로 단위마다 카운트한 값입니다.) 
		System.out.println("현재시간............");
		System.out.println(System.currentTimeMillis() + " ms");  //0.001초
		System.out.println(System.nanoTime() + " ns");	//0.000000001초
		
		//개구리가 몇마리인지..... instanceof
		int cnt=0;		//카운트 변수
		long start = System.nanoTime();	//현재 시간을 ns(0.000000001초) 단위로 구함.
		System.out.println("개구리 먹이주기 .................");
		for(Animal temp : animals) {
			if(temp != null && temp instanceof Frog ) {
				cnt++;
				System.out.println(temp.eat(100*(cnt+2)));
			}
		}
		long end = System.nanoTime();
		System.out.println("개구리 먹이주는 데 걸린시간 :" + (end-start) + " ns");
		System.out.println("개구리는 " + cnt +" 마리 살고 있습니다.");
		
		//강아지가 몇마리인지 ....  int type 필드이용해서 합니다.
		start=System.nanoTime();
		System.out.println("강아지 먹이주기 ..............");
		cnt=0;
		for(Animal temp : animals) {
			if(temp !=null && temp.type == Animal.DOG) {
				cnt++;
				System.out.println(temp.eat("맛있는 간식"));
			}
		}
		end=System.nanoTime();
		System.out.println("강아지 먹이주는 데 걸린시간 :" + (end-start) + " ns");
		System.out.println("강아지 " + cnt +" 마리 살고 있습니다.");
		
		System.out.println("까마귀에게 먹이주기 ..................");
		System.out.println(animals[6].eat(animals[3]));
	}
}

class Frog extends Animal{	//개구리

	protected String mouth;  //디폴트 한정자+다른패키지 자식클래스
	public Frog() {
		System.out.println("새로운 동물가족은 Frog");
		type=Animal.FROG;
	}
	
	public void jump() {
		setName("개구리");
		setColor("초록");
		System.out.println("특징 : 점핑");
	}
	
	@Override		
	public void act() {		
//			super.act();	//추상클래스 부모 act() 실행 못합니다.
			System.out.println("Frog 행동 : 수시로 점핑하기 ");
	}
	
	@Override
		public String eat(Object object) {
			return "unknown : " + object;
		}
}
class Cat extends Animal{
	protected String eyes;
	public Cat() {
		System.out.println("새로운 동물가족은 cat" );
		type=Animal.CAT;
	}
	public void sound() {
		setName("고양이");
		setColor("화이트");
		System.out.println("특징 : 야옹야옹");
	}
	@Override
	public void act() {
		System.out.println("Cat 행동 : 수시로 야옹야옹 울기 ");
	}
	
	@Override
	public String eat(Object object) {
		return null;
	}
}