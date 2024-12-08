package array;

public class Ex06_05 {
	public static void main(String[] args) {
		char[] cards = { '1', 'L', 'O', '2', 'V', '3', 'E' };		//하나의 문자와 숫자를 문자형 배열의 넣는다

		String myWord = ""; //문자열 타입 선언 및 초기화

		for (int i = 0; i < cards.length; i++) { //문자형 배열의 크기만큼 i값을 증가

			int word = cards[i]; //i값에 따라 해당 배열의 n번째방에 값을 정수형타입에 선언 및 초기화한 곳에 넣는다

			if (word >= 65 && word <= 90 || (word >= 97 && word <= 122)) { //65보다 같거나 크고 90보다 작거나 같다 또는 97보다 같거나 크고 122보다 작거나 같다 값의 참이라면 
				myWord += (char) word; // 문자열 타입으로 누적해서 더한다
			}

		}
		System.out.println("단어 : " + myWord); //문자열로 누적된 값 출력
	}

}