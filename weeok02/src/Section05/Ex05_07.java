package Section05;

public class Ex05_07 {
	public static void main(String[] args) {
		
		int sum = 0; //정수형 변수 선언
		
		for(int i =1; i<=100; i++) { //i는 1부터, i가 100보다 작거나 같을 때, i는 증가
			
			if(i%2==0) {//i값의 짝수일 때
				
				continue; //이어서 sum+=i 구문으로 이동
				
				
			}
			sum +=i; //sum값에 sum + i 를 한것을 저장 (i가 100까지 짝수 더한값)  
		}
		System.out.println("짝수 합 : " +sum); // 1부터 100까지 짝수값 더한 것을 출력
		
	}
}
