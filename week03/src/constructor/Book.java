package constructor;

public class Book {
	String title = "제목없음"; //문자열 필드값 생성
	int series = 1; //필드값 정수형 생성 
	int page =100; // 필드값 정수형 생성
	
	Book(){ //생성자
		
	}
	
	Book(String t){ //생성자 문자열 매개변수  
		
		title = t; //매개변수의 값을 title에 저장
	}
	
	Book(String t, int p){ //매개변수의 값 두개를 받는 생성자
		title =t; //매개변수의 값을 변수에 저장
		page = p; // 매개변수의 값을 변수에 저장
	}
	
	Book(int s, String t){ //위치가 다른 매개변수 받는 생성자
		series = s; // 매개변수의 값을 변수에 저장 
		title = t; // 매개변수의 값을 변수에 저장
	}
}
