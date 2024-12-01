package Section02;

public class EX02_23 {
	public static void main(String[] args) {
		double d1 = 1.0e100; //실수형 변수 타입 선언 및 초기화
		float f1 = (float)d1; //double형을 float형으로 자동형변환
		System.out.println(f1); //f1의 값을 출력
		
		double d2 = 1.0e-100; //실수형 변수타입 선언 및 초기화
		float f2 = (float)d2; //double형을 float형으로 자동형변환
		System.out.println(f2); //f1의 값을 출력
		
	}
}
