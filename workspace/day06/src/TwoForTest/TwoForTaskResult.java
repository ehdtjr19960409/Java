package TwoForTest;

public class TwoForTaskResult {
	public static void main(String[] args) {
		
	      //      i, j의 규칙성 찾기
//      시간은 35분까지 => 오늘 수업 끝날 때 코드 공유
//      (스스로 복습하면서 코드해석 달아 볼 것-과정 모두 다 작성)
//      문제 풀이는 내일 아침 복습시간에 진행
      
//      1번 : 역삼각형
//      *****
//      ****
//      ***
//      **
//      *
		
//		i : 바깥for문(행)
//		j : 안쪽for문(열)
		
		for(int i = 5; i>=1; i--) { //i는 5부터 1까지 감소(행)
		//	System.out.println(i); //5부터 시작 확인
			for(int j = 1; j<=i; j++) { //j는 1부터 i까지 증가(열)
				
		//		System.out.println("i : " + i + " ,  j :" +j ); // i, j 규칙성확인
				System.out.print("*");
				
			}
			System.out.println();
		}
		

		
      
//      2번 : 피라미드와 유사하지만 좌측 정렬
//      *
//      * * *
//      * * * * *
//      * * * * * * *
		
		for(int i = 1 ; i<=4; i++) {
			
			for(int j = 1; j<=i*2-1; j++) {
				System.out.print("*");
			//	System.out.println("i : " + i + " ,  j :" +j ); // i, j 규칙성확인
			}
			System.out.println();
		}
		

		
      
//      3번 : 피라미드 (for문이 총 3개-> 어떻게 사용될지 먼저 생각하기)
//       *
//      * *
//     * * *
	      for(int i = 1; i <= 3; i++) { //i는 행, 1부터 3까지 증가
//	         System.out.println(i);
	         for(int j = 1; j <= 3-i; j++) { //j 공백 출력
//	            System.out.println("i = " + i + ", j = " + j);
	            System.out.print(" ");
	         }
	         
	         for(int k = 1; k <= i; k++) { //k * 출력
//	            System.out.println("i = " + i + ", k = " + k);
	            System.out.print("* ");
	         }
	         System.out.println();
	      }

		
		
	}
}
