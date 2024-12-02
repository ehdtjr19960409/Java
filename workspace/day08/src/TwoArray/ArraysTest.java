package TwoArray;

import java.util.Arrays;

//7번 : Arrays.sort()를 이용한 정렬
public class ArraysTest {
	public static void main(String[] args) {
		
		int[] number = {5,2,9,1,6};
		int[] number1 = {5,2,9,1,6};
		
		System.out.println("정렬 전 : " + Arrays.toString(number));
		
		Arrays.sort(number);
		
		System.out.println("정렬 후 : " + Arrays.toString(number));
		
		Arrays.sort(number1, 1, 4); //부분정렬 1~3까지 인데스 정렬
		
		System.out.println("4번 index까지만 정렬 후 : " + Arrays.toString(number1));
		
	}
}
