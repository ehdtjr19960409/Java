package array;

import java.util.Arrays;

public class Ex06_12 {
	public static void main(String[] args) {
		
		int[] card = {3,1,4,5,10}; //해당 값을 card배열에 저장
		
		int[] newCard = Arrays.copyOf(card, card.length); //card 배열에 card배열의 길이만큼 copyof함수를 이용해서 newCard배열로 복사한다
		
		System.out.println("card 배열 : " + Arrays.toString(card)); //card배열의 값을 출력
		
		card[1] = 10; //card 1번째방 10으로 저장
		System.out.println("card 배열 : " + Arrays.toString(card)); //card 배열의 값 출력
		System.out.println("newCard 배열 : " + Arrays.toString(newCard)); //newCard배열의 값 출력
		

	}
}
