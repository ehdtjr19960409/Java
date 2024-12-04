package section08;

public class Calc01 {
	
	
	public static void main(String[] args) {
		Calc01 calc01 = new Calc01(); //메소드 클래스 import 및 객체명 생성
		int nums[] = {100,200}; //정수형 1차원 배열 생성
		calc01.sum(nums); //sum메소드에 배열 인자값을 전달 및 호출
		
	}
	
	
	void sum(int[] nums) { //선언부 인자값에 배열로 선언
		
		int result = 0; // 초기값
		
		for(int i = 0; i< nums.length; i++) { // 배열의 길이만 큼 반복 
			
			result += nums[i]; //2개의 방에 들어있는 것을 누적해서 더하기 연산
		}
		
		System.out.println("숫자들의 합은 " + result + "입니다."); //해당 구문 출력
		
		
		
	}
}
