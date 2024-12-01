package Section02;

public class Ex02_13 {
public static void main(String[] args) {
	double marathon = 42.195; //double형 타입 변수 선언 및 초기화
	//실수형 타입에 42.195값을 초기화 및 선언
	
	float halfMarathon = 21.0975f; //float형은 소수점 7자리까지이므로 f를 데이터 값에 표현 안할시 오류발생
	
	System.out.println("마라톤은 "+marathon + "km를 달립니다."); //marathon 변수 값 출력
	System.out.println("하프마라톤은 " + halfMarathon+"km를 달립니다"); //halfMarathon 변수 값 출력
}
}
