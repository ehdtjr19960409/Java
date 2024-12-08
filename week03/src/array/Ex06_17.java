package array;

public class Ex06_17 {
	public static void main(String[] args) {
		int[] score = {90,92,93}; //score 정수형 배열에 값을 저장하고 초기화
		
		int sum = 0; //정수형 값 초기화
		double avg = 0; //실수형 값 초기화
		
 		for(int val : score) { //score배열의 값을 추출해 정수형 변수에 대입
			sum += val; //대입된 값을 누적해서 sum값에 더하기
			
		}
		avg = (double) sum/3; //int형 자동형변환을 통해 나누기 연산하여 대입
		System.out.println("총점 : " + sum + ", 평균 : " + avg); //총점 평균 출력
	}
}
