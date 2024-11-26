package oper;
//10번 실습
import java.util.Scanner;

public class OperTask01 {
	public static void main(String[] args) {
		//로직구성 먼저 필수!!
		
		// scanner import 메소드 구현
			Scanner sc = new Scanner(System.in);
			
		//1. 사용자로부터 두개의 숫자를 입력받아 두 숫자의 합과 곱을 각각 출력하기
		// num, num1, result, result1 변수 생성
		int num, num1, result, result1, result2= 0;
			
		// 입력받을 값 출력메소드 생성 
		System.out.print("두개의 숫자를 입력 : ");
		
		//변수명 nextInt() 만들기
		num = sc.nextInt();
		num1 = sc.nextInt();
		
		result = num + num1;
		result1 = num * num1;
		
		// 두 숫자의 합과 곱 출력메소드 생성
		 System.out.printf("더한 값 : %d\n 곱한 값 : %d\n", result, result1);
		 
		//int형이므로 nextLine 메소드 구현
		sc.nextLine();
//---------------------------------------------------------------------		
		
		//2. 1번에서 입력받은 두개의 숫자를 사용하여 평균을 계산하고 소수점 두자리수까지 출력하기

		//두 숫자의 평균을 계산하고 복합대입 연산자를 활용 
		result2 = result/2;
		
		// 출력메소드에서 소수점 두자리까지 출력하기
		System.out.printf("평균을 계산 : %.2f\n ", (double)result2);
		
//---------------------------------------------------------------------		
		
		//3. 두자리수 정수를 입력받고 십의자리와 일의자리를 출력하기
			
		//두자리수 정수 및 결과값 2개 선언
		int number,result3, result4 = 0;
	
		//두자리수의 정수  입력받을 출력 메소드 작성
		System.out.print("두자리 수 정수 입력 : \n");
		number = sc.nextInt();
		
		result3 = number/10;
		result4 = number%10;
		
		//입출력 결과
		//두 자리수 정수를 입력하세요 : 
		//십의자리는 _입니다. 일의자리는 _입니다.
		
		//출력 메소드 작성
		System.out.printf("십의자리는 %d입니다. 일의자리는 %d입니다.", result3, result4);
		sc.nextLine();
		
//---------------------------------------------------------------------		
		//4. 코인노래방 프로그램 만들기, 사용자에게 금액을 입력받고 부를 수 있는 곡수와 잔돈 출력하기
		//한 곡의 가격은 400원입니다.
		
		// 가격 변수 1개와 나누기 연산자 결과값, 나머지 연산자 결과값 변수
		final int coinPrice = 400; 
		int price, result5, result6 = 0;
		
		//먼저 한곡의 가격은 400원입니다 출력 메소드 생성
		System.out.println("\n먼저 한곡의 가격은 400원 입니다. ");
		
		// 입력받을 출력 메소드 생성
		System.out.print("돈을 넣어주세요 :  \n");
		
		price=sc.nextInt();
		
		// 입력 받은 값에 /연산자를 통해 사용가능한 코인 수
		result5 = price/coinPrice;
		// 입력 받은 값에 %연산자를 통해 잔돈반환 가격
		result6=price%coinPrice;
		//출력 메소드를 통해 출력 메소드 생성
		System.out.printf("현재 가능한 코인 %d개, 잔돈 %d입니다.", result5, result6);
		
		//close 메소드 사용
		
	}
}
