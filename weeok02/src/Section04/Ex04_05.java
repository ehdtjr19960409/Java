package Section04;

public class Ex04_05 {
	public static void main(String[] args) {
		int a=4; //정수형변수 선언
		int b =10; //정수형변수 선언
		int max = 0; //max 정수형 변수 선언
		
		if(a>b) { //a가 b보다 클경우 
			max =a; //a값을 max에 저장
			 
		}else { //b가 클경우
			max = b; //b값을 max에 저장
		}
		System.out.println(a+"와 " + b + " 중에 큰 수는 "+max + "입니다."); //결과 출력 메소드
	}
}
