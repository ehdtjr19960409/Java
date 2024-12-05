package animalTask;

public class Animal {

//	1. 동물 클래스를 작성하세요
//	 필드(속성) : '이름', '나이', '종류'라는 필드
//    - 이름 : 동물의 이름을 저장하는 곳
//    - 나이 : 동물의 나이를 저장하는 곳
//    - 종류 : 동물의 종류(개, 고양이, 새 등)를 저장하는 곳

	//필드
	String name;
	int age;
	String type;
	
	// 생성자 생각해보기
	// 집가서 복습하고 만들어보기
	
	//모든 필드내에 매개변수를 받는 생성자
	public Animal(String name, int age, String type) {
		
		this.name=name;
		this.age=age;
		this.type=type;
		
	}
	
		
//	 메서드(행동)
//	    - 밥먹기() : 동물이 밥을 먹는 행동을 하는 메서드
		void eat() {
			System.out.println(this.name + "이/가 밥을 먹습니다.");
		}
		
//	    - 놀기() : 동물이 노는 행동을 하는 메서드
		
		void play() {
			System.out.println(this.type + "이/가 놉니다.");
		}
		
//	    - 자다() : 동물이 자는 행동을 하는 메서드
		
		void sleep() {
			System.out.println(this.name + "이/가 잡니다.");
			
		}
//	    - 생일축하() : 동물의 생일을 축하하는 메서드
		void birthDay() {
			System.out.println(this.type + " 생일축하해");
		}


	
}
