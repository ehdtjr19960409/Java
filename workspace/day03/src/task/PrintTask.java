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
	   
		String name = "신동석";
		int age = 29;
		char hobby = '잠';
		float high =  175.5f;
		double weight = 52.5;
      
		System.out.printf("%s %d %c %.1f %.1f", name, age, hobby, high, weight);	
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
//      누네띠네       1200원
//      꼬북칩         2000원
//      초코파이       3000원
//      -------------------------
		System.out.println("");
			
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
		System.out.printf("%-5s\t\t %5s\n", productName, price);
		System.out.println("----------------------------------");
		System.out.printf("%-5s\t\t %5d원\n", productName1, price1);
		System.out.printf("%-5s\t\t %5d원\n", productName2, price2);
		System.out.printf("%-5s\t\t %5d원\n", productName3, price3);
		System.out.printf("%-5s\t\t %5d원\n", productName4, price4);
		System.out.println("----------------------------------");
	
		//4. 봄여름가을겨울을 아래와 같이 출력하기
		//출력문 1번으로 아래와 같이 출력하기
		// 봄
		//		여름
		//	가을	
		//		겨울
		System.out.println("봄\n\t\t여름\n\t가을\n\t\t겨울");
		
		
		
	}
}
