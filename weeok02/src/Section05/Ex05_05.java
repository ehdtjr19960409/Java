package Section05;

public class Ex05_05 {
	public static void main(String[] args) {
		
		int sum = 0; //정수형변수 선언
		int i =1; //정수형변수 선언
		
		while(i<=10){ //i가 10보다작거나 같을 때까지
			
			sum += i; //sum값에 sum과 i를 더해서 저장
			i++; // i는 증가한다
		}
		System.out.println("합 : "+sum); //1부터 10까지의 더한 값 출력
	}
}
