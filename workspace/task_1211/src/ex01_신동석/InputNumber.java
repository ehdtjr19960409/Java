package ex01_신동석;

import java.util.Scanner;

public class InputNumber {
	
	public static void main(String[] args) {
		//로직
		//스캐너 클래스 import
		//3의 정수 입력 3개의 변수선언
		//최대값과 최소값의 변수 선언 
		// 삼항연산자 활용해서 max, min 계산 후 대입
		// 최대 최소 3개의 정수 입력받은 값을 계산
		// 단, %.2f로 식을 대입해서 소수점 2자리까지로 계산
		//출력
		// 스캐너 클래스 사용 후 닫기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("사용자로부터 3개의 정수 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int min, max =0;
		
		
		max = ((num1 > num2 && num1 > num3) ? num1 : (num2 > num3) ? num2 :num3);
		min = ((num1 < num2 && num1 < num3) ? num1 : (num2  < num3) ? num2 :num3);
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		double avg = (num1+num2+num3+max+min)/5;
		System.out.printf("%.2f", avg);
		sc.close();
		
	}
	
}
