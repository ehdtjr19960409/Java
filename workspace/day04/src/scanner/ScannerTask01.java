package scanner;

import java.util.Scanner;

//5번 : 입력 메소드 실습

//클래스명, 패키지명 바꾸기 단축키 : 좌측 패키지나 클래스 클릭 후 F2키 > 변경할 이름으로 입력후 엔터
public class ScannerTask01 {
	public static void main(String[] args) {

		// 두 정수를 입력받고 합을 출력하기
		// next 메소드를 사용한다
		// [입출력 결과]
		// 정수1 입력 : 10
		// 정수2 입력 : 20
		// 두 정수의 합은 30입니다.

		// 로직구성 먼저 진행!

		// 1. 변수 2개 선언하다(String)
		// 2. 입력 클래스 import
		// 3. 출력 메시지(정수1입력 : )
		// 4. 입력 메소드(.next) 변수1에 대입
		// 5. 출력메시지(정수2 입력 : )
		// 6. 입력메소드(.next) 변수2에 대입
		// 7. 출력(형변환)

		String num1 = "", num2 = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		num1 = sc.next();
		
		System.out.print("정수2 입력 : ");
		num2 = sc.next();

		System.out.println("두 정수의 합은 "+(Integer.parseInt(num1)+Integer.parseInt(num2))+"입니다");
		
		sc.close();

	}

}