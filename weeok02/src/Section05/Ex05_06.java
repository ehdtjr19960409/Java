package Section05;

public class Ex05_06 {
	public static void main(String[] args) {
		
		int sum =0; //정수형변수 선언
		int i =1; //정수형변수 선언
		
		do { //2.실행문
			sum +=i; //sum 값에 sum과 i를 더한값을 반복해서 저장
			i++; // i증감식 조건식이 만족할 때까지
			
		}while(i<=10); //i가 10보다 작거나 같을 때 2.실행문이 실행
		
		System.out.println("합 : "+sum); // do while 문에서 실행한 1부터 10까지의 더한 값 출력
	}
}
