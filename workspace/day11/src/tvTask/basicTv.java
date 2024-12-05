package tvTask;

public class basicTv {

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
	boolean power;
	int channel;
	String color;
	int size;
	int price;
	
	//void powerOnOff() : TV 전원을 켜거나 끄는 메서드
//    전원이 켜져 있으면 끄고, 꺼져 있으면 켜야 다른 동작이 가능하다
	void powerOnOff() {
		
		//논리형 초기값은 false 이므로, 반전필요
		power = !power;
		
		//삼항연산자를 통해 조건을 걸 수 있다
		System.out.println(power ? "전원ON": "전원OFF");
		
	}
	
	// void channelUp() : 채널을 1씩 증가시키는 메서드
	//TV의 전원이 켜진상태라는 전제가 조건 추가
	//    채널 최대값 999
	// + 채널이 999초과할시 구문
	// + 종료할 시 구문
	//채널은 -1이 없으므로 0초과 999미만으로 설정하고 후위 연산자로 진행
	void channelUp() {
		if (power) {
			if (channel > 0 && channel < 997) {
				channel++; // 1000까지 값이 올라간다
				System.out.println("채널이 " + channel + " 입니다");
			}else if(channel >998) {
				System.out.println("올라갈 채널 범위 초과 ");
			}
		}else {
			System.out.println("전원 OFF");
		}
	}
	
	//void channelDown() : 채널을 1씩 감소시키는 메서드
	// TV의 전원이 켜진 상태라는 전제조건 추가
	//    채널 최소값 1,  + 채널이 999까지 나오니 1000으로 범위 설정
	// 		+ 채널이 1미만 시 구문
		// 	+ 종료할 시 구문
	//	채널의 최소값이 1이므로 감소해야한다. 후위 감소 연산자로 진행
	void channelDown() {
		if (power) {
			if (channel > 0 && channel < 997) {
				channel--;
				System.out.println("채널이 " + channel + " 입니다");
			} else if (channel < 0) {
				System.out.println("내려갈 채널 범위 초과");
			} else {
				
				System.out.println("전원 OFF");
			}

		}
	}
}


