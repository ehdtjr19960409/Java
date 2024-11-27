package oper;

import java.util.Scanner;

public class OperTest01 {
	public static void main(String[] args) {
		
		//다음 중 음식이 아닌것은?
		//1. 피자
		//2. 게이크
		//3. 불고기
		//4. java
		//삼항 연산자를 사용하여 입력받은 값과 정답 비교하고 정답입니다 or 오답입니다 출력하기
		
		String quizMsg = "다음 중 음식이 아닌것은?\n"
				+"1. 피자\n"
				+"2. 케이크\n"
				+"3. 불고기\n"
				+"4. java\n"
				+ "번호를 입력하세요 : ";
		
		System.out.println(quizMsg);
		
		//로직 구성
		
		//scanner 클래스 import
		Scanner sc = new Scanner(System.in);
		// int형 변수 1개와 상수 int 1개, String 결과값 선언
//		int choice = 0;
//		final int answer = 4;
//		String result = null;		
//		//입력 메소드 생성
//		choice = sc.nextInt();
//		
//		//결과값 계산기 작성
//		result = answer == choice? "정답" : (choice>=1 && choice <4) ? "오답" : "잘못입력했습니다" ;
		// 삼항 연산자 조건 부로 입력하는 방법
		// 조건식 ? true : false; -> 기본값
		// 조건식 ? true : (fasle에서 조건식)? true: false; -> 2번의 조건부 식
		//출력 메소드
//		System.out.println(result);
//		
		//문자열 비교
		String choice2 = "";
		final String answer2 = "java";
		choice2 = sc.next();
		//System.out.println(answer2 == choice2 ? "정답" : "오답");
		
		//.equals() 문자열  비교에서 사용하는 메소드
		System.out.println(answer2.equals(choice2) ? "정답" : "오답");
		
		System.out.println("abc" == "a");
		boolean data =("a"=="a");
		System.out.println(data);
		String al = "a";
		String al2 = "a";
		System.out.println(data);
		
		 //.equals() : 문자열 비교에서 사용하는 메소드 
	      // Object 클래스 .equals()메소드 배울 예정

		
	}
}
