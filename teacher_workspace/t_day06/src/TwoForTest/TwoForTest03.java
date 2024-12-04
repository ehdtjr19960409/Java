package TwoForTest;

import java.util.Scanner;

public class TwoForTest03 {
	public static void main(String[] args) {

		//사용자로부터 입력받은 행의 개수만큼 출력하기
		//1) 입력클래스 import
		//2) 입력 메시지 출력
		//3) 입력한 값 변수 대입
		//4) 해당 변수를 바깥for문 조건식에 넣기
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("출력할 행의 수를 입력하세요 : ");
		choice = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= choice; i++) {
//			System.out.println("*"); //행
			for (int j = 1; j <= i; j++) { // 열
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
		
	}
}
