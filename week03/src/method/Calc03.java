package method;

public class Calc03 {

	public static void main(String[] args) {
	
		int[] nums = {500,200}; //값을 알고있는 배열 크기 2칸 생성
		
		Calc03 calc = new Calc03(); //메소드 클래스 imprt 및 객체명 선언
		
		System.out.println("숫자들의 합은 " + calc.sum(nums) + "입니다."); //sum 메소드의 받아온 값을 호출해서 출력
		
	}
	
	int sum(int[] nums) { //선언부 - 리턴o, 매개변수o 
		
		int result = 0; //총합 변수
		for(int i = 0; i< nums.length; i++) { //배열의 길이만큼 반복한다
			
			result += nums[i]; //i의 0번째방부터 배열의 길이만큼 각 방에 있는 수를 더한다 
			
		}
		return result; //더한 총합 값을 메인메소드 보낸다
		
	}
	
	
	
}
