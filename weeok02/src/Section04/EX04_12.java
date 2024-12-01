package Section04;

import java.util.Scanner;

public class EX04_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Scanner 클래스 import
		
		System.out.println("원하는 숫자 입력 (1~5): "); //출력메소드
		int num = sc.nextInt(); //입력메소드 생성하고 정수형 변수에 선언한 곳에 대입
		switch(num) { //변수 대입
			case 5: //변수 값이 5일 때
				System.out.println("5를 입력했음"); //출력메소드
			case 4: //변수 값이 4일때
				System.out.println("4를 입력했음"); //출력메소드
			case 3: //변수 값이 3일때
				System.out.println("3를 입력했음"); //출력메소드
			case 2: // 변수 값이 2일때
				System.out.println("2를 입력했음"); //출력메소드
			case 1: //변수 값이 1일때
				System.out.println("1를 입력했음");//출력메소드
			default : //위에 조건이 아닐 경우
				System.out.println("1~5까지의 숫자를 입력하세요"); //출력메소드
		}
		
	}
}
