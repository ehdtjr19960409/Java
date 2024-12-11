package ex03_신동석;

import java.util.Scanner;

public class Stars1 {
	public static void main(String[] args) {
		//3-1
		for(int i = 0; i < 3; i++) {
			for(int j = 3; j>i ; j--) {
				System.out.print(" ");
			}
			
			for(int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		//3-2
		//스캐너클래스 import
		// 입력받을 변수에 저장 및 선언(초기화)
		//사용자가 입력받은 변수로 이중 for문 조건식 작성
		//첫 for문은 행
		//	두번째 for문은 입력받은 값에서 1씩 증가
		// 한행이 끝날 때 줄바꿈
		// 스캐너 클래스 닫기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 받은 값 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num ; i++) {
			for(int j = num; j>=num-i; j--) {
				System.out.print("*");
				
			}
			System.out.println(" ");
			
			
		}
		
		sc.close();
		
		
	}
}
