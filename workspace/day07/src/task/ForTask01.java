//신동석
package task;

public class ForTask01 {

   public static void main(String[] args) {
      //1. 1 ~ 100까지 출력 tab키만큼 간격 띄우고 10마다 줄바꿈
      // 1   2   3   4   5   6   7   8   9   10
      //11   12   13..                  20
      //21   22   ........               30
      //91   ...                        100
       
		// 범위 값은 1~100이므로 for문 사용
		// 첫번째 for문 (초기값 int i= 1; 조건값 i<=100; i++){
		// i의 값이 10으로 나누어 떨어지면,
		// 줄바꿈
		// 출력
		// 그렇지 않으면 출력
		// }
		   
	   for(int i =1; i<=100; i++) {
		   if(i%10==0) {
			   
			   System.out.printf("%d\t",i);
			   System.out.println("");
		   }else {
			   System.out.printf("%d\t",i);
		   }
		   
	   }
	   
	   
	   
      //2. A~F출력
	 //대문자 A의 값과 F값을 확인하기 위해 int 변수를 선언
	 //범위가 A~F로 범위가 정해져 있으므로 for문사용
	 // 변환받을 문자형 변수가 필요하므로 생성하고 
	 // i의 값이 해당 아스키코드 값을 문자형으로 변환
	 // i값을 출력메소드를 통해 출력  
	   
	   
	   
	   
	  int a = 'A';
      int f = 'F';
      
      for(int i = a; i<=f; i++ ) {
    	  
    	  char english = (char) i; 
    	  System.out.print(english);
    	  
      }System.out.println(); 
      
      //3. aBcDeFgHiJkLmNoPqRsTuVwXyZ 출력
      int i = 0; // CHAR 정수 형변환
      // a부터 z까지 26개의 문자이다 
      // for문 범위는 0부터 25까지이다
      // if문 i가 짝수일 때 2로 나눠서 나머지가 0이면
      // i 에 65를 더하고 문자형으로 강제형 변환
      // else문 i에 97를 더해 강제형변환
      
      for(int j = 0; j < 26 ; j++) {
    	  if(j%2==0) {
    		  System.out.print((char) (j+97));
    	  }else {
    		  System.out.print((char) (j+65));
    	  }
    	  
      }
      System.out.println();
 
      
      //4.1) 1부터 100까지 숫자 중 3의 배수 또는 5의 배수만 한 줄에 5개씩 띄어쓰기로 구분되도록 출력
      //   2) 3의 배수 또는 5의 배수 숫자들의 합을 구하기
      
      //1부터 100까지이므로 for문
      // if문으로 3의 배수 || 5의 배수 조건식
      //	if문 12로 떨어질 때 줄바꿈
      // 숫자 간격 조정하기 위해 syso (i+" " )
      for(int k = 1;k<=100;k++) {
    	  if(k%3==0 || k%5==0) {
    		  if(k%12==0) {
    			  System.out.println();
    		  }
    		  System.out.print(k+" ");
    	  }
      }
      //교재 P.143까지 해석해보기
      
   }

}
