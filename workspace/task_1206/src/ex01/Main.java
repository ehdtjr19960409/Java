package ex01;

import java.util.Scanner;

//신동석
public class Main {
	
	//성적 평가 프로그램
	//학생의 성적을 2과목 입력받아 학점을 계산하는 프로그램
	//90점이상 A, 80점이상 90점미만 B, 70점이상 80점미만 C, 70점미만 F
	//반드시 메소드를 만들 것(2개이상)
	//객체를 2개 만들 것
	
	
	//로직구성있어야함
	//사용자로부터 점수를 입력받고 학점과 합격 여부를 출력하기
	//필드 : 이름, java점수, DBMS점수, 총점, 학점
	
	//생성자 : 상관없음
	//메소드 : calculateGrade(int ) : 점수를 받아 학점 반환하는 메소드(매개변수1개 정수형)
	//		 isPass(int) : 점수가 70점이상이면 true, 아니면 false반환하는 메소드
	
	
	//main 로직
	// 스캐너클래스 생성
	// 메소드 클래스 생성 
	// 두과목에 대한 입력 메소드 받기
	//  사용자로부터 점수를 입력받고 학점과 합격 여부를 출력하기 -> if 조건문 필요
	//  두과목 합/평균 (정수형)
	
	
	//필드 값 -> int, int, int ,int 로 진행
	//메소드 로직
	// 메소드1 -> 학점반환 
	// 메소드2 ->  if문으로 학점 구분(boolean 타입 반환)
	
	
	
	public static void main(String[] args) {
			
			Main mm = new Main();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("학생1의 java, dbms 순으로 점수 입력 : ");
			int score1 = sc.nextInt();
			int score2 = sc.nextInt();
			System.out.println("학생2의 java, dbms 순으로 점수 입력 : ");
			int score3 = sc.nextInt();
			int score4 = sc.nextInt();
		
			System.out.println(mm.score1(9,9,9,9));
			System.out.println(mm.score2());
			
			System.out.println(mm.score3());
			System.out.println(mm.score4());
			
	}

	
}
