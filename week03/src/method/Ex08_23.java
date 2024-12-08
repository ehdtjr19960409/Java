package method;

public class Ex08_23 {
	public static void main(String[] args) {
		Person02 kim = new Person02(); //생성자를 통해 Person02 클래스에 kim이라는 객체생성
		kim.setAge(-30); //setAge메소드를 호출하고 인자를 -30넘겨준다
		kim.setAge(30); // setAge메소드를 호출하고 인자를 30넘겨준다
		System.out.println("kim의 나이는 "+kim.getAge() + " 세입니다."); //해당구문 출력
		
		
	}
}
