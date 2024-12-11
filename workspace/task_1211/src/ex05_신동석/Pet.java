package ex05_신동석;
//Animal 추상클래스를 상속받아 구현
public class Pet extends Animal{

	public Pet(String name) {
		super(name);
	}

	



//    void performActions() : 위 세 메소드를 호출하여 행동을 출력 -> 오버라이딩 부모로부터 상속받은것이므로	
@Override
	void performActions() {
		// TODO Auto-generated method stub
		super.performActions();
	}

	//   메소드 void play() : 동물이 장난치는 행동을 출력
	void play() {
		System.out.println("동물이 장난치는 행동");
	}
// 메소드 void eat() : 동물이 먹는 행동을 출력	
	void eat() {
		System.out.println("동물이 먹는 행동");
		
	}
//    void sleep() : 동물이 잠자는 행동을 출력
	void sleep() {
		System.out.println("동물이 잠자는 행동");
		
	}
	





}
