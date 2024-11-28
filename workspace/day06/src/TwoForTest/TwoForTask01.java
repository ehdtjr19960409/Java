package TwoForTest;

public class TwoForTask01 {
   public static void main(String[] args) {
//      i, j의 규칙성 찾기
      //스스로 복습하면서 코드해석 달아볼것 - 과정 모두 다 작성
//      1번 : 역삼각형
//      *****
//      ****
//      ***
//      **
//      *
//      for(int i = 1; i<=5; i++) { //5개 행을 생성
//    	  
//    	  for(int j = 5; i<=j; j--) { //5부터 ~ 1까지의 각 * 찍기
//    		  System.out.print("*"); //별표 출력
//    	  }
//    	  System.out.println(); //두번째 for문이 종료되면 줄바꿈
//      }
//      System.out.println(); //첫번째 for문이 종료되면 줄바꿈
//      
      
//      2번 : 피라미드와 유사하지만 좌측 정렬
//      *
//      * * *
//      * * * * *
//      * * * * * * *
      //첫 번째 for문은 4개행을 계산 
      // 두번째 for문은 홀수의 형식으로 계산값 작성
      //두번째 for문 줄바꿈
      //첫번째 for문 줄바꿈
	   
	   
	  // 첫번째 for문 4개의 행 생성
	  // 두번쨰 for문 *표시는 7번까지라고 한정 짓는다
	  // * 홀수일 때 *표시가 나와야한다
	   //두번째 for문이 끝나면 줄바꿈
	   //첫번째 for문이 끝나면 줄바꿈
	   
	   for(int i = 0; i <= 3; i++) {
	    	for(int j = 1 ; j <= (i * 2) + 1 ; j++) {	/*(홀수의 조건식)*/
	    		
	    		
	    		System.out.print("* ");
	    		
	    		
	    		
	    	}
	    	
	      
	   System.out.println();
   } 
      System.out.println();
//      3번 : 피라미드 (for문이 총 3개-> 어떻게 사용될지 먼저 생각하기)
//       *
//      * *
//      * * *
//      for(int i = 0; i<4; i++) {
//    	  
//    	  System.out.print(""); //빈공간 만들기
//    	  for(int j = 0; j<)
//      }
      
      
      
      
      
      
      
      
      	
   }
}