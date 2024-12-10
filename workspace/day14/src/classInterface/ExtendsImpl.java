package classInterface;
//13번 : 상속과 구현은 별개이다

class Parent01{
	
	void parentMethod() {
		
		System.out.println("부모 클래스의 메소드");
	}
	
}

interface Interface01{
	
	void methodA();
}

interface Interface02{
	void methodB();
}

class Child01 extends Parent01 implements Interface01, Interface02{

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		
	}

}


public class ExtendsImpl {
	public static void main(String[] args) {
		
	}
}
