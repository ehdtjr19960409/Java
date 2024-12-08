package method;

public class Calc02 {

	public static void main(String[] args) {

		Calc02 calc = new Calc02(); //메소드 클래스 import 하고 객체명 선언
		int[] nums = { 500, 200 }; //2크기의 정수형 배열 선언

		System.out.println("숫자들의 합은 " + calc.sum(nums) + "입니다."); //sum메소드 return 값을 넣어 해당 구문 출력

	}

	int sum(int[] nums) { //선언부 정수형 sum메소드명, 인자값 정수형 배열 값을 받는 것을 선언
		int result = 0;	//초기값 작성
		for (int i = 0; i < nums.length; i++) { //배열의 길이만큼 반복

			result += nums[i]; //누적해서 덧셈 연산

		} return result; //정수형으로 반환

	}

}
