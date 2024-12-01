package Section04;

public class Ex04_07 {
	public static void main(String[] args) {
		int favorite = 7; //정수형변수 선언
		
		if(favorite < 5) { //변수값과 5를 비교해서 5보다 작으면
			System.out.println("좋아하는 숫자가 5보다 작습니다."); //출력메소드
		}else if(favorite > 5) { //변수값이 5보다 크면
			System.out.println("좋아하는 숫자가 5보다 큽니다."); //출력 메소드
		}else { //같을 경우
			System.out.println("좋아하는 숫자가 5입니다."); //출력메소드
		}
	}
}
