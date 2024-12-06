package methodOverride;

public class Dog extends Animal{
	
	
	//생성자
	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	//메소드 오버라이딩 : 부모 클래스의 메소드를 자식클래스에서 재정의하는 것
	@Override
	void sound() {
		System.out.println(this.name + "이가 멍멍 짖습니다.");
	}
	
	
	

}
