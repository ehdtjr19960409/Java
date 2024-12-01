package Section02;

public class Ex02_26 {
	public static void main(String[] args) {
		int i = 100; //정수형 변수 타입 선언 및 초기화
		char c = 'a'; //문자형 변수 타입 선언 및 초기화
		int j = c; // 정수형 변수 타입 선언 및 초기화
		double d = i; //실수형 변수 타입 선언 및 초기화
		
		System.out.println("int형 변수 j의 값 : "+j); //문자의 값을 아스키코드 형식으로 바꿔서 정수형에 저장된 것을 출력
		System.out.println("double형 변수 d의 값 : "+d); //자동형변환한 값을 출력
	}
}
