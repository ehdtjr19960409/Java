package constructor;

public class Ex09_02 {
	public static void main(String[] args) {
		Snack chip = new Snack(); //생성자를 통해 Snack클래스의 객체 생성
		chip.price = 2000; //객체의 필드값을 초기화 
		chip.info();	//info메소드 호출
	}
}
