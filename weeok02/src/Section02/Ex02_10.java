package Section02;

public class Ex02_10 {
	public static void main(String[] args) {

		int myAge = 20; //20이라는 값 변수에 저장
		int yourAge = 30; //30이라는 값 변수에 저장
		int tempAge; //정수형타입으로 변수선언

		tempAge = myAge; //MyAge변수안에있는 값을 tempAge 변수에 저장
		myAge = yourAge; // yourAge변수안엤는 값을 myAge에 저장
		yourAge = tempAge; //tempAge 변수안에있는 값을 yourAge에 저장

		System.out.println(myAge); //30출력
		System.out.println(yourAge); //20출력
	}
}
