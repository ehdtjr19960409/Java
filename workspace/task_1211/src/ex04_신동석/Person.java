package ex04_신동석;

public class Person {
	//필드(private) : String name(학생이름)
	private String name;
	
	//생성자 : 이름 매개변수로 받아 초기화  
	public Person(String name) {
	
		this.name = name;
	}
	
	//메소드 : getNmae() : name 필드의 값을 -> get은 값을 넣는것
	public String getName() {
		return name;
	}

}
