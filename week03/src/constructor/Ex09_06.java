package constructor;

public class Ex09_06 {
	public static void main(String[] args) {
		Person p1 = new Person("김자바" ,20); //생성자의 문자열과 정수형 값을 Person클래스의 객체에 저장
		Person p2 = new Person("이코딩", 40); // 생성자의 문자열과 정수형 값을 Person클래스의 객체에 저장
		
		p1.introduce(); //p1의 전달한 값을 통해 introduce메소드 결과값 호출
		p2.introduce(); //p2의 전달한 값을 통해 introduce메소드를 결과값 호출
	}
}
