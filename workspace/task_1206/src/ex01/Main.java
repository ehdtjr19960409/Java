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
	
	
	//=========================================
	
	public static void main(String[] args) {
		
		//6번 객체 생성 및 주소값 출력
		Student st1 = new Student("짱구", 80, 90);
		Student st2 = new Student("철수", 99 ,75);
		
		System.out.println(st1);
		System.out.println(st2);
		
		
		//7번 값을 출력
		System.out.println(st1.toatalScore);
		System.out.println(st2.toatalScore);
		
		//8번 boolean isPass 메소드 호출하고 삼항연산자로 Pass fail 결과값 출력
		//Integer.ParseInt(st1.isPass) 시 오류 발생
		System.out.println(st1.isPass((st1.javaScore + st1.dbmsScore)/2) ? "Pass" : "Fail");
	}
	
}
