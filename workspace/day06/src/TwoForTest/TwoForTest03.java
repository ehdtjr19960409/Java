package TwoForTest;

import java.util.Scanner;

public class TwoForTest03 {
   public static void main(String[] args) {
	   
	   //사용자로부터 입력받은 값을 토대로 행이 나오게끔 설정
	   Scanner sc = new Scanner(System.in);
	   int num = 0;
	   System.out.print("입력받은 값: ");
	   num = sc.nextInt();
	   
	      for (int i = 1; i <= num; i++) {
//	         System.out.println("*"); //행
	         for (int j = 1; j <= i; j++) { // 열
	            System.out.print("*");
	         }
	         System.out.println();
	      }
       System.out.println();
      }
	}    
      
 