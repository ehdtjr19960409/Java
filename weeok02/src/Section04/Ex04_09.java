package Section04;

import java.util.Scanner;

public class Ex04_09 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //scanner 클래스 import
		System.out.println("나이를 입력하세요"); //나이 입력 출력메소드
		int age = sc.nextInt(); //입력받을 정수형 입력메소드 생성 및 변수 선언
		
		if(age>19) { //19보다 클 경우
			System.out.println("성인"); //해당구문 출력
			
		}else if(age>13) { //13보다 클 경우 
			System.out.println("청소년"); //해당구문 출력
			
		}else if(age>6) { //6보다 클 경우
			System.out.println("어린이"); //해당구문 출력
		}else { //6보다 작을경우
			System.out.println("유아"); //해당구문 출력
		}
	}
}
