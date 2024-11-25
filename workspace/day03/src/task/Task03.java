package task;

public class Task03 {
	public static void main(String[] args) {

		// int, long, double, float, boolean, char
		// 1. 정수(int) -> 모든 자료형 강제형변환 가능여부 확인
		int num = 29; // 정수 선언
		long result = (long) num;
		double result1 = (double) num;
		float result2 = (float) num;
		// boolean result3= (boolean)num;
		char result4 = (char) num;
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.print(result4 + "\n");

		// 2. 정수(long) -> 모든 자료형 강제형변환 가능여부 확인
		long num1 = 34L;
		int result5 = (int) num1;
		double result6 = (double) num1;
		float result7 = (float) num1;
		// boolean result8 = (boolean)num1;
		char result9 = (char) num1;

		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		System.out.println(result9);

		// 3. 실수(double) -> 모든 자료형 강제형변환 가능여부 확인
		double num2 = 45.453;
		int result10 = (int) num2;
		long result11 = (long) num2;
		float result12 = (float) num2;
		// boolean result13 = (boolean)num2;
		char result14 = (char) num2;
		System.out.println();
		System.out.println(result10);
		System.out.println(result11);
		System.out.println(result12);
		System.out.println(result14);

		// 4. 실수(float) -> 모든 자료형 강제형변환 가능여부 확인
		float num3 = 21.12f;
		int result15 = (int) num3;
		long result16 = (long) num3;
		double result17 = (double) num3;
		// boolean result18 = (boolean)num3;
		char result19 = (char) num3;

		// 5. 논리형 (boolean) -> 모든 자료형 강제형변환 가능여부 확인
//      boolean isTrue = false;
//      int result20 = (int)isTrue;
//      long result21 = (long)isTrue;
//      double result22 = (double)isTrue;
//      float result23 = (float)isTrue;
//      char result24 =(char)isTrue;

		// 6. 문자형(char) -> 모든 자료형 강제형변환 가능여부 확인
		char text = 'c';
		int result20 = (int)text;
		long result21 = (long)text;
		double result22 = (double)text;
		float result23 = (float)text;
		

	}
}