package array;

public class Ex06_15 {
	public static void main(String[] args) {
		int[][] arr= new int[5][5]; //5행 5열 2차원 배열 생성
		
		int count = 1; //count 값 1로 선언 및 초기화
		
		for(int i = 0; i<5; i++) { //i의 크기가 5보다 작면 i증가 행
			for(int j = 0; j < 5; j++) {  //j의 크기가 5보다 작다면 j증가 열
				
				arr[i][j] = count++; //각 ij의 위치한 방에 count는 1부터 증가하는 후위 증감식 사용
			}
			
			
		}
		
		for(int i = 0; i < 5; i++) { //i의 크기가 5보다 작면 i증가 행
			for(int j = 0; j <5; j++) { //j의 크기가 5보다 작다면 j증가 열
				System.out.print(arr[i][j] + " "); //2차원 배열 출력
			}
			System.out.println(); //줄바꿈
			
		}
	}
}
