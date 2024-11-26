package scanner;

import java.util.Scanner;

//7번 : 입력메소드 실습
public class ScannerTask02 {
	public static void main(String[] args) {
		
		//1. 사용자로부터 세 개의 숫자를 입력받아 합을 출력하는 프로그램
		// 	- 세개의 숫자를 각각 입력받기
		//	- 세 숫자의 합을 계산하여 출력
		//	- 세 숫자의 합은 00입니다 형식으로 출력하기
		
		// int형 변수 3개 선언
		//	int num, num1, num2 = 0;
		
		 
		//import Scanner 만들기
			Scanner sc = new Scanner(System.in);	
			
//		// 출력 메소드 만들기1
//		// 입력 메소드로 입력받기1
//			System.out.print("1번방 숫자 : ");
//			num = sc.nextInt();
			
			int num, num1, num2 =0;	
			System.out.println("3개의 입력 받은 수 : ");
			num = sc.nextInt();
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			System.out.println("세 숫자의 합은 "+ (num+num1+num2)+ "입니다");
			
			sc.nextLine();
			
//		// 출력 메소드 만들기2
//		// 입력 메소드로 입력받기2
//			System.out.print("2번방 숫자 : ");
//			num1 = sc.nextInt();
//			
//			
//		// 출력 메소드 만들기3
//		// 입력 메소드로 입력받기3
//			System.out.print("1번방 숫자 : ");
//			num2 = sc.nextInt();
//			sc.nextLine();
//			
//		// 세 숫자의 합 계산하여 출력
//			System.out.println("세 숫자의 합은 "+ (num+num1+num2)+ "입니다");
			
		
		//2. 사용자로부터 일어난 시간(정수) 아침, 점심, 저녁에 할 일과 잠들 시간(정수)을 입력받아 출력하기
		// - 일어난 시간과 아침, 점심, 저녁에 할 일과 잠들 시간을 각각 입력받기
		// - 순서대로 입력받고 출력할 것
		// - 출력 형식
		// 		오늘 일어난 시간은 00시이고 잠들 시간은 00시 입니다.
		//		아침 : 00하기
		//		점심 : 00하기
		//		저녁 : 00하기
		
		// 일어난 시간(정수) 아침, 점심, 저녁에 할 일과 잠들 시간(정수) 변수 선언 및 초기화
			
			
			int morningTime, nightTime = 0;
			String morning, lunch, dinner = null;
			
		// Scaner 변수명 새로 선언 및 초기화	
			
		//	일어난 시간과 아침, 점심, 저녁에 할 일과 잠들 시간을 각각 순서대로 입력받고 출력할 것
			System.out.print("일어난 시간 : ");
			morningTime = sc.nextInt();
			sc.nextLine();
			
			System.out.print("아침 할일 : ");
			morning = sc.next();
			
			
			System.out.print("점심 할일 : ");
			lunch = sc.next();
			
			
			System.out.print("저녁 할일 : ");
			dinner = sc.next();
			
			
			System.out.println("잠들 시간 : ");
			nightTime = sc.nextInt();
			
			
		// 입력받은 값 출력하기	
			System.out.println("오늘 일어난 시간은 " + morningTime + "시이고 잠들 시간은 "+ nightTime +"시 입니다.");
			System.out.println("아침 : " + morning + "하기");
			System.out.println("점심 : "+ lunch + "하기");
			System.out.println("저녁 : " + dinner + "하기");
			sc.nextLine();
			
			
			
			
		//3. 물건가격이 10000원이다. 사용자로부터 지불금액을 입력받아 거스름돈을 계산하기(뺄셈 -이용)
		//	출력형식	
		//	물건 가격은 10000원입니다
		//	지불가격을 입력하세요 : 00
		//	거스름돈 3000원입니다
			
			int price = 0, price1 = 10000;
			
			
			System.out.println("물건 가격은 "+price1+"원입니다.");
		
			System.out.print("지불가격은 입력하세요 : ");
			price = sc.nextInt();
			sc.nextLine();
			
			System.out.println("거스름돈 : "+((price1-price))+"원입니다.");
			
			sc.close();
			
		
	}
}
