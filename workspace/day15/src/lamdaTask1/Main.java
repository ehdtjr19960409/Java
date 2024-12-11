package lamdaTask1;

public class Main {
	public static void main(String[] args) {

		// mutiple(new mutiple());
	}

	static void mutiple(MultipleInter mtp) {
//		- 이름은 claculator -> 모르겠다;;
//		- 매개변수는 boolean타입을 받는다. -> 모르겠다;;

		if (mtp instanceof MutipleInterEm) {

			// 람다식 곱한 값 리턴
			MultipleInter mti = (num1, num2) -> num1 * num2;
		}
		// 0을 반환하는 람다식
		MultipleInter mti = (num1, num2) -> 0;

	}

}
