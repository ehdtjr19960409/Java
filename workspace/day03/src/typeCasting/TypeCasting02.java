package typeCasting;
//12번 : 자동 형변환
public class TypeCasting02 {
	public static void main(String[] args) {
		
		//1) 작은 자료형에서 큰 자료형으로 변환
		// int -> long
		int inVal = 100;
		long result = inVal;
		System.out.println(result);
		
		// int -> float
		float result2 = inVal;
		System.out.println(result2);
		
		// int -> double
		double result3 = inVal;
		System.out.println(result3);
		
		//float(4byte) -> double(8byte)
		double result4 = result2;
		System.out.println(result4);
		
		//2) 연산시 자동 형변환
		// 정수와 실수의 연산
		int intVal2 = 10;
		double doubleVal2 = 3.14;
		double result5 = intVal2 + doubleVal2;
		// float으로 강제 형변환시
		// float result5 = intVal2 + (float)doubleVal2;
		// float result5 = (float)(intVal2 + doubleVal2);
		System.out.println(intVal2 + doubleVal2);
		
		//3) 문자형('a')에서 정수형으로 변환
		char letter = 'a'; //a : 97의 값
		int asciVal = letter;
		System.out.println(letter);
		System.out.println(asciVal);
		
		char letter2 ='b';
		int asciVal2 = letter2;
		System.out.println(letter2);
		System.out.println(asciVal2);
		
		char letter3 ='A';	// A : 65의 값
		int asciVal3 = letter3;
		System.out.println(letter3);
		System.out.println(asciVal3);
		
		char letter4 = '가';
		int asciVal4 = letter4;
		System.out.println(letter4);
		System.out.println(asciVal4);
		
		
	}
	
}
