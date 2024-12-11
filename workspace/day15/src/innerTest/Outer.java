package innerTest;
//1번 : 내부클래스
public class Outer {
	//Outer 클래스의 필드
	int var1;
	String data1 = "Outer";

	//Outer 클래스의 기본 생성자
	public Outer() {
		
		System.out.println("외부 클래스 생성자");
		
	}
	
	//내부 클래스 Inner 정의
	class Inner{
		
		//필드, 생성자, 메소드 생성할 수있음 -> 클래스이므로
		int var2 = 10;
		String data2 = "Inner";
		
		//Inner 클래스의 생성자
		public Inner() {
			super();
			System.out.println("내부 클래스의 생성자");
			var1 =10;
			System.out.println("내부 클래스d의 메소드에서의 var1의 값 : "+ var1);
			outerMethod();
		}
		
		//Inner 클래스의 메소드
		void innerMethod() {
			
			System.out.println("내부클래스의 메소드 호출");
		}
		
		
	}
	
	//메소드
	void outerMethod() {
		System.out.println("외부클래스의 메소드 호출");
	}
	
	
	
}
