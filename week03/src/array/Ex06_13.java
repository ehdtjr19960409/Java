package array;

import java.util.Arrays;

public class Ex06_13 {
	public static void main(String[] args) {

		int[] card = { 1, 6, 4, 5, 3, 2 }; //해당값을 정수형 참조변수에 저장
		int[] newCard = new int[card.length]; //card배열의 길이만큼 newCard 참조변수 배열에 저장
		
		System.arraycopy(card, 0, newCard, 0, card.length); //복사 대상, 0번째 위치, 복사받을 대상, 0번째 위치, 복사할 길이로 적용
		
		System.out.println("card 배열 : " + Arrays.toString(card)); //card 배열의 값 출력 
		System.out.println("newCard 배열 : " + Arrays.toString(newCard)); //newCard배열의 값 출력
		

	}
}
