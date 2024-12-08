package constructor;

public class Phone {
	String brand; //문자열 필드생성
	int series; //정수형 필드 생성
	String color = "검정색";  //문자열 필드 값 초기화
	
	
	Phone(String b, int s, String c){ //직접 선언한 생성자로 매개변수를 받는다
		
		brand =b; //매개변수 문자열 값을 저장
		series = s; //매개변수 정수형 값을 저장
		color = c; // 매개변수 문자열 값을 저장
		
	}
	
	void phoneInfo() { //매개변수 리턴값이 없는 메소드 호출
		System.out.println(color + " " + brand + " " + series); //출력메소드
	}
	
	
}
