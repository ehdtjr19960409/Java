package array;

public class Ex06_04 {
	public static void main(String[] args) {

		int[] numbers = new int[10]; // 10칸짜리 크기 생성

		for (int i = 0; i < numbers.length; i++) { // 배열의 크기만큼 i값을 증가

			numbers[i] = (int) (Math.random() * 30) + 1; // 30까지 수 중에 랜덤함수를 이용해 배열의 길이만큼 생성된 크기에 값을 넣는 방식

		}
		
		int sum = 0; //정수형 변수 선언 및 초기화
		for(int i = 0; i < numbers.length ; i++) { //배열의 크기만큼 i값을 증가
			
			if(numbers[i]%2==0) { //조건문 if사용, i의 값에 따라 해당 배열의 방번호의 값을 2로 나눴을 때 0으로 나누어 떨어진다면 짝수
					sum += numbers[i]; //위 식의 참이라면 짝수의 값을 sum값에 누적해서 더해 저장
				
			}
			
		}
		
		for(int i = 0; i< numbers.length; i++) { //배열의 길이만큼 i를 증가
			 
			System.out.print(numbers[i] + " ");  //랜덤함수를 이용한 배열의 값을 출력
			
		}
		
		System.out.println(); //줄바꿈
		System.out.println("배열의 짝수들의 합 : " + sum); //짝수의 누적된 값 출력
		
		
	}
}
