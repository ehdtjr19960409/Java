package task01;

public class task01 {
//	1) 직원 프로그램
//	Employee 클래스
//	필드 
//	   name, salary
//	메소드
//	   calculateBonus() : 기본적으로 salary * 0.1 반환
//
//	Manager와 Developer 클래스는 Employee 클래스 상속
//	Manager 클래스
//	   calculateBonus()를 오버라이딩하여 salary * 0.2 반환
//	Developer 클래스
//	   calculateBonus()를 오버라이딩하여 salary * 0.15 반환
//	메인 메소드에서 다형성을 사용하여 Employee 타입 배열에 각 객체를 저장하고, 보너스 계산

	
// 로직 구성
	//Employee 클래스 생성
	// 필드 String name; 
	//	int salary; 
	//	double calculateBonus(int salary){return salary * 0.1} 기본메소드 생성
	//
	
		
	//  Manger 클래스 생성	
	//	extends employee 작성
	//
	//
	//
	//
	
	// Developer 클래스 생성
	// extends employee 작성
	//
	//
	//
	
	//main
	//Employee 인스턴스화 
	//매개변수o, 리턴값o 방식으로 인자값 넣어서 호출
	//
	//
	//
	
	
	
	public static void main(String[] args) {
		Employee em = new Employee();
		System.out.println(em.calculateBonus("신동석",35400));
		
	
		
		
	}


}
