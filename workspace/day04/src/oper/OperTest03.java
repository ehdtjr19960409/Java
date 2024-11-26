package oper;

import java.util.Scanner;

//11번 : 관계연산자와 논리연산자
public class OperTest03 {
	public static void main(String[] args) {
		int num1 =10;
		int num2 = 15;
		
		//사용자가 입력한 값 크기 비교
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num1, num2 = 0;
//		
//		System.out.print("입력받을 두 수 : \n");
//		
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		sc.nextLine();
		
		System.out.println("num1 > num2 : num1이 num2보다 크니? "+ (num1 > num2));
		System.out.println("num1 < num2 : num1이 num2보다 작니? "+ (num1 < num2));
		System.out.println("num1 >= num2 : num1이 num2보다 크거나 작니? "+ (num1 >= num2));
		System.out.println("num1 <= num2 : num1이 num2보다 작거나 같니? "+ (num1 <= num2));
		System.out.println("num1 == num2 : num1이 num2보다 같니? "+ (num1 ==  num2));
		System.out.println("num1 != num2 : num1이 num2보다 같지 않니? "+ (num1 != num2));
		

		System.out.println("==========논리 AND연산자==========");
		   System.out.println("===and 둘다 참이면 참(&&)===");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("==========논리 OR연산자==========");
		System.out.println("===or 둘 중 하나라도 참이면 참(||)===");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println("==========논리 NOT연산자==========");
	    System.out.println("===not 참이면 거짓, 거짓이면 참(!)===");
		System.out.println(!false);
		System.out.println(!true);
		
		
		
		
		
		
	}
}
