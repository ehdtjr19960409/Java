package ex04_신동석;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//메인 메소드 구현
		// Student 객체를 생성하여 이름과 점수를 입력받는다
		// 	단, 0-100범위 내, 입력클래스 사용
		// 각 학생의 총점과 평균을 출력한다
		
		// 다른 클래스 및 다른 메소드를 포함해서 진행하다보니 위에서 막히면 main에서 멈추게되는 현상
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생이름, java점수, db점수, html 점수 입력: ");
		String name = sc.next();
		int java = sc.nextInt();
		int db = sc.nextInt();
		int html = sc.nextInt();
		
		Student st = new Student(name, java, db, html);
		//Student st = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		System.out.println("총점 : " + st.getTotalScore());
		System.out.println("평균 : " +  st.getAverageScore());
		
		
	}
}
