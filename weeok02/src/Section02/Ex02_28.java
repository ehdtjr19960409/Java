package Section02;

public class Ex02_28 {
	public static void main(String[] args) {
		
		double d1 = 1.1234; //실수형 변수 선언
		float f1 = (float) d1; //더블에서 플롯으로 가기 때문에 강제형변환
		System.out.println("[double -> float] d1의 값 :"+d1+"f1의 값"+f1); // 강제형변환된 d1,f1값 출력
		
		double d2 = 1.0e-50; //실수형 변수 선언
		float f2 = (float) d2; //더블에서 플롯으로 가기 때문에 강제형변환
		System.out.println("[double -> float] d2의 값 :"+d2+"f2의 값"+f2); // 강제형변환된 d2,f2값 출력
		
		double d3 = 1.0e100; //실수형 변수 선언
		float f3 = (float)d3; //더블에서 플롯으로 가기 때문에 강제형변환
		System.out.println("[double -> float] d3의 값 :"+d3+"f3의 값"+f3); // 강제형변환된 d3,f3값 출력
		
		double d4 = 9.123456789; //실수형 변수 선언
		float f4 = (float)d4; //더블에서 플롯으로 가기 때문에 강제형변환
		System.out.println("[double -> float] d4의 값 :"+d4+"f4의 값"+f4); // 강제형변환된 d4,f4값 출력
		
		
		
	}
}
