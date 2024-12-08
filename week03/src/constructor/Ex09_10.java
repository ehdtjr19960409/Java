package constructor;

public class Ex09_10 {
	public static void main(String[] args) {
		Phone01 p1 = new Phone01("갤럭시" , 1 , "흰색"); //생성자와 그 값을 통해 person클래스의 객체에 전달
		Phone01 p2 = new Phone01("아이폰" , 2); //생성자와 그 값을 통해 person클래스의 객체에 전달
		
		p1.phoneInfo(); //p1객체의 값을 통해 phoneInfo메소드의 전달된 결과값 호출
		p2.phoneInfo(); //p2객체의 값을 통해 phoneInfo메소드의 전달된 결과값 호출
	}
}
