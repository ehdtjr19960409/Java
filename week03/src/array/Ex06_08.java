package array;

import java.util.Arrays;

public class Ex06_08 {
	public static void main(String[] args) {
		
		int[] arr = {1,6,2,3,10,7,4,5,8,9}; //10까지의 수를 arr참조변수에 저장
		
		
		System.out.println("정렬 전 배열 : " + Arrays.toString(arr)); //정렬전 넣은 값 순서대로 출력
		
		Arrays.sort(arr); //정렬함수를 사용
		System.out.println("정렬 후 배열 : " + Arrays.toString(arr)); //정렬후 값 순서대로 출력
		
		
	}
}
