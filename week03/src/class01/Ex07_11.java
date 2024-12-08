package class01;

public class Ex07_11 {
	public static void main(String[] args) {
		
		Family father = new Family(); //Family 클래스의 father라는 객체를 생성
		Family son = new Family();  //Family 클래스의 son이라는 객체를 생성
		
		father.address = "인천"; //father 객체의 주소값을 인천으로 저장
		System.out.println(son.address); //son 객체의 주소값 출력
	}
}
