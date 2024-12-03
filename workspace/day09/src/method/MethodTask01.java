package method;

import java.util.Scanner;

public class MethodTask01 {
   public static void main(String[] args) {
         MethodTask01 mt = new MethodTask01();
            Scanner sc = new Scanner(System.in);
            
            System.out.println("각 국어, 수학, 역사의 점수를 입력 : ");
            int kor = sc.nextInt();
            int math = sc.nextInt();
            int history = sc.nextInt();
            
            int[] score = {kor, math, history};
         
            
            System.out.println(mt.grade(score));
            System.out.printf("%.2f" , mt.avg(mt.grade(score)));

      }
   	
   	  	//문제) 국어, 수학 역사의 점수를 입력해서 총점과 평균 소수점 두자리까지를 구하시오
   		// 단, 메소드 2개를 활용해서 정수형 총합과 실수형 평균 로직을 구분하시오
       	 
		// method1
		// 매개변수 o, 리턴타입 o -> 총합
		// 매개변수는 배열로 받는다
		// for each문활용
		// 메소드명 : grade

		// method2
		// 매개변수 o, 리턴타입 o -> 평균
		// 매소드명 : avg
   	
   
   		//로직
		// main
		// 메소드 클래스 호출
		// 스캐너 클래스 호출
		// 출력 (행과 열 입력: )
		// 스캐너 메소드를 선언 및 초기화
		// 매개변수o, 리턴타입o 이므로 출력메소드를 사용
		// grade 메소드에서 총합 점수를 가져온다
		// avg 메소드에서 평균 점수를 가져온다   
   
   
   		//method1 grade
   		//-선언부
   		// 정수형 grade 메소드 생성
   		// 매개변수는 정수형 배열로 받는다
   		
   		//-구현부
   		//총합의 정수형 선언
   		// 배열의 들어간 각 방번호를 for each문으로 더한다
   		// 매개변수와 리턴타입을 받아야하므로 총합을 return한다
   		
		int grade(int[] arr) {

			int totalSum = 0;
			for (int data : arr) {

				totalSum += data;
			}
			return totalSum;
		}
		
		//로직
   	  	//method2 avg
		//-선언부
		// 정수형 avg 메소드를  생성
		//매개변수는 정수형으로 받는다
		//매견변수의 값으로 평균을 내고 정수형으로 초기화 및 선언한다
		//매개변수와 리턴타입이 있어야하고
		//return 평균으로 한다
      
      double avg(double num) {
         
         double totalAvg = num / 3;
         return totalAvg;
        
         
      }
      
   }
