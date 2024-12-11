package ex05_신동석;

public abstract class Animal {
	//추상클래스 명제가 주어졌을 때 -> abstract를 생각하거나 class 만들때 체크박스 생각
	
	
	//필드생성 -> protected 사용시 (같은 패키지 || 자식객체만 사용) - default랑 헷갈림
	protected String name;

	//매개변수로 받아서 초기화
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	//리턴값이 있는 동물이름 반환메소드
	public String getName() {
		return name;
	}
	

	//추상 메소드로 동물의 행동을 출력
	//추상 메소드란 불완전한것
	void performActions() {
		
		System.out.println("동물의 행동");
	}


	
}
