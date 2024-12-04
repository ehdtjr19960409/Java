package TeamTask;

import java.util.Scanner;

public class TeamTask01 {
	
	public static void main(String[] args) {
		
		TeamTask01 tt = new TeamTask01();
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("두 수를 띄어쓰기로 구분해서 입력하세요 : ");
//		int number1 = sc.nextInt();
//		int number2 = sc.nextInt();
//		
//
//		int[][] arr = new int[10][10];
//		
//		 tt.insertValue(arr);
////		 System.out.println(arr[0][2]); // 2차원 배열 저장된값 확인
//	 
//		 System.out.println(tt.findMutiple(number1, number2, arr));
//		 
//		 
//		 tt.findValue(number1, number2, arr, tt.findMutiple(number1, number2, arr));
//		
//	}
//	
//	//1번 배수들의 여러 값 구하기
//    
//    //스캐너 클래스 생성
//    //1~100까지의 수만 입력받아서 출력
//    //메소드에서 2차원배열 구성
//    //메인에서 입력받은 수들의 배수를 구해야합 겹치는 배수는 빼고
//    //배수들의 총 합을 메소드로 구현해서 출력
//    //배수들의 평균을 위에 총합 메소드명을 같이 써서 메소드 오버로딩을 통해 출력 (소수점 2번째 자리까지)
//	
//	void insertValue(int[][] arr1) {
//		int value = 1;
//		
//		for(int i =0; i < arr1.length; i++) {
//			for(int j = 0; j < arr1[i].length; j++) {
//				arr1[i][j] = value++;
//			}
//		}
//	}
//	
//	int findMutiple(int num1, int num2, int[][] arr2) {
//		
//		int result = arr2[9][9] / num1;
//		int result1 = arr2[9][9] / num2;
//// 최소공배수 구하기
//		
//
//		
//		return result+result1;
//	}
//	//  mt . findvalue( num1.num2. arr,mt.findMuiple)
//	
//	void findValue(int num3, int num4, int[][] arr2, int num5) {
//		
//		int totalSum = 0;
//	
//		
//		for(int i = 1; i <=arr2.length; i++) {
//			if(i%num3==0 || i%num4==0) {
//				totalSum += i;
//			}
//		}
////		double result1 =  개수 / result;
//		double totalAvg  = (double) num5 /totalSum;
//
//		
//	}
		// 1번 배수들의 여러 값 구하기

		// 스캐너 클래스 생성
		// 1~100까지의 수만 입력받아서 출력
		// 메소드에서 2차원배열 구성
		// 메인에서 입력받은 수들의 배수를 구해야합 겹치는 배수는 빼고
		// 배수들의 총 합을 메소드로 구현해서 출력
		// 배수들의 평균을 위에 총합 메소드명을 같이 써서 메소드 오버로딩을 통해 출력 (소수점 2번째 자리까지)

		// 1번문제 답
		int[][] ar = new int[10][10];
		tt.insertValue(ar);

		System.out.println("두 수를 띄어쓰기로 구분해서 입력하시오 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		while (!((0 < num1 && num1 < 101) && (0 < num2 && num2 < 101))) {
			System.out.println("1부터 100사이의 값을 입력하세요");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
		}
		System.out.print(num1 + "과 " + num2 + "의 배수는 총 : " + tt.findMultiple(num1, num2, ar) + "개 이고");
		tt.findValue(num1, num2, ar, tt.findMultiple(num1, num2, ar));
	}
	// 1번문제 메소드들
	void insertValue(int ar[][]) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				ar[i][j] = (i * 10 + j + 1);
			}
		}
	}

	int findMultiple(int num1, int num2, int ar[][]) {
		
		int num3 = 0;//num3은 최소공배수 

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (((ar[i][j] % num1) == 0) && (ar[i][j] % num2) == 0) {
					num3 = ar[i][j];
					break;
					// i = 1 j = 5 / 15 = 3 5 최소공배수 j 를 보지 않겟다
				}
			}
			if (num3 != 0) {
				break;
			}
		}

		int multi = (100 / num1) + (100 / num2) - (100 / num3);

		return multi;
	}

	void findValue(int num1, int num2, int ar[][], int num3) {
		int sum = 0;
		double total = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (((ar[i][j] % num1) == 0) || ((ar[i][j] % num2) == 0)) {
					sum += ar[i][j];
				}
			}
		}
		total = (double) sum / num3;
		System.out.printf(", 합은 : " + sum + ", 평균은 %.2f 입니다.", total);
	}

	
	
}
