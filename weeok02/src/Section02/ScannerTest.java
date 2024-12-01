package Section02;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //scanner 클래스 import
		System.out.println("나이를 입력 : "); //나이를 입력 출력메소드 생성
		int age = sc.nextInt(); //입력메소드 생성
		System.out.printf("내 나이는 %d 입니다", age); // 서식문자에 맞춰서 출력
		
	}
}
