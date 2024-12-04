package section08;

public class Jogger {
	

	public static void main(String[] args) {
		Jogger jogger = new Jogger(); //출력메소드 클래스 import
		String name = "김나비"; //문자열 선언
		jogger.sayName(name);  //sayName 메소드 name이라는 값을 호출
		jogger.run(); // run 메소드 호출
		
	}
	
	void run() { // 리턴 받을 값이 업으므로 void
		System.out.println("run, run, run"); // 해당 문자열 출력
	}
	
	void sayName(String name) { //리턴 받은 값이 없고, 매개변수 문자열로 받는다
		
		System.out.println("제 이름은 " + name + "입니다."); //해당문자열 출력
	}
	
}
