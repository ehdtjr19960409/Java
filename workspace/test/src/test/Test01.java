package test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		//1. 3x3 크기의 2차원 배열을 생성하고 사용자가 입력한 값을 대입
	      //1) 각 행의 합계와 평균 출력
	      //2) 전체 배열의 합계와 평균 출력
		
		//값 저장
		//2차원 배열 생성
		// 입력클래스 import
		//  포문 배열의 길이만큼
		//		포문 i 배열의 길이만큼 
		// 입력한 값 2차원 배열에 저장
		
		//행 평균 초기화 변수
		//for문 
		
		Scanner sc = new Scanner(System.in);
		int[][] ar1 = new int[3][3];
		
		 for(int i = 0; i < ar1.length; i++) {
	         for(int j = 0; j < ar1[i].length; j++) {
//	            System.out.println("i : " + i + ", j : " + j);
	            System.out.println("ar1[" + i + "]["+ j + "]배열의 값 입력 : ");
	            ar1[i][j] = sc.nextInt();
	         }
	      }
	      
	      
	      double rowAvg = 0.0;
	      
	      System.out.println("각 행의 합계와 평균 : ");
	      for(int i = 0; i < ar1.length; i++) {
	    	  int rowSum = 0; 
	         for(int j = 0; j < ar1[i].length; j++) {
	            rowSum += ar1[i][j];
	         }
	         rowAvg = (double)rowSum/ar1[i].length;
	         System.out.printf("행 : %d, 합계 : %d, 평균 : %.2f\n", i+1, rowSum, rowAvg);
	      }
		
		
	}
}
