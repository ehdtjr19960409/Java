package section08;

public class Calc {
		
	public static void main(String[] args) {
		Calc calc = new Calc();   // Calc 메소드 클래스 import
		
		calc.sum(5,3);		//sum 메소드에 5 3 이라는 인자값 전달, sum 메소드에 호출
		calc.sum(10,7);		//sum 메소드에 10, 7이라는 인자값 전달, sum 메소드에 호출
		
		
	}
	void sum(int num1, int num2) { //선언부 리턴 받을 값이 없으므로 void , 메인에서 두개의 인자값을 전달받음
		
		System.out.println("두 수의 합은 " + (num1 + num2)+ "입니다."); //두개의 인자값을 더하고 해당 메소드를 문자열로 출력
		
	}
	
}
