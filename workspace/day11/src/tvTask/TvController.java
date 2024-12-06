package tvTask;

import java.util.Scanner;

public class TvController {
	
	public static void main(String[] args) {
		
		//로직
		// 프로그램 사용자 입력 -> scanner 클래스 사용
		// 메소드 호출 -> 메소드 클래스 사용
		// main에서 색상 크기 가격 초기값 넣기, BasicTV에서 객체 생성
		// TV 컨트롤 메뉴 -> While문으로 참일 때 즉, 전원이 켜진상태에서 진행
		//if문으로 1눌렀을 때 전원 on / off를 사용
		// 1 눌렀을 때 전원on -> BasicTv powerOnOff() 호출
		// 2 채널 증가하면서 채널번호 출력 -> void channelUp() 호출
		// 3 채널 내리기는 기존 값에서 내린 값을 출력 -> channelDown() 호출
		// 4 자체 프로그램 종료->  출력문사용
		
		// =================이해가 안가는 부분=================================
		// ? on 상태를 off 상태로 변경방법 ->  off기능을 분리해야한다고 생각했는데..흠..
		// ? off가 선행되었을 때 -> 채널 up/down "TV 전원을 먼저 켜주세요." 메시지 출력(선행x)
		Scanner sc = new Scanner(System.in);
		BasicTv tv = new BasicTv();
		
		
		tv.color = "Black";
		tv.size = 32;
		tv.price = 500000;
		
//		if(!(tv.power)) {
		while (true) {
			tv.printInfo();
			int num = sc.nextInt();
			if (num == 1) {
				tv.powerOnOff();

			} else if (num == 2) {
				tv.channelUp();
			} else if (num == 3) {
				tv.channelDown();
			} else {
				System.out.println("프로그램 종료합니다.");
				break;
			}
			System.out.println(" ");
		}
// 		}else {tv.printInfo();}
	}
}
//3. BasicTv 클래스와 함께 동작하는 TvController 프로그램을 작성하세요
//프로그램은 사용자로부터 명령을 입력받아 TV를 제어한다
//
//BasicTv 객체를 생성하고, 초기값으로 색상 "Black", 크기 32인치, 가격 500000원을 설정
//프로그램은 무한 반복(while)하며 사용자에게 다음 메뉴를 출력한다
//
//=== TV 컨트롤 메뉴 ===
//1. 전원 On/Off
//2. 채널 올리기
//3. 채널 내리기
//4. 종료
//메뉴 번호 입력 : 
//
//사용자가 메뉴 번호를 입력하면, 입력된 번호에 따라 다음 동작을 수행한다
//1 : powerOnOff() 메서드 호출
//전원이 켜지면 "TV 전원이 켜졌습니다." 출력, 꺼지면 "TV 전원이 꺼졌습니다." 출력
//2 : TV 전원이 켜져 있으면 channelUp() 메서드 호출하고, "현재 채널: [채널 번호]"를 출력
//꺼져 있으면 "TV 전원을 먼저 켜주세요." 메시지 출력
//3 : TV 전원이 켜져 있으면 channelDown() 메서드를 호출하고, "현재 채널: [채널 번호]"를 출력합니다. 꺼져 있으면 "TV 전원을 먼저 켜주세요." 메시지 출력
//그 외 : 프로그램을 종료하고 "프로그램을 종료합니다." 메시지 출력

//+ Off 기능 추가 BasicTv클래스에 기능 추가 -> while문안에서 1을 다시 눌렀을 때 off ? 
//+ 꺼져 있으면 "TV 전원을 먼저 켜주세요." 메시지 출력 추가 -> off일 때

