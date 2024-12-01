package TwoForTest;

public class TwoForTask01 {
	public static void main(String[] args) {
//      i, j의 규칙성 찾기
		// 스스로 복습하면서 코드해석 달아볼것 - 과정 모두 다 작성
//      1번 : 역삼각형
//      *****
//      ****
//      ***
//      **
//      *

		// 5개 행을 생성
		// 5부터 ~ 1까지의 각 * 찍기
		// 별표 출력
		// 두번째 for문이 종료되면 줄바꿈
		// 첫번째 for문이 종료되면 줄바꿈

		for (int i = 1; i <= 5; i++) {

			for (int j = 5; i <= j; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
//      

//      2번 : 피라미드와 유사하지만 좌측 정렬
//      *
//      * * *
//      * * * * *
//      * * * * * * *
		// 첫 번째 for문은 4개행을 계산
		// 두번째 for문은 홀수의 형식으로 계산값 작성
		// 두번째 for문 줄바꿈
		// 첫번째 for문 줄바꿈

		// 첫번째 for문 4개의 행 생성
		// 두번쨰 for문 *표시는 7번까지라고 한정 짓는다
		// * 홀수일 때 *표시가 나와야한다
		// 두번째 for문이 끝나면 줄바꿈
		// 첫번째 for문이 끝나면 줄바꿈

		for (int i = 0; i <= 3; i++) {
			for (int j = 1; j <= (i * 2) + 1; j++) { /* (홀수의 조건식) */

				System.out.print("* ");

			}

			System.out.println();
		}
		System.out.println();
//      3번 : 피라미드 (for문이 총 3개-> 어떻게 사용될지 먼저 생각하기)
//       *
//      * *
//     * * *

//		*의 최대가 3이므로 행은 3개 범위이므로 for문 사용      
//		 첫번째 for 문은 행을 나타내므로 for(int i = 1; i<=3 ; i++)     
//		 두번째 for문은 빈공간을 나타내야 하고 범위=3 
//			공백을 하기 위해서는 for문 초기식 1. j=3부터 시작 / 조건식은 2.j>=i / 증감식 j-- 하나씩 줄어드면서 공백이 줄어야함
		// print(" ")
//		세번쨰 for문은 *이 찍히는 것을 나타내어야함		  
//      	k=1 / k < i+1 / i++ k는 열을 의미하고 있어서 증가하면서 *가 찍혀야함
		// print("* ")
//		줄바꿈으로 구별

		for (int i = 1; i <= 3; i++) {
			for (int j = 3; i <= j; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < i + 1; k++) {
				System.out.print("* ");
			}
			System.out.println();

		}

	}
}