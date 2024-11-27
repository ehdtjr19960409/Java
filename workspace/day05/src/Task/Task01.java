package Task;

import java.util.Scanner;

public class Task01 {
   public static void main(String[] args) {
      //로직구성필수!!
      //다양한 로직을 생각해 보는 연습하기
      
	   //Scanner class 생성
	   Scanner sc = new Scanner(System.in);
	   
//      1. 한개의 정수를 입력받아 짝수인지 홀수인지 출력하기
//      입력 : 8
//      출력 : 짝수입니다

	   //한개의 정수 선언
	   //입력 메소드 생성
	   //if조건문 (if%2==1)홀수와 else로 짝수 생성
	   //if 문안에서 짝수입니다를 출력
	   //else 문안에서 홀수 입니다 출력
	   
	   int num = 0;
	   System.out.print("한개의 정수 입력 : ");
	   num = sc.nextInt();
	   if(num%2==1) {
		   System.out.println("홀수입니다.");
	   }else {
		   System.out.println("짝수입니다.");
	   }
	   
	   //입력버퍼 비우기
	   //sc.nextLine();
	   
	   
//      2. 한개의 정수를 입력받아 양수, 음수, 0인지 출력하기
//      입력 : -5
//      출력 : 음수입니다
//
//      입력 : 100
//      출력 : 양수입니다
//
//      입력 : 0
//      출력 : 0입니다

	   //한개의 정수 선언
	   //입력 메소드 생성
	   // if ,else if, else 로 양수 음수 0에 따른 조건식 생성
	   // 각 if, else if, else에서 출력하기
	   
	   int num1 = 0;
	   System.out.print("한개의 정수 입력 : ");
	   num1 = sc.nextInt();
	   if(num1>0) {
		   System.out.println("양수입니다");
	   }else if(num1 == 0) {
		   System.out.println("0입니다");
	   }else {
		   System.out.println("음수입니다");
	   }
	   
	   
	   
//      3. 나이를 입력받아 다음 기준으로 출력하기
//         0~12: 어린이
//         13~19: 청소년
//         20 이상: 성인
//
//      나이입력 : 16
//      청소년입니다

	   //나이 정수 선언
	   //입력메소드 선언
	   //if(0~12므로 AND 필수), else if(13~19므로 AND 필수), else if(20세 이상 조건식) else{음수입니다}로 어린이 청소년 성인을 구분하는 조건식을 생성
	   //각 if, else if, else 중괄호 안에서 출력 메소드 생성
	   
	   int age = 0;
	   System.out.print("나이를 입력 : ");
	   age = sc.nextInt();
	   if(0<=age && 12<=age) {
		   System.out.println("어린이");
	   }else if(13<=age && 19<=age) {
		   System.out.println("청소년");
	   }else if(age>=20){
		   System.out.println("성인");
	   }else {
		   System.out.println("음수입니다");
	   }
	   

	   
//      4. 세 개의 정수를 입력받아 가장 작은 숫자부터 큰 숫자 순으로 정렬하여 출력하기(단, 삼항연산자만 이용할 것)
//         입력 : 5 1 9
//         출력 : 1 5 9
	   // 3개의 정수 선언
	   // 입력메소드 3개 생성
	   // 삼항연산자을 활용한 큰 값을 비교 후 출력메소드 생성
	   // inputNum1> intputNum2 : inputNum1 >inputNum3 
	   
	   
	   
	   
	   
//      5. 사용자로부터 문자열을 입력받고 "X"만 입력했을 경우에만 종료 메시지를 출력하고 그 외에는 입력한 문자열을 출력하기
//

	   
	   
//      6. 사용자가 입력한 숫자에 해당하는 구구단을 출력하기
//      단을 입력하세요 : 3단
//      출력
//      3 x 1 = 3
//      3 x 2 = 6
//      ...
//      3 x 9 = 27
//

	   
	   
//      7. ATM 메뉴에서 입금, 출금, 잔액 조회를 구현하세요.
//
//      [조건]
//      초기 잔액은 10000원으로 설정
//      메뉴에서 선택에 따라 작업 수행
//      종료 시 프로그램 종료
//
//      String msg =  "\nATM 메뉴의 번호를 선택하세요 : "
//                  + "1. 잔액 조회"
//                  + "2. 입금"
//                  + "3. 출금"
//                  + "4. 종료"
//                  + "선택 : ");


   }
}
