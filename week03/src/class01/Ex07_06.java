package class01;

public class Ex07_06 {
	public static void main(String[] args) {
		
		Car c = new Car(); //객체생성
		
		System.out.println("wheel의 개수는 " + c.wheel + "개입니다."); //car 클래스의 있는 필드값 출력
		 
		c.wheel = 5; //c객체의 데이터인 값을 5로 변경
		
		System.out.println("wheel의 개수는 " + c.wheel + "개입니다."); //car클래스의 필드값 출력
	}
}
