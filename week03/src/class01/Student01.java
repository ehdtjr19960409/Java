package class01;

public class Student01 {
	
	static String schoolName = "코리아 고등학교"; //정적 필드값 생성
	String studentName;
	
	static void goToSchool() { //정적메서드 선언
		System.out.println("오늘은 학교에 가는 날입니다"); //출력문
		
	}
	
	void hello() { //인스턴스 메소드 선언
		System.out.println("안녕하세요, 제 이름은 " + studentName + "입니다"); //출력문
	}
}
