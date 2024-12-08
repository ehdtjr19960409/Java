package constructor;

public class Person {
	String name; //문자열 필드 생성
	int age; //정수형 필드 생성
	
	Person(String n, int a){ //직접 선언한 생성자로 문자열과 정수형 매개변수를 받는다
		name = n; //n값은 name에 저장
		age = a; //a값은 age에 저장
		
	}
	
	void introduce() { //리턴값과 매개변수가 없는 메소드 생성
		
		System.out.println("안녕하세요. 저는 " + age + "세 " + name + " 입니다." ); //출력메소드
	}
}
