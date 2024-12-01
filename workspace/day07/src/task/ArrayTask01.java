//신동석
package task;

import java.util.Scanner;

public class ArrayTask01 {
   public static void main(String[] args) {
      //배열문제 조건 1) 칸수만 알고있다고 가정
      //         조건 2) 반드시 length 사용
      //         조건 3) 값을 대입하는 반복문, 값을 출력하는 반복문 각각 사용
      
      //1. 100~1까지의 값을 배열에 넣고 출력
      //일반 for문만 사용
	   // 배열 칸수 100으로 선언
	   //배열길이로 설정해서 값을 대입하는 반복문
	   //배열길이로 설정해서 값을 출력하는 반복문
//	   int[] number = new int[100];
//	   for(int i = 0; i < number.length; i++) {
//		   number[99 - i] = i+1;
//	   }
//	   for(int i = 0; i<number.length; i++) {
//		   System.out.print(number[i]); 
//	   }
//	   System.out.println();
      //2. 1~10까지의 값을 배열에 넣고 총 합 구하기
      //일반 for문만 사용
	   
	   //10칸짜리 배열 선언
	   //정수형 변수 선언
	   //for문에 배열 길이 사용
	   //값을 대입하는 반복문
	   //0번부터 10번방까지의 값을 더하는 반복문
	   //출력메소드
//	   int num = 0;
//	   int[] number1 = new int[10];
//	   for(int i = 0; i< number1.length; i++) {
//		   number1[i] =i+1; 
//		   
//	   }
//	   
//	   for(int i = 0; i< number1.length; i++) {
//		    
//		   num += number1[i];
//	   }
//	   
//	  System.out.println(num);
		
      //3. 사용자에게 4개의 숫자를 입력받고 입력받은 값을 배열에 저장한 후 배열의 평균(소수점 3자리까지) 구하기
      //일반 for문, for-each문 상관없음
	  
	  //scanner 클래스
	  //4개의 실수형 생성, 실수형 결과 변수 생성
      // 출력메소드
	  // 입력메소드 4개 실수형으로 만들기
	  // 어떤 값이 들어갈지 알 수 있다, 배열 선언
	  //for문 배열의 길이만큼
	  // 결과변수에다가 4개 평균내기
	  // 출력메소드에서 3번째 소수점까지 출력
//	  Scanner sc = new Scanner(System.in);
//	  double a, b, c, d, avg = 0;
//	  System.out.print("4개의 숫자 입력 : ");
//	  a=sc.nextDouble();
//	  b=sc.nextDouble();
//	  c=sc.nextDouble();
//	  d=sc.nextDouble();
//	  
//	  double[] arr = {a,b,c,d};
//	  for(int i=0; i<arr.length; i++) {
//		  avg += arr[i];
//	  }
//	  double result =avg/4;
//	 System.out.printf("평균: %.3f ",result); 
//	  
//	 System.out.println();
	   
	   
//      //4. 0, 1, 2, 3, 4, 0, 1, 2, 3, 4 값을 배열에 담고 출력
//      //출력시 for-each문 사용
//      int[] arr1 = {0,1,2,3,4,0,1,2,3,4};
//      for(int a1: arr1) {
//    	  System.out.print(a1+" ");
//      } 
      
      //5. A~F까지를 C만 제외하고 배열에 담아 출력
      //일반 for문
      //초기식 int i = 0;
      
	   //배열 6칸짜리 A라는 참조값에 생성
	   //문자형 선언
	   //for문으로 조건식은 F까지 계산해야하므로 길이에 +1
	   //if조건문으로 c를 제외하고 나머지 값을 받기
	   // 2를 제외한 문자 형변환을 통해 ch에 넣어두고 A배열에 0번방부터 넣기
	   //출력메소드
//		char[] A = new char[6];
//		char ch = ' ';
//		for (int i = 0; i < A.length+1; i++) {
//			 
//				if (!(i == 2)) {
//					ch = (char) (i + 65);
//					A[i] = ch;
//				}
//
//			System.out.print(A[i] + " ");
//		}
    	  	

      
      //6. aBcDeFgHiJkLmNoPqRsTuVwXyZ를 순서대로 배열에 담아 출력
      // 26개의 영문자, 방번호를 알고있음
	  // 25개의 참조값으로 arr 참조변수 생성
	   //문자형 변수선언
	   //for문 조건신 length+1로 설정
	   // if(0으로 떨이지면)
	   // (문자 강제형변환)(i+97)
	   //else이면 (문자 강제형변환)(i+65)
	   //print arr3[i]으로 출력
//	  char[] arr3 = new char[26];
//	  char ch1 = ' ';
//	  for(int i=0; i < arr3.length+1; i++) {
//		  if(i%2==0) {
//			  ch1 = (char)(i+97);
//			  arr3[i] = ch1;
//		  }else {
//			  ch1 = (char)(i+65);
//			  arr3[i] = ch1;
//		  }
//		  System.out.print(arr3[i]+" ");
//	  }
	  
      
      //7. 5개의 정수를 입력한 뒤 배열에 담고 최소값과 최대값 출력하기
      //일반 for문
	  //scanner 클래스
	  Scanner sc =new Scanner(System.in);
	  // 5개의 정수 선언
	  // 5개의 정수 입력 출력메소드
	  // for문 안에서 배열의 길이로 생성 
	  // 5개의 정수 입력받은 값을 배열에 담아준다
	  // 정수형 최솟값과 최대값 정수형으로 선언
	  // for문을 배열의 길이만큼 생성
	  // 입력된 첫번째 값을 기준으로 배열의 크기 만큼 비교 최소값
	  // 입력된 첫번쨰 값을 기준으로 배열의 크기 만큼 비교해서 최댓값
	  // 최소값 최대값 출력
	  
	  
	  int q,w,e,r,t = 0;
	  System.out.print("5개의 정수 입력 : ");
	  int[] arr4 = new int[5];
	  for(int i =0; i<arr4.length; i++) {
		 arr4[i] =  sc.nextInt();
		  
	  }
	  int min = arr4[0];
	  int max = arr4[0];
	  
	  for(int j = 0; j<arr4.length; j++) {
		   
		  if(min < arr4[j+1]) {
			  
		  }else if(max > arr4[j+1]) {
			  
		  }
		  	
	  }
     
      //8. 사물함의 비밀번호를 설정하고 사용자에게 이용할 사물함 번호와 비밀번호를 입력받아
      //    입력된 사물함의 비밀번호와 설정한 비밀번호를 비교하여 일치 여부 출력하기
	  
	  //scanner 클래스 import
	  
	  // 전체 for1문 배열의 길이만큼 설정과 입력 비교 (int i=1; i< 배열.length ; i++)
	  // 배열 선언하고 3크기의 방번호 설정
	  // for배열의 길이만큼 반복
	  // for1-1문안에서 입력받을 사용자의 비밀번호 3개 입력 설정 : 출력 메소드 
	  // 3개의 입력메소드 선언 및 초기화 
	  
	  // 배열 선언하고 3개 크기 선언
      // for1-2문안에서 입력받을 사용자의 비밀번호 3개 입력 : 출력 메소드
	  // 입력받을 사용자의 비밀번호 3개 입력 : 출력 메소드
	  // 3개의 입력메소드 선언 및 초기화
	  
	  // for1문안에서 if문 작성
	  // if문 설정한값과 비밀번호 입력한 첫번쨰 값 비교
	  // 	if문안에 if문 작성해서 2번째 값이 같을 경우
	  // 		if문안에서 if문 작성해서 3번쨰 값이 같을 경우
	  // 			비밀번호일치
	  // 	2번쨰 값과 다를 경우 break 탈출
	  //		3번쨰 값과 다를 경우 break 탈출
	  //		 비밀번호 불일치
	  // 첫번쨰 if문 다를 경우 비밀번호 불일치 출력 
	  //		break;로 탈출
	 
	  
	  
	  
	  
      
      //9. 학생 1명의 3과목 총점과 평균(소수점 3자리까지)을 구하고 출력하기
      //   3과목은 배열에 입력받아 저장하며 for-each문만 사용(일반 for문 사용금지!)
	  
	  // scanner 클래스로 import 
	  // 배열 3크기의 설정 및 선언
	  // 학생 1명의 3과목 입력 : 출력메소드
	  // for-each문으로 입력받은 3개의 변수 담기
	  // 3개의 입력 메소드 double로 지정 및 double형 변수 선언
	  
	  // for-each문으로 입력받은 3개의 변수 더하기
	  // 총점 출력 메소드
	  // 평균 출력 메소드 (단, 3자리까지로) 출력
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
   }
}
