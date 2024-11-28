package team;

import java.util.Scanner;

public class Team05 {
	public static void main(String[] args) {
//      I팀
//      1. 업다운문제
//         초기 숫자 상수로 정하고 숫자 3회 입력
//           > (상수 > 입력) : up 출력
//           > (상수 < 입력) : down 출력		
      
      //1. 로직구성
      //scanner 입력메소드 
      Scanner sc = new Scanner(System.in);
      //final로값(상수) 지정 
      final int NUM = 27;
      //사용자한테 입력받는 변수 num1 지정
      int num1 = 0;
      //for문을 사용해서 3회 반복문 작성
      for(int i = 0; i < 3 ; i++) {
         //출력 메시지를 통해 사용자에게 입력받기
         System.out.print("얼마? : " );
         //사용자에게 입력받기
         num1 = sc.nextInt();
         //입력값과 지정한 값이 같다면 break문을 사용해 반복문 종료
         if(num1 == NUM) {
            System.out.print("정답입니다");
            break;
         //입력값이 지정한 값보다 크면 다운이라는 메시지 출력
         }else if(num1 > NUM) {
            System.out.println("다운");
         //입력값이 지정한 값보다 크거나 같은 경우를 제외했기 때문에 작은 경우밖에 없어서 업이라는 메시지 출력
         }else {
            System.out.println("업");
         }
      }

	}
}






