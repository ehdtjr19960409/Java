package method;

public class Bus {
	
	public static void main(String[] args) {
		
		Bus bus = new Bus(); //메소드 클래스 import 객체 생성
		
		int money = 10000; //정수형 변수의 초기 값 및 선언
		bus.take(money); //정수형 매개변수를 take 메소드에 보낸다
		
	}
	
	void take(int m) { //매개변수를 받을 정수 변수를 선언하고 리턴값이 없다
		while(true) { //참일때 
			if(m<3000) { //전달받은 매개변수가 3000보다 작다면 true일때
				System.out.println("교통카드를 충전하러 갑니다."); //해당구문 출력하고
				return; // 메소드를 종료시킨다
			}
			System.out.println("버스를 탑니다"); //조건문이 종료되고 해당구문을 출력
			m-= 1250; // 전달받은 매개변수에서 누적으로 1250원 감소시킨다
		}
		
	}
	
}
