package DowhileTest;

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		// 문제
		// 1. 점심메뉴를 보여준다.
		// 1-1. 메뉴 4개이다.
		// 1-2. 짜장(5000원) 돈까스(8000원) 피자(25000원) 햄버거(6000원)
		// 1-3. 4개의 메뉴중에 하나 입력시 가격과 메뉴 메시지 출력
		// 단, 문자열 비교시 ==이 아닌 equals를 활용할것
		// + 문제 while문을 활용한 동일한 값이 아닐 때 재입력을 통해 올바른 값이 나오게끔 진행
		//

		// 설명코드
		// 먼저 Scanner 클래스를 import한다
		// 각 정수형 변수에 가격을 대입과 동시에 초기화한다.
		// 문자열을 입력 받으려면 String 타입을 선언하고 초기화한다.
		// 점심메뉴를 출력 메소드를 활용해서 보여준다.
		// 입력 메소드를 활용
		// if문을 활용하고 조건식에는 equals를 사용
		// 해당 문자열이 같을 시 가격을 보여주고 아닐 시,재입력을 통해 진행한다
		//
		// + while 문 조건식을 넣었을 때 (위 문자열 타입과 비교하고 논리연산 OR을 활용하고 거짓일 때 반복하기 위해 ! 부정을 사용)
		// 출력 메소드 생성을 통해 재입력이란 것을 알려줘야한다
		// 입력 메소드를 통해 재입력을 받는다

		Scanner sc = new Scanner(System.in);
		int food1 = 5000;
		int food2 = 8000;
		int food3 = 25000;
		int food4 = 6000;
		String menu = null;

		System.out.println("점심 메뉴 : 짜장, 돈까스, 피자, 햄버거");
		menu = sc.next(); // 김치

		while (!("짜장".equals(menu) || "돈까스".equals(menu) || "피자".equals(menu) || "햄버거".equals(menu))) { // 거짓일시 재입력을
																										// 실행시키위한 논리연산
																										// 진행
			System.out.println("재입력 : ");
			menu = sc.next();
		}
		if ("짜장".equals(menu)) {
			System.out.println(menu + ":" + food1);
		} else if ("돈까스".equals(menu)) {
			System.out.println(menu + ":" + food2);
		} else if ("피자".equals(menu)) {
			System.out.println(menu + ":" + food3);
		} else if ("햄버거".equals(menu)) {
			System.out.println(menu + ":" + food4);
		}
		System.out.println("메뉴가 정상적으로 선택됐었습니다.");

		// 문제
		// 1. 사용자에게 문자를 입력받는다
		// 2. 입력받은 문자를 형변환을 통해 아스키코드로 변환한다
		// 3. 변환받은 값을 사용자에게 알려주고 반복문을통해 사용자에게 문자를 다시 받는다.

		// 문제 세부설명

		// 먼저 Scanner 클래스를 import한다
		// A라는 문자를 입력 받으면 종료를 하고 싶어 출력 메시지로 A의 아스키코드인 65를 미리 알려준다
		// 출력 메시지를 통해 알고싶은 문자를 입력 해달라고 한다
		// scanner를 통해 사용자로부터 원하는 문자를 입력받는다
		// 입력받는 문자를 아스키코드로 변환
		// 변환받은 값을 출력해 주고
		// 반복문을 사용해 사용자에게 다시 문자를 입력 받을 수 있게 출력메시지와 scanner를 통해 입력을 받음 물론 A를 입력 받으면 실행 종료
		// 사용자가 A라는 문자를 입력하지 않으면 반복문을 통해 계속 자신이 알고싶어하는 문자의 아스키코드를 알 수 있음.
		// 이제 사용자가 A라는 문자를 통해 반복문을 탈출했다면 출력메시지를 통해 입력이 끝났다는 것 을 출력

//	      Scanner sc = new Scanner(System.in);
		System.out.println("A의 아스키코드는 65입니다");
		System.out.print("아스키 코드를 알고 싶은 문자 입력(A입력시 종료) : ");
		String ch1 = sc.next();
		char ch2 = ch1.charAt(0);
		int num1 = (int) ch2;

		while (ch2 != 'A') {
			System.out.println("입력하신 문자" + ch2 + "의 아스키 코드는 : " + num1);
			System.out.print("아스키 코드를 알고 싶은 문자 입력(A입력시 종료) : ");
			ch1 = sc.next();
			ch2 = ch1.charAt(0);
			num1 = (int) ch2;

//	         
		}

	}
}
