package class01;

public class Ex07_15 {
	public static void main(String[] args) {
		Student01 stu1 = new Student01(); //생성자를 통해 객체생성
		stu1.studentName = "김고이"; //객체의 필드값을 초기화
		stu1.hello(); //hello메소드 호출
		System.out.println("학교는 "+Student.schoolName+" 입니다."); //출력문
		Student.goToSchool(); //정적 메소드 호출
		
		Student01 stu2 = new Student01(); //생성자를 통해 새로운 객체 생성
		
		stu2.studentName = "김고삼"; //객체 필드값 초기화
		stu2.hello(); //메소드 호출
		System.out.println("학교는 "+Student.schoolName+" 입니다."); //출력문
		Student.goToSchool(); //정적 메소드 호출
		
	}
}
