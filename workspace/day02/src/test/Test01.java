package test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("신동석");
		System.out.println(2024 + 1); 
		//소괄호 안에 있는 2024 + 1값의 덧셈 연산결과를 콘솔창에 출력하고 줄바꿈한다
		

		for (int i = 1; i <= 6; i++) {
//			공백 5, 4, 3, 2, 1 칸 출력을 위한 for문
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
//			* 1, 2, 3, 4, 5 칸 출력을 위한 for문
			for (int k = 1; k < i+1; k++) {
				System.out.print("* ");	
			}
			System.out.println();
		}
		
		
		
	}
}
