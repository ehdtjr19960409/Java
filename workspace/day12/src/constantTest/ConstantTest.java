package constantTest;
//5번 : final
public class ConstantTest {
	//클래스 내부에서 상수 선언
	static final int MAX_LENGTH = 100;	//클래스 상수	
	//method영역, 클래스로드시 초기화, 모든 객체가 공유, 클래스 전체에서 공통으로 사용하는 상수
	
	final double PI = 3.14159265359;  //인스턴스 상수		
	//heap영역, 객체생성시 초기화, 객체마다 독립적(값이 같아도 독립적), 특정 객체마다 고유한 상수를 정의할 때 사용
	
	
	public static void main(String[] args) {
		System.out.println(ConstantTest.MAX_LENGTH);
		ConstantTest ct = new ConstantTest();
		System.out.println(ct.PI);
		System.out.println(new ConstantTest().PI);
		
	}
}
