package Section02;

import java.util.Scanner;

public class ScannerSplit {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); //scanner 클래스 생성
		
		String name, address; //문자열 변수선언
		int age; //정수형변수 선언
		double weight; //실수형 변수 선언
		
		System.out.println("이름 주소 나이 체중을 빈칸으로 구분해서 순서대로 입력 : "); //출력메소드
		name = sc.next(); //문자열 입력메소드
		address = sc.next(); //문자열 입력메소드
		age = sc.nextInt(); //정수형 입력메소드
		weight = sc.nextDouble(); //실수형 입력메소드
		
		System.out.printf("당신의 이름은 %s입니다.%n", name); //서식문자와 변수에 맞춰서 출력
		System.out.printf("당신의 주소는 %s입니다.%n" , address); //서식문자와 변수에 맞춰서 출력
		System.out.printf("당신의 나이는 %d세 입니다.%n", age); //서식문자와 변수에 맞춰서 출력
		System.out.printf("당신의 체중은 %.fkg입니다.%n", weight); //서식문자와 변수에 맞춰서 출력
	}
}
