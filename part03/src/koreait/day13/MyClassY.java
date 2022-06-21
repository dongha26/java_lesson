package koreait.day13;

public class MyClassY implements InterfaceB{

	@Override
	public String name(String name) {
		// TODO Auto-generated method stub
		return "MyClassY :"+name;
	}

}

class MyClassZ implements InterfaceA,InterfaceB{

	@Override
	public String name(String name) {
		
		return "MyClassZ : "+name;
	}

	@Override
	public void methodA() {
		System.out.println("MyClassX methodZ");		
	}

	@Override
	public int methodB(int num) {
		System.out.println("MyClassX methodZ : " +num);
		return 3333;
	}
	
	
	
}

