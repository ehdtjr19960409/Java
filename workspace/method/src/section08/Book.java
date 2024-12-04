package section08;

public class Book {
	
	public static void main(String[] args) {
		
		Book myBook = new Book(); //Book 메소드 클래스 import
		myBook.count(3); //카운트 메소드에 3이라는 인자값 전달 , count 메소드 호출
		
		
	}
	
	void count(int bookNum) { //선언부 리턴 받을 값이 없으므로 void 선언 , 매개변수 받을 값이 있으므로 int 형으로 선언
		
		System.out.println("책은 " + bookNum + "권 입니다."); // 해당 구문 출력
		
	}
	
}
