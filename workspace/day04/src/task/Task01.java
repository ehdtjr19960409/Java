package task;
//과제 : 파일명 본인이름으로 보내기
import java.util.Scanner;

public class Task01 {
   public static void main(String[] args) {
	   
	   //입력 클래스 만들기
	   Scanner sc = new Scanner(System.in);
	   
      //1. 100000원이 넘는 금액을 입력받아 5만원, 1만원, 5천원, 1천원 단위로 나누어 출력하기
      
	   //입력받은 변수 1개 생성, 각 자리수 결과값 생성
	   int charge = 0;
	   int result, result1, result2, result3 = 0;
	   
	   //nextInt()메소드 만들기
	   System.out.print("입력받을 금액 : \n" );
	   charge = sc.nextInt();
	   
	   //각 자리수 연산자 활용
	   result = charge/50000;
	   result1 = (charge%50000)/10000;
	   result2 = ((charge%50000)%charge)/5000;
	   result3 = (((charge%50000)%charge)%charge)/1000;
	   
	   //출력 메소드 만들기
	   System.out.printf("5만원 %d개, 1만원 %d개, 5천원 %d개, 1천원 %d개\n", result, result1, result2, result3);
	   //입력 버퍼를 비우기 위해 nextLine 만들기
	   sc.nextLine();
//--------------------------------------------------      
	   
      //2. 키와 몸무게를 입력받아 BMI를 계산하기
      // 공식 : 몸무게 / (키 * 키)
	   
	   //몸무게 키 관련된 실수로된 변수 생성, BMI 변수 만들기
	   double weight, height, BMI = 0;
	   
	   //nextDoubel() 메소드 만들기
	   System.out.print("당신의 키와 몸무게는 몇입까? : \n");
	   height = sc.nextDouble();
	   weight = sc.nextDouble();
	   
	   BMI = weight /(height * height);
	   
	   //출력하기
	    System.out.println("BMI 결과 값: "+BMI);
	   
	   //입력 버퍼를 비우기 위해 nextLine() 만들기
	   sc.nextLine();
	   
//--------------------------------------------------	 
      //3. 밑변과 높이를 입력받아 삼각형의 높이 계산하기
      //공식 : 0.5 * 밑변 * 높이
      

      
      //4. 두 정수를 입력받아 0보다 큰지 출력하기(true or false로 출력할 것)
      
      
      //5. 사용자에게 물건의 개수와 가격을 입력받아 총액 계산하기
      // 물건의 개수 : 3
      // 물건의 개당 가격 : 15000
      // 총액 : 금액원
      
      
      //6. 두 자리수 정수를 한 개 입력받아 각 자리의 숫자를 더하여 출력하기(각 자리수의 합)
      
      
      //7. 정수를 입력받아 양수이면서 짝수인지 확인하여 결과 출력하기
      //true or false
      
      
      //8. 두 숫자를 입력받아 첫번째 입력받은 숫자가 두번째 숫자보다 크거나 같은지 여부를 출력하기
      //true or false
      
      
      //9. 두 숫자를 입력받아 한 숫자만 양수인지 여부 출력하기
      //true or false
      
      
      //10. 연도를 입력받아 윤년인지 아닌지 출력하기(2024년, 2025년도로 확인할 것)
      //true or false => true이면 0000년은 윤년입니다로 출력할 것, false이면 0000년은 윤년이 아닙니다로 출력
      // 윤년 계산 : 연도가 4로 나누어떨어지고 100으로 나누어떨어지지 않거나 400으로 나누어떨어져야한다
      
   }
}
