package tvTask;

public class BasicTv {

	//2. BasicTv 클래스를 작성하세요
	//필드 :
	//boolean power : TV 전원 상태 (기본값: false)
	//int channel : TV 채널 (기본값: 1)
	//String color : TV의 색상
	//int size : TV의 크기
	//int price : TV의 가격
	//
	//메서드:

	// 필드에 변수 생성 
	boolean power; //false

	int channel;
	String color;
	int size;
	int price;
	
	//void powerOnOff() : TV 전원을 켜거나 끄는 메서드
//    전원이 켜져 있으면 끄고, 꺼져 있으면 켜야 다른 동작이 가능하다
	void powerOnOff() {
//hint1 ->  전원 on / off 식 추가
//hint2 -> boolean 타입으로 반전추가	
		power = !power; //+ 반전 술식 boolean 초기값은 false인데 !사용시 참으로 변경
		
		if(power) {
			System.out.println("TV 전원이 켜졌습니다.");
		}else {
			System.out.println("TV 전원이 꺼졌습니다.");
		}
		
		
		
		
	}
	
	// void channelUp() : 채널을 1씩 증가시키는 메서드
	//TV의 전원이 켜진상태라는 전제가 조건 추가
	//    채널 최대값 999 
	//	  거짓값이면 tv 전원을 먼저 켜주세요 구문 생각
	// 최댓값 보다 작으면 누적해서 올라가게 사용  -> 후위연산

	void channelUp() {

		if (power) {
			if (channel < 999) {
				channel++; // 1000까지 값이 올라간다
				System.out.print("현재 채널: " + channel);
			}
		} else {
			System.out.println("TV 전원을 먼저 켜주세요.");

	}
}

	//void channelDown() : 채널을 1씩 감소시키는 메서드
	// TV의 전원이 켜진 상태라는 전제조건 추가
	// 채널 최소값 1,  + 채널이 999까지 나오니 1000으로 범위 설정
	// 거짓값이면 tv 전원을 먼저 켜주세요 구문 생각
	//	채널의 최소값이 1이므로 감소해야한다. 후위 감소 연산자로 진행
	void channelDown() {
		
		if (power){
			
			if ( channel > 1 ) {
				channel--;
				System.out.println("현재 채널 : " + channel);
			}
		}else {
			System.out.println("TV 전원을 먼저 켜주세요");
		}
	}
	//티비가 사용 될 때 지속적으로 확인할 수 있게끔 출력문 구성
	void printInfo() {
		
		System.out.println("1. 전원 On/Off");
		System.out.println("2. 채널올리기");
		System.out.println("3. 채널 내리기");
		System.out.println("4. 종료");
		System.out.print("메뉴 번호 입력 : ");
	}
}


