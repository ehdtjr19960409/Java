package array;

import java.util.Arrays;
import java.util.Comparator;

public class Ex06_09 {
	public static void main(String[] args) {
		
		Integer[] arr = {1,6,2,3,10,7,4,5,8,9}; //10까지의 수를 정수타입 arr참조변수에 저장
		
		System.out.println("정렬 전 배열 : " + Arrays.toString(arr)); //정렬전 지정된 순서대로 값이 출력
		Arrays.sort(arr, Comparator.reverseOrder()); //내림차순 함수를 이용하여 정렬함수로 정리
		System.out.println("내림차순 정렬 : " + Arrays.toString(arr)); //내림차순으로 출력
		
	}
}
