package task;

import java.util.InputMismatchException;
import java.util.Scanner;

import exceptionTest2.MyException;

public class ExceptionTest01 {
	public static void main(String[] args) {

//		1. 숫자를 입력받아 1부터 입력받은 숫자까지의 합을 출력하는 프로그램을 만드세요. 
//		그리고 숫자가 아닌 값이 입력될 경우 "잘못된 입력입니다"라는 예외 메시지를 출력하고, 
//		프로그램을 종료하세요.

		// 숫자 입력

		// 숫자값이 아닌경우 if문
		// 입력받은 숫자까지의 총합 -> for문
		// 총합 초기화 변수선언
		int total = 0;
		String sen = " ";
		char ch = ' ';
		// 그리고 숫자가 아닌 값이 입력될 경우 "잘못된 입력입니다"라는 예외 메시지를 출력
		System.out.println("프로그램 시작");
		System.out.print("숫자 입력(하면 그 수까지까지의 더한 값이 출력됌) : ");
		Scanner sc = new Scanner(System.in);
		int num;
		try {
			num = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.print(e.toString());
			
			System.out.println("잘못된 입력입니다");
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		if (num >= 1) {
//
//			for (int i = 1; i <= num; i++) {
//				total += i;
//			}
//			System.out.println("총합 : " + total);
//
//		}else {
//			try {
//				// 여기가 키워드 -> 예외가 예상되는 코드 즉, 입력받은 값이 정수값이 아닐때
//
//					throw new TestException01();
//				
//			} catch (TestException01 e) {
//				// TODO Auto-generated catch block
//				System.out.println("잘못된 입력 입니다 " );
//			}
//
		System.out.println("프로그램 종료");

	}
}
