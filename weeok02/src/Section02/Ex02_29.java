package Section02;

public class Ex02_29 {
	public static void main(String[] args) {
		float f1 = 12345.67f; //실수형 변수 선언
		int i1 = (int) f1; // 실수형 -> 정수형 강제형변환
		System.out.println("[float -> int] f1의 값 :"+f1+"i1의 값"+i1); //강제형변환된 f1,i1값으로 출력
		
		double d1 = 12345.678; //실수형 변수 선언
		int i2 = (int) d1; //실수형 -> 정수형 강제형변환
		System.out.println("[double -> int] d1의 값 :"+d1+"i2의 값"+i2); //강제형변환된 d1,i2값으로 출력
		
	}
}
