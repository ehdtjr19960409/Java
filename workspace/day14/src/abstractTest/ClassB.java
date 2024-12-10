package abstractTest;
//2번 : 추상클래스
public abstract class ClassB {
	
	//추상메소드
	abstract void method1();
	
	//일반메소드
	void method2() {
		
		System.out.println("추상클래스의 method() 호출");
		
	}
}
