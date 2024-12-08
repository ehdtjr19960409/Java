package method;

public class Person02 {
	private int age; //클래스 내부에서 쓸 수있게 정수형 필드 값 선언
	
	void setAge(int num) { //매개변수 있고 리턴값 없는 메소드 생성
		if(num <= 0) { //매개변수로부터 받은 값이 0보다 작거나 같다면
			System.out.println("잘못된 수를 입력하셨습니다. 1이상의 값으로 설정하세요."); //해당 구문 출력
			return; //메소드 종료
		}else {
			age=num; //매개변수로부터 전달받은 값을 age에 저장
		}
	}
	
	int getAge() { //매개변수가 없고 리턴값이 정수형
		return age; //age의 값을 전달
	}
}
