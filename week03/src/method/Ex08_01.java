package method;

public class Ex08_01 {

	public static void main(String[] args) {
		
		printHello(); //printHello 메소드안에서 출력문 2개의 불러오는 것을 호출
		
		
	}
	
	static void printHello() {					//구현부 리턴 값이 없으므로 void 선언
		
		System.out.println("안녕하세요"); 			//해당 문자열 출력
		System.out.println("만나서 반갑습니다.");		//해당 문자열 출력
		
	}
}


