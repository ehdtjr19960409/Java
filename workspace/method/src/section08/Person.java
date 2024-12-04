package section08;

public class Person {
	
	public static void main(String[] args) {
		
		
		Person hong = new Person();  //메소드 클래스 import
		hong.introduce("홍길동", 20); //홍이라는 메소드 클래스 객체명에 인자값 2개를 넣는다 , introduce 메소드에 인자값 전달 및 호출
		hong.hello(); //hello 메소드 호출 
	}
	
	void hello() { //선언부
		
		System.out.println("안녕하세요 "); //문자열 출력
	}
	
	void introduce(String name, int age) { // 리턴 받을 값 x , 두개의 전달받은 인자 값을 생성
		
		System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "세입니다."); // 해당 구문 출력
		
	}
	
	
	
}
