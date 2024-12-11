package ex05_신동석;

public class Animal {
	
	//필드생성 -> protected 같은 패키지 내에서 자유롭게 사용
	protected String name;

	//매개변수로 받아서 초기화
	public Animal(String name) {
	
		this.name = name;
	}
	
	//리턴값이 있는 동물이름 반환메소드
	String getName() {
		
		return name;
	}
	
	//추상 메소드로 동물의 행동을 출력
	//추상 메소드란 불완전한것
	void performActions() {
		
		System.out.println("동물의 행동");
	}
	
}
