package interfaceTest3;
//인터페이스의 디폴트메소드와 클래스의 메소드가 동일한 경우
public class ClassInterMain extends Class1 implements Inter1 {
	//The inherited method Class1.printText() 
	//cannot hide the public abstract method in Inter1
	//인터페이스의 메소드와 클래스 메소드 간의 출동문제 발생
	// 인터페이스의 메소드가 abstract 인 경우 클래스에 숨기거나 무시할 수 없다

	
	//Class1과 Inter1 양쪽에 printText()메소드가 존재하지만
	//오류발생이 발생하지 않는 이유는 구현하는 인터페이스보다 상속받는 부모 클래스의
	//우선순위가 더 높기 때문이다
	
	
}
