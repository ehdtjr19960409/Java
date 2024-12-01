package Task;

import java.util.Scanner;

public class Task_1 {
	public static void main(String[] args) {
//      4. 세 개의 정수를 입력받아 가장 작은 숫자부터 큰 숫자 순으로 정렬하여 출력하기(단, 삼항연산자만 이용할 것)
//      입력 : 5 1 9
//      출력 : 1 5 9
	   // 3개의 정수 선언
	   // 입력메소드 3개 생성, 결과값 변수 선언
	   // 삼항연산자을 활용한 큰 값을 결과 변수에 넣기
	   // 삼항연산자을 활용한 중간 값을 결과 변수에 넣기
	   // 삼항연산자을 활용한 작은 값을 결과 변수에 넣기
	   // 	   삼항연산자 = 조건식? 참: 거짓; 
	   // 출력메소드에서 입력값에 따라 작은것에서 큰 순서로 정렬 출력
	   Scanner sc = new Scanner(System.in);
	   int num01, num02, num03, resultBig, resultMiddle, resultSmall =0;
	   System.out.print("첫번째 정수 : ");
	   num01=sc.nextInt();
	   num02=sc.nextInt();
	   num03=sc.nextInt();
	   
	   resultBig = (num01 > num02 && num01 > num03) ? num01 : num02 > num03 ? num02 :num03 ;
	   resultMiddle = ((num01 != resultSmall) && (num01 != resultBig)) ? num01 : ((num02 != resultSmall) && (num02 != resultBig)) ? num02:num03;
	   resultSmall = (num01 < num02 && num01 < num03) ? num01 : num02 < num03  ? num02 :num03 ;
	   		   
	  System.out.println("출력 : " + resultSmall+ " " + resultMiddle + " " + resultBig);


	}
}
