package Section05;

public class Ex05_01 {
	public static void main(String[] args) {
		int sum = 0; //정수형 변수 선언 및 초기화
		
		for(int i = 1; i <= 10; i++) { //초기식은 1로 지정, 조건식은 1이 10보다 작거나 같을 때까지 , 증감식 i는 증가한다
			sum += i; // 조건식 1이 10보다 작거나 같을 때까지 sum값에 sum + i값 해서 반복해서 저장한다
		}
		System.out.println("합 : " + sum); //1~10까지의 더한 값 출력
	}
}
