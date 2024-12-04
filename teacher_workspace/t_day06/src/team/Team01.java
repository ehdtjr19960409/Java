package team;

public class Team01 {
	public static void main(String[] args) {
//		1번 문제
//		- 이중 for문 사용 (위로 향하는 삼각형은 행 : 6, 열 : 6 / 아래로 향하는 삼각형 행 : 5, 열 : 5)
//		(1)	여백은 행이 내려갈수록 증가, *도 행이 내려갈수록 증가
//		(2)	여백은 행이 내려갈수록 증가, *이 행이 내려갈수록 감소
		
//		** 로직
		
//		위로 향하는 삼각형 출력
//		행(6줄)을 위한 for문
		for (int i = 1; i <= 6; i++) {
//			공백 5, 4, 3, 2, 1 칸 출력을 위한 for문
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
//			* 1, 2, 3, 4, 5 칸 출력을 위한 for문
			for (int k = 1; k < i+1; k++) {
				System.out.print("* ");	
			}
			System.out.println();
		}
		
//		아래로 향하는 삼각형 출력0
//		행(5줄)을 위한 for문
		for (int l = 1; l < 6; l++) {
//			공백 1, 2, 3, 4, 5칸 출력
			for (int m = 0; m < l; m++) {
				System.out.print(" ");
			}
		
////			별 5, 4, 3, 2, 1칸 출력
			for (int n = 5; n >= 0+l; n--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
