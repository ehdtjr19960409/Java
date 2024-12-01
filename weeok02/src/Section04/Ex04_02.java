package Section04;

import java.util.Scanner;

public class Ex04_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //scanner 클래스 import
		System.out.println("나이를 입력 : "); //나이 입력 출력메소드
		int age = sc.nextInt(); //정수형 변수 선언하고 입력받는 메소드
		
		if(age >19) {//19보다 클 경우
			System.out.println("성인"); //성인 출력
		}System.out.println("프로그램 종료"); //출력 메소드
		
	}
}
