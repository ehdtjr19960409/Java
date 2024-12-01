package task;
//10번 : 실습

public class PrintTask {
   public static void main(String[] args) {
      
      //1. printf를 사용해 형식에 맞게 출력하기
      //이름 : 본인이름
      //나이 : 본인나이
      //취미 : 취미
      //키 : 실수형 2자리까지
      //몸무게 : 실수형 3자리까지
	   
	   
	  // 1) 변수를 선언하고 값을 초기화한다
	  // 2) printf 메소드를 사용하여 서식문자에 맞게 저장하고 이스케이프문자로 출력형태를 맞춘다
	   
	   // 문자열 타입 name 변수명 선언하고 신동석으로 초기화한다
	   // 정수 타입 age 변수명 선언하고 29로 초기화한다
	   // 문자 타입 hobby 변수명 선언하고 잠으로 초기화한다
	   // 실수형 타입 high 변수명 선언하고 176.5로 초기화
	   // 실수형 타입 weight 변수명 선언하고 52.5로 초기화
	   // prinf로 출력하기 위해서 실수형은 %s, 문자형은 %c, 정수형 %d, 실수형은 %f로 구분지어 출력한다
	   		//키는 실수형 2자리이므로 %.2f 두자리까지로 표기
	   		//몸무게는 실수형 3자리이므로 %.3f 세자리까지로 표기
	   // 한줄 줄바꿈이므로 \n을 각 %타입이 끝날때 선언
	   // 이름 나이 취미 키 몸무게에 맞춰서 초기화한 타입형 변수명을 ,로 표시로 구분지어 기입
	   
	   
		String name = "신동석";
		int age = 29;
		char hobby = '잠';
		float high =  175.5f;
		double weight = 52.5;
      
		System.out.printf("이름 : %s \n나이 : %d \n취미 : %c \n키 : %.2f \n몸무게 : %.3f", name, age, hobby, high, weight);	
      //2. 10진수의 값 255를 8진수, 16진수, 10진수로 각각 출력하기
		int num = 255;
		
			System.out.printf("\n8진수 : %o", num);
			System.out.printf("\n16진수 : %x", num);
			System.out.printf("\n10진수 :%d\n", num);
		
      //3. 상품정보를 println과 printf를 사용하여 아래 형식으로 출력하기
      //    각 자리수는 5자리로 정렬, tab키 2번 사용
//      -------------------------
//      상품명         가격
//      -------------------------
//      메로나         1500원
//      누네띠네        1200원
//      꼬북칩         2000원
//      초코파이        3000원
//      -------------------------
		System.out.println("");		// 위에 코드와 구분짓기 위해 사용
		
		//상품명, 메로나, 누네띠네, 꼬북칩, 초코파이라는 문자열 타입 productName,1,2,3,4변수로 초기화 선언
		//가격은 문자열 타입 price 변수명으로 초기화 선언
		//정수형으로 price1,2,3,4 1500, 1200, 2000, 3000원으로 초기화 선언
		
		// 첫번쨰 ---표시하기 위해 println으로 줄바꿈 출력메소드 
		// printf로 %s문자열 productName변수명과 맞춰주고 \t\t을 활용해서 가격 price변수명과 간격 유지
			//
			//다음줄로 넘어가기 위해서 \n 사용
		// 두번째 ---표시하기 위해 println으로 줄바꿈 출력메소드
		// 메로나 값의 변수명은 %s,/t/t 간격유지 가격 price1은 %d로 기입(다섯자리로 정렬이기때문에 %5d 사용) 후 \n으로 줄바꿈
		// 각 변수명에 들어간 값을 확인 후 변수명을 ,로 표시로 기입 후 printf 출력메소드
		// 누네띠네 값의 변수명은 %s,/t/t 간격유지 가격 price1은 %d로 기입(다섯자리로 정렬이기때문에 %5d 사용) 후 \n으로 줄바꿈
		// 각 변수명에 들어간 값을 확인 후 변수명을 ,로 표시로 기입 후 printf 출력메소드
		// 꼬북칩 값의 변수명은 %s,/t/t 간격유지 가격 price1은 %d로 기입(다섯자리로 정렬이기때문에 %5d 사용) 후 \n으로 줄바꿈 
		// 각 변수명에 들어간 값을 확인 후 변수명을 ,로 표시로 기입 후 printf 출력메소드
		// 초코파이 값의 변수명은 %s,/t/t 간격유지 가격 price1은 %d로 기입(다섯자리로 정렬이기때문에 %5d 사용) 후 \n으로 줄바꿈
		// 각 변수명에 들어간 값을 확인 후 변수명을 ,로 표시로 기입 후 printf 출력메소드
		// 세번째 ---표시하기 위해 println으로 줄바꿈 출력메소드
			
		String productName = "상품명";	
		String price = "가격";
		String productName1 = "메로나";
		String productName2 = "누네띠네";
		String productName3 = "꼬북칩";
		String productName4 = "초코파이";
		int price1 = 1500;
		int price2 = 1200;
		int price3 = 2000;
		int price4 = 3000;
		
		System.out.println("----------------------------------");
		System.out.printf("%s\t\t %s\n", productName, price);
		System.out.println("----------------------------------");
		System.out.printf("%s\t\t %5d원\n", productName1, price1);
		System.out.printf("%s\t\t %5d원\n", productName2, price2);
		System.out.printf("%s\t\t %5d원\n", productName3, price3);
		System.out.printf("%s\t\t %5d원\n", productName4, price4);
		System.out.println("----------------------------------");
	
		//4. 봄여름가을겨울을 아래와 같이 출력하기
		//출력문 1번으로 아래와 같이 출력하기
		// 봄
		//		여름
		//	가을	
		//		겨울
		
		//출력문 1번을 사용
		// printf문 출력메소드 사용
		// 봄을 기준으로 여름 가을 겨울의 \t의 개수를 사용
		// 봄 작성후 줄바꿈 활용
		// 여름은 가을보다 한칸더 떨어져 있으므로 \t를 2번사용
		// 가을은 봄보다 한칸 떨어져 있으므로 \t를 사용
		// 겨울은 여름과 일자로 작성해야하기 떄문 \t 2번사용 
		
		System.out.printf("봄\n\t\t여름\n\t가을\n\t\t겨울");
		
		
		
	}
}
