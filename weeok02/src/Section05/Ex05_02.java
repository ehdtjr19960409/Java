package Section05;

public class Ex05_02 {
	public static void main(String[] args) {
		
		int sum = 0; //정수형 변수 선언
		
		for(int i = 1; i<=100; i++) { //초기식 i는 1, 조건식은 100보다 작거나 같을 때까지 , 증감식 i를 증가
			
			if(i%2==0) { //if 조건식이 짝수일 때
				
				sum+=i; // sum값에 i를 더하고 sum값에 저장하는 것을 반복적으로 진행
				
			}
		}
		System.out.println("합 : "+sum); //1~100까지의 짝수만 더한 결과값 출력
		
	}
}
