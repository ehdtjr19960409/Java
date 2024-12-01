package Section04;

public class Ex04_10 {
	public static void main(String[] args) {
		int num = 7; //정수형변수 선언
		switch(num) { //num 변수값 적용 switch case문은 값 변수만 가능
			case 1: //case1이 참일떄
				System.out.println("num은 1"); //출력 메소드
			case 7: //case7이 참일 때
				System.out.println("num은 7"); //출력 메소드
				break; //해당값이 참일 때 조건문 탈출
			default : //위의 값이 맞지 않을 경우
				System.out.println("num은 1도 7도 아님"); //출력메소드
		}
		
	}
}
