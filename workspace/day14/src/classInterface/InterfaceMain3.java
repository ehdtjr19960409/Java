package classInterface;
//12번 : 인터페이스의 다중 상속
// 객체가 여러 역할을 수행해야할 때 사용
// 모듈화와 확장성을 고려할 때 사용
// 재사용성과 중복 방지를 위해 사용

interface Interface1{
	
	void methodA();
}

interface Interface2{
	void methodB();
}

interface Interface3 extends Interface1, Interface2{
	void methodC();
	
}

class ClassB implements Interface3{

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		
	}
	
	
}


public class InterfaceMain3 {
	public static void main(String[] args) {
		
	}
}
