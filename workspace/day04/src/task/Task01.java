package task;

//과제 : 파일명 본인이름으로 보내기
import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {

		// 입력 클래스 만들기
		Scanner sc = new Scanner(System.in);

////      1. 100000원이 넘는 금액을 입력받아 5만원, 1만원, 5천원, 1천원 단위로 나누어 출력하기

		// 입력받은 변수 1개 생성, 각 자리수 결과값 생성
		// nextInt()메소드 만들기
		// 각 자리수 연산자 활용
		// 출력 메소드 만들기
		// 입력 버퍼를 비우기 위해 nextLine 만들기

		int charge = 0;
		int result, result1, result2, result3 = 0;

		System.out.print("입력받을 금액 : \n");
		charge = sc.nextInt();

		result = charge / 50000;
		result1 = (charge % 50000) / 10000;
		result2 = ((charge % 50000) % charge) / 5000;
		result3 = (((charge % 50000) % charge) % charge) / 1000;

		System.out.printf("5만원 %d개, 1만원 %d개, 5천원 %d개, 1천원 %d개", result, result1, result2, result3);

		sc.nextLine();
//--------------------------------------------------      

//      //2. 키와 몸무게를 입력받아 BMI를 계산하기
//      // 공식 : 몸무게 / (키 * 키)
//	   
		// 몸무게 키 관련된 실수로된 변수 생성, BMI 변수 만들기
		// nextDoubel() 메소드 만들기
		// 입력받은 키와 몸무게를 계산해서 BMI변수에 넣기
		// 출력하기
		// 입력 버퍼를 비우기 위해 nextLine() 만들기

		double weight, height, BMI = 0;

		System.out.print("\n당신의 키와 몸무게는 몇입까? : ");
		height = sc.nextDouble();
		weight = sc.nextDouble();

		BMI = weight / (height * height);

		System.out.println("\nBMI 결과 값: " + BMI);

		sc.nextLine();

//--------------------------------------------------	 
//      //3. 밑변과 높이를 입력받아 삼각형의 높이 계산하기
//      //공식 : 0.5 * 밑변 * 높이

		// double 2개 변수 생성 초기화
		// 밑변,높이 입력 메소드 생성
		// 삼각형 높이 공식 계산
		// 출력 메소드 생성
		// 버퍼 초기화
		double triBase, triHeight = 0;

		System.out.print("\n 밑변과 높이 입력 : ");
		triBase = sc.nextDouble();
		triHeight = sc.nextDouble();

		triHeight = triBase * triHeight * 0.5;

		System.out.println("삼각형의 높이 : " + triHeight);

		sc.nextLine();
//--------------------------------------------------

//      //4. 두 정수를 입력받아 0보다 큰지 출력하기(true or false로 출력할 것)
		// 두 정수의 변수 선언
		// 두 정수의 입력 메소드 생성
		//0보다 큰지 출력(t||f로 출력)
		//버퍼 초기화
	   int number, number1 = 0;
	   	   
	   System.out.print("두 정수 입력 : ");
	   number = sc.nextInt();
	   number1 = sc.nextInt();
	      
	   System.out.println(number>0);
	   System.out.println(number1>0);
	  	
	    sc.nextLine();
//--------------------------------------------------	   

		// 5. 사용자에게 물건의 개수와 가격을 입력받아 총액 계산하기
		// 물건의 개수 : 3
		// 물건의 개당 가격 : 15000
		// 총액 : 금액원

	    //int형 물건의 개수 변수, 물건의 개당 가격 변수, 총액 변수 생성
	    //입력 메소드 생성
	    // 총액 계산 결과 연산을 총액 변수에 넣기
	    // 총액 구하는 계산을 통해 값 계산
	    // 출력 메소드
	    // 입력 버퍼 초기화
	    
	   int productNum, productPrice, totalPrice = 0;
	   	   
	   System.out.print("물건의 개수 : ");
	   productNum = sc.nextInt();
	   
	   System.out.print("상품의 개당 가격 : ");
	   productPrice = sc.nextInt();
	   
	   totalPrice = productNum * productPrice;
	   
	   
	   System.out.printf("총액 : %d", totalPrice);
	   
	   
	   sc.nextLine();

//--------------------------------------------------	   

		// 6. 두 자리수 정수를 한 개 입력받아 각 자리의 숫자를 더하여 출력하기(각 자리수의 합)

		// 두 자리수인 정수 한개 변수 1개와 결과를 뜻하는 변수 2개 선언
	   	//입력 메소드 생성
	   	//각 자리의 수가 나오게 연산
	   	//출력메소드를 통해 각 자리수 더하기
	   	//입력 버퍼 초기화
	   
	   int num3, resultNum, resultNum1 = 0;
	   	   
	   System.out.print("두 자리수인 정수 입력 : ");
	   num3 = sc.nextInt();
	      
	   resultNum = num3/10;
	   resultNum1 = num3%10;
	      
	   System.out.println("각 자리의 숫자를 더하여 출력 : "+(resultNum+resultNum1));
     
	   sc.nextLine();

//--------------------------------------------------  

		// 7. 정수를 입력받아 양수이면서 짝수인지 확인하여 결과 출력하기
		// true or false

	   //입력받을 정수 변수 1개를 선언 
	 //입력 메소드 생성
	 //출력메소드 생성
	   //양수이면 0보다 커야하는 관계연산자와 몫이 0인 짝수값으로 구분
	 //입력 버퍼 초기화
	   int positiveNum = 0;
	   	  
	   System.out.print("정수를 입력 : ");
	   positiveNum = sc.nextInt();
	   	   
	   System.out.println("정수를 입력받아 양수이면서 짝수인지 확인 : "+(positiveNum>0&&positiveNum%2==0));
	   	   
	   sc.nextLine();

//--------------------------------------------------     
		// 8. 두 숫자를 입력받아 첫번째 입력받은 숫자가 두번째 숫자보다 크거나 같은지 여부를 출력하기
		// true or false

		// 두 숫자인 변수 선언
	   //입력 메소드 생성
	   //첫번째 입력받은 숫자가 두번째 숫자보다 크거나 같은지 여부 -> num11 >= num12 출력메소드 생성
	 //입력버퍼 초기화
	   	int num11, num12 = 0;
	   	
	   
	   System.out.print("두 숫자 입력 : ");
	   num11=sc.nextInt();
	   num12=sc.nextInt();
	   
	   
	   System.out.println("논리연산 결과 값 : " + (num11>=num12));
	   
      
	   sc.nextLine();

//--------------------------------------------------	   
		// 9. 두 숫자를 입력받아 한 숫자만 양수인지 여부 출력하기
		// true or false

		// 두 숫자를 입력받을 int형 변수 선언
	// 입력 메소드 생성
	 //출력메소드 생성(한 숫자만 양수인지 여부 출력)
	 //입력버퍼 초기화
	   
	   	int num21, num22 = 0;
	   	
	   
	   System.out.print("입력 받을 두 숫자 : ");
	   num21 = sc.nextInt();
	   num22 = sc.nextInt();
	   
	   
	   System.out.println("한 숫자만 양수인지 여부 :"  +(num21>0||num22>0));
	   
	   
	   sc.nextLine();

//--------------------------------------------------      
		// 10. 연도를 입력받아 윤년인지 아닌지 출력하기(2024년, 2025년도로 확인할 것)
		// true or false => true이면 0000년은 윤년입니다로 출력할 것, false이면 0000년은 윤년이 아닙니다로 출력
		// 윤년 계산 : 연도가 4로 나누어떨어지고 100으로 나누어떨어지지 않거나 400으로 나누어떨어져야한다

//	   //연도 변수 1개 생성
	 //입력메소드 생성
		//true or false => true이면 0000년은 윤년입니다로 출력할 것, false이면 0000년은 윤년이 아닙니다로 출력
	   //-> if문을 활용해서 작성 ~이면 이라는 조건식이 들어가므로
	   //윤년 계산 : 연도가 4로 나누어떨어지고 100으로 나누어떨어지지 않거나 400으로 나누어떨어져야한다
	   //-> (연도%4==0) && ((!(연도%100==0)) || (연도%400==0))
	 //입력 버퍼 초기화
	   int year = 0;
	   
	   
	   System.out.print("입력받을 연도 : ");
	   year = sc.nextInt();
	   
	   
	   
		if(year%4==0 && ((!(year%100==0)) || (year%400==0))) {
			System.out.println(year + "년은 윤년입니다.");
		}else
			System.out.println(year + "년은 윤년이 아닙니다.");
		
		
		sc.nextLine();
//--------------------------------------------------   	   
		// 8. 두 숫자를 입력받아 첫번째 입력받은 숫자가 두번째 숫자보다 크거나 같은지 여부를 출력하기
		// ture or false

		// 1) 변수선언 3개 int 2개, boolean 1개
		// 2) 입력클래스 import
		// 3) 변수1 = sc.nextInt(); 변수2 = sc.nextInt();
		// 4) 변수3 = 변수1 >= 변수2
		// 5) 출력

	      int num1 = 0, num2 = 0;
	      boolean result4 = false;
//	      Scanner sc = new Scanner(System.in);
	      System.out.println("정수1 입력 : ");
	      num1 = sc.nextInt();
	      System.out.println("정수2 입력 : ");
	      num2 = sc.nextInt();
	      result4 = num1 >= num2;
	      System.out.println(result4);
//	      
//	      // 9. 두 숫자를 입력받아 한 숫자만 양수인지 여부 출력하기
//	      // true or false
//	      
	      //1) 변수 선언 3개(int 2개, boolean 1개)
	      //2) 입력메소드 nextInt()
	      //3) 관계연산자와 논리 연산자를 이용하여 1개의 숫자만 양수인지 여부 확인
	      //   (변수1 > 0 && 변수2 <= 0) || (변수2 > 0 && 변수1 <= 0)
	      //4) 출력
	      int num6 = 0, num4 = 0;
	      boolean result7 = false;
	      System.out.println("두 숫자를 입력하세요 (띄어쓰기로 구분) : ");
	      num6 = sc.nextInt(); //3
	      num4 = sc.nextInt(); //-5
	      result7 = (num6 > 0 && num4 <= 0) || (num4 > 0 && num6 <= 0);
	      System.out.println(result7);

		// 10. 연도를 입력받아 윤년인지 아닌지 출력하기(2024년, 2025년도로 확인할 것)
		// true or false => ture이면 0000년은 윤년입니다로 출력할 것, false이면 0000년은 윤년이 아닙니다로 출력
		// 윤년 계산 : 연도가 4로 나누어떨어지고 100으로 나누어떨어지지 않거나 400으로 나누어떨어져야한다

		// 1) 변수 선언 int 1개, boolean 1개
		// 2) 출력메시지
		// 3) 연도 입력받기
		// 4) boolean 타입 변수 윤년 여부 계산
		// 5) 출력

		int year2 = 0;
		boolean result8 = false;
		System.out.println("연도를 입력하세요 : ");
		year2 = sc.nextInt();
		result8 = (year2 % 4 == 0 && year2 % 100 != 0) || year2 % 400 == 0;
		System.out.println(result8);
//	      System.out.println(year + "는 윤년입니다");
//	      System.out.println(year + "는 윤년이 아닙니다");

		System.out.println(result8 ? year2 + "는 윤년입니다" : year2 + "는 윤년이 아닙니다");

	}

}
