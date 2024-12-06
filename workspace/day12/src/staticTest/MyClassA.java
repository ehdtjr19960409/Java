package staticTest;
//3번 : 정적변수와 정적메소드
public class MyClassA {
	
	//필드(인스턴스 변수, 스태틱 변수, 상수)
	int instanceVar; //인스턴스 변수
	static int staticVar; //스태틱 변수, 클래스 변수라고 부른다
	
	//생성자 => 컴파일러
	
	//메소드(인스턴스 메소드, 스택틱 메소드)
	
	//인스턴스 메소드1
	void instanceMethod1() {
	//클래스 메소드에 안올린 상태 -> 올리려면 객체를 생성해서 올려야함
		System.out.println("인스턴스 메소드1 호출되었습니다.");
		instanceVar = 10;
		System.out.println("인스턴스메소드1에서 인스턴스 변수 값 : "+ this.instanceVar);
		staticVar = 10;
		System.out.println("인스턴스메소드1에서 인스턴스 변수 값 : " + staticVar);
		instanceMethod2();
		staticMethod1();
	}
	
	//인스턴스 메소드2
	void instanceMethod2() {
		System.out.println("인스턴스 메소드2가 호출되었습니다.");
		
	}
	
	//스태틱메소드1
	static void staticMethod1() {
		System.out.println("스태틱메소드1이 호출되었습니다.");
//		instanceMethod2(); //스태틱메소드에서 인스턴스 메소드 호출 불가
//		instanceVar = 100; //스태틱메소드에서 인스턴스 변수 접근 불가
		staticVar = 200;
		System.out.println("스태틱메소드1에서 스태틱변수 값 : " + staticVar);
		staticMethod2();
	}
	
	// 스태틱메소드2
	static void staticMethod2() {
		System.out.println("스태틱메소드2가 호출되었습니다");
	}
	
	
}
