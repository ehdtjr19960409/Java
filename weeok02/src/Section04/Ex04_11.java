package Section04;

public class Ex04_11 {
	public static void main(String[] args) {
		
		int num = 7; //정수형변수 선언
		
		switch(num) { //switch case문은 변수, 값만 사용 num값 대입 
			case 1: //1번째가 참일떄
				System.out.println("num은 1입니다."); //출력메소드
			case 7: //2번째가 참일 때
				System.out.println("num은 7입니다"); //출력메소드
			default : //위 case가 참이지 않을 떄
				System.out.println("num은 1도 7도 아님"); //출력메소드
				//break문이 없으므로 case7과 default이 둘다 실행됌
				
			
		}
	}
}
