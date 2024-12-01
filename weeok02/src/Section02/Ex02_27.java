package Section02;

public class Ex02_27 {
	public static void main(String[] args) {
		int i =10; //정수형타입 변수 선언
		byte b = (byte) i ; // 강제형변환
		System.out.println("[int -> byte] i의 값 :"+i+"b의 값"+b); //강제형변환된 i,b 값 출력
		
		int j = 1000; //정수 변순 선언
		byte c = (byte) j; // 강제형변환
		System.out.println("[int -> byte] j의 값 :"+j+"c의 값"+c); //강제형변환된 j,c 값 출력
	}
}
