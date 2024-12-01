package Section02;

public class Ex02_21 {
	public static void main(String[] args) {
		int num1 =11; //정수형타입 변수 선언 및 초기화
		double num2 = 3.14; //실수형 타입 변수 선언 및 초기화
		double num1Change = (double) num1; //같은 실수형타입을 실수형 타입 변수에 넣고 선언 및 초기화
		
		System.out.println("num1 : "+ num1); //정수형 출력
		System.out.println("num1change : "+num1Change); //실수형 출력
		System.out.println(num1Change + num2); //2개가 실수형 타입이므로 실수형의 더한 계산값이 출력
		System.out.println((int)1.23); //double 8byte int 4byte이므로 강제형변환을 통해 데이터가 유실되고 정수 출력
	}
}
