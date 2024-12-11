package innerTest;
//2번 : 내부클래스와 외부클래스 객체화
public class Main {
	public static void main(String[] args) {
		
		//외부클래스의 객체 생성
		//생성자를 이용해서 사용하는 방법1
		Outer outer = new Outer();
		System.out.println("외부클래스의 참조값 : " + outer);
		System.out.println("외부클래스의 데이터 : " + outer.var1);
		
		
		//내부클래스의 객체 생성
		//내부 클래스는 외부 클래스의 인스턴스를 통해 생성해야함
		Outer.Inner inner = outer. new Inner();
		System.out.println("내부 클래스의 참조값 : " + inner );
		System.out.println("내부 클래스의 데이터 : " + inner.var2);
		inner.innerMethod();
		
		//Inner i = new Inner() -> 내부 클래스에 위치해있게 때문에 실행 안됌
		
		//생성자 두개를 연이어서 사용하는 방법2
		Outer.Inner inner2 = new Outer().new Inner();
		
		
		
	}
}
