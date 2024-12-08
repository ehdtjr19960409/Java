package array;

import java.util.Arrays;

public class Ex06_10 {
	public static void main(String[] args) {
		
		int[] arr01 = {1,2,3}; //배열의 값을 넣언주면서 정수형 참조변수 선언 및 초기화
		
		int[] arr02 = arr01; //arr01의 값을 arr02의 배열에 저장 -> 얕은 복사
		
		System.out.println("arr01배열 : " + Arrays.toString(arr01)); //arr01배열의 값 출력
		
		arr02[1] = 10; //arr02의 1번째방의 값을 10으로 변경
		
		System.out.println("arr02배열 : "+Arrays.toString(arr02)); //arr02의 배열 출력
		System.out.println("arr01배열 : "+Arrays.toString(arr01)); //arr01의 배열 출력
	}
}
