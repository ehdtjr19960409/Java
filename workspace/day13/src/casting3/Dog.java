package casting3;
//7번 : 캐스팅의 특징
public class Dog extends Animal {

	//생성자
	public Dog(String name) {
		super(name);
	}
	
	
	//메소드 오버라이딩
	@Override
	void crying() {
		// TODO Auto-generated method stub
		System.out.println("멍멍!");
	}
	


	void walk() {
		System.out.println("산책가기");
		
	}
	
	
}
