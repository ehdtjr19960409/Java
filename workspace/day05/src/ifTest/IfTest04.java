package ifTest;

import java.util.Scanner;

public class IfTest04 {
	public static void main(String[] args) {
		// 삼항연산자로 작성했던 두 수를 입력받아 큰 수 출력하기
		// => if ~ else if ~ else문으로 변경

		// 1) 입력 클래스 import
		// 2) 변수 선언 int 2개
		// 3) 입력 메시지 출력
		// 4) 조건문(if ~ else if ~ else문)
		// 4-1) if (변수1 > 변수2) {
		// 4-2) 변수1이 변수2보다 큽니다 출력
		// 4-3) }else if(변수1 == 변수2){
		// 4-4) 변수1과 변수2가 같습니다 출력
		// 4-5) }else{
		// 4-6) 변수2가 변수1보다 큽니다 출력
		// }

		Scanner sc = new Scanner(System.in);

		int num1, num2 = 0;

		System.out.print("입력받은 정수1 : ");
		num1 = sc.nextInt();
		System.out.print("입력받은 정수2 : ");
		num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.printf("%d가 %d보다 %d 더 큽니다", num1, num2,(num1-num2));
		} else if (num1 == num2) {
			System.out.println(num1 + "과 " + num2 + " 가 같습니다.");
		} else {
			System.out.println(num2 + "가 " + num1 + "보다 큽니다");
		}
		
		//입력버퍼 비우기
		//sc.nextLine();
		
		
	}
}
