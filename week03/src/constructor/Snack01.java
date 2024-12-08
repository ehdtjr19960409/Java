package constructor;

public class Snack01 {
	
	int price; //필드값 생성
	
	Snack01(int p){ //직접선언한 생성자, 매개변수 정수형 선언
		price = p; //매개변수의 값을 price에 저장
	}
	
	void info() { //리턴값과 매개변수를 받지않는 메소드 생성
		
		System.out.println("과자의 가격은 " + price + "입니다."); //해당구문 출력
		
	}
}
