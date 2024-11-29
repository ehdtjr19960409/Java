//신동석
package task;

public class ForTask01 {

   public static void main(String[] args) {
      //1. 1 ~ 100까지 출력 tab키만큼 간격 띄우고 10마다 줄바꿈
      // 1   2   3   4   5   6   7   8   9   10
      //11   12   13..                  20
      //21   22   ........               30
      //91   ...                        100
      
	  //범위 값은 1~100이므로 for문 사용
	  // 첫번째 for문 (초기값 int i= 1; 조건값 i<=100; i++){
	  //	i의 값이 10으로 나누어 떨어지면,
	  // 	줄바꿈
	  //	출력 
	  //	그렇지 않으면 출력
	  //	} 
	   
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
    	  
      } 
      
      //3. aBcDeFgHiJkLmNoPqRsTuVwXyZ 출력
      int i = 0; // CHAR 정수 형변환
      
      // 대문자일 때는 범위가 65부터 90이고, 소문자일 때는 97부터 122이다,for문을 통해 범위 설정
      // 소문자 대문자 구분은 짝수와 홀수의 방식이므로 if(if%2==1)홀수, else if(if%2==0)짝수
      // 
      // 
      // }
     
//      for 1개 97 <=~  <=121 ()
//      	if(if%2==1)
//      for 1개  65~ 90 
//      	if(if%2==0)
//      
      //4.1) 1부터 100까지 숫자 중 3의 배수 또는 5의 배수만 한 줄에 5개씩 띄어쓰기로 구분되도록 출력
      //   2) 3의 배수 또는 5의 배수 숫자들의 합을 구하기
      
      //교재 P.143까지 해석해보기
      
   }

}
