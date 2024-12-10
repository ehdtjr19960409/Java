package classInterface;
//11번 : 인터페이스의 단일 상속 가능 확인

interface ParentInter{
	void method1();
	
}

interface ChildInter extends ParentInter{
	void method2();
}

class ClassA implements ChildInter{

	@Override
	public void method1() {
		System.out.println("ParentInter의 메소드 구현1");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("ChildInter의 메소드 구현1");
	}
	
}

public class InterfaceMain2 {
	public static void main(String[] args) {
		ClassA a = new ClassA();
		
		a.method1();
		a.method2();
		
		
		ChildInter ci = new ClassA();
		ci.method1();
		ci.method2();
		
		ParentInter pi = new ClassA();
		pi.method1();
		
	}	
}
