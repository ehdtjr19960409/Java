package Section02;

public class Ex02_22 {
	public static void main(String[] args) {
		int i1= 10; //정수형 변수 선언 및 초기화
		byte b1 = (byte)i1; //정수타입 변수를 byte로 자동형변환을 통해 같은 byte타입 변수명에 저장
		System.out.println(b1); //byte타입 출력
		
		int i2 = 128; //정수형 변수 선언 및 초기화
		byte b2 = (byte)i2; //byte타입으로 자동형변환을 통해 변수에 저장 및 초기화
		System.out.println(b2); //b2변수의 값이 출력
		
	}
}
