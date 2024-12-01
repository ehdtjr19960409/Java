package task;

public class Task02 {
	public static void main(String[] args) {
		// int, long, double, float, boolean, char
		// 1. 정수(int) -> 모든 자료형 자동형변환 가능여부 확인
		int year = 96; 
		long result = year; 
		double result1 = year;
		float result2 = year;
//		 boolean result3 = year;
//		 char result4 = year;
		
		// int(4byte)이므로 long(8byte), double(8byte), float(4byte) 가능
		// boolean(1byte), char(2byte)
		
		
		
		// 2. 정수(long) -> 모든 자료형 자동형변환 가능여부 확인
		long year1 = 24L;
		// int result5 = year1;
		double result6 = year1;
		float result7 = year1;
		// boolean result8 = year1;
		// char result9 = year1;
		
		//long(8byte)이므로 double, float은 가능
		//단, int, boolean, char은 자동형변환 불가

		// 3. 실수(double) -> 모든 자료형 자동형변환 가능여부 확인
		double year2 = 25.62;
//		int result10 = year2;
//		long result11 = year2;
//		float result12 =year2;
//		boolean result13 = year2;
//		char result14 = year2;
		
		//double(8byte)이므로 int, long, float, booelan, char 타입은 자동형변환이 불가
		
		// 4. 실수(float) -> 모든 자료형 자동형변환 가능여부 확인
		float year3 = 45.12f;
//		int result15 = year3;
//		long result16 = year3;
		double result17 = year3;
//		boolean result18 = year3;
//		char result19 = year3;
		
		//float은 (4byte) int, long, double, char은 자동형변환 불가
		//doubtle 실수형은 8byte로 가능
		
		// 5. 논리형 (boolean) -> 모든 자료형 자동형변환 가능여부 확인
//		boolean isTrue = true;
//		int result20 = isTrue;
//		long result21 = isTrue;
//		float result22 = isTrue;
//		double result23 = isTrue;
//		char result24 = isTrue;

		//논리형은 1byte로 자동형변환이 불가		
		
		
		// 6. 문자형(char) -> 모든 자료형 자동형변환 가능여부 확인
		char txt = 'D';
		int result20 = txt;
		long result21 = txt;
		float result22 = txt;
		double result23 = txt;
		//boolean result24 = txt;
		System.out.println(result20);
		System.out.println(result21);
		System.out.println(result22);
		System.out.println(result23);
		
		//문자형은 boolean을 제외한 나머지 값에 자동형변환을 통해 아스키코드 값으로 변경
	}
}
