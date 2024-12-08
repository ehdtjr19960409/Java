package array;

import java.util.Arrays;

public class Ex06_11 {
	public static void main(String[] args) {
		
		int[] card = {1,6,4,5,3,2}; //중괄호 안에 값들을 정수형 참조변수에 선언 및 초기화로 저장
		int[] newCard = new int[card.length]; //card 배열의 크기만큼 newCard 참조변수의 방 크기 생성하고 선언 및 초기화
		
		for(int i = 0; i < card.length ; i++) { //card배열의 크기만큼 i는 반복
			newCard[i] = card[i]; //card의 값을 newCard배열에 저장
			
		}
		
		System.out.println("card배열 : " + Arrays.toString(card));//card배열 값을 출력
		System.out.println("newCard배열 : " + Arrays.toString(newCard)); //newCard배열의 값을 출력
	}
}
