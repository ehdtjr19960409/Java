package Section03;

public class Ex03_12 {
	public static void main(String[] args) {
		int x= 10; //정수형 변수 선언
		int y =1; //정수형 변수 선언
		
		y+=x; // y,x를 더하고 y에 저장
		System.out.println(y); //y값 출력
		
		y*=x; //위 코드에서 y에 저장된 11,x를 곱하고 y에 저장 
		System.out.println(y);//y값 출력
		
		y%=x; //위 코드에서 y에 저장된 110, x를 나누고 나머지를 y에 저장
		System.out.println(y); // y값 출력
	}
}
