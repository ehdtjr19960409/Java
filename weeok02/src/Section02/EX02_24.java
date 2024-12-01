package Section02;

public class EX02_24 {	
	public static void main(String[] args) {
		
		double pie = 3.14; //실수형 타입 변수 선언 및 초기화
		int pieInt = (int)pie; //강제형변환
		System.out.println(pieInt); //강제형변환된 값으로 출력
		
		int num = 100; //정수형 타입 변수 선언 및 초기화
		double numD = (double) num; //자동형변환
		float numF = (float) 100; //같은 값이므로 값 저장 및 초기화
		System.out.println(numD); //자동형변환된 값으로 출력
		System.out.println(numF); //float형으로 출력
		
		int i = 99999; //정수형 변수 선언 및 초기화 
		float f = (float) i; //자동형변환
		System.out.println(f); //자동형변환된 float 타입으로 출력
		
		
	}
}
