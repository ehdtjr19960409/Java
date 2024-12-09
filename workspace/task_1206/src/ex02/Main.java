package ex02;

import java.util.Scanner;

//신동석
public class Main {
	public static void main(String[] args) {
		
		//5명의 학생의 점수(1과목)를 입력받아 아래를 수행하는 프로그램
		//총합 계산
		//평균 계산
		//최고 점수와 해당 인덱스 출력
		
		//점수는 배열에 저장하여 출력
		//나중에 학생수를 사용자 입력할 수 있도록 변경할 예정이다
	
		
		//로직
		
		// 메인
		// 메소드 클래스 생성
		// 스캐너 클래스 생성
		// 5명의 학생 과목 입력 받은 수로 선언
		// 5명의 점수를 배열로 저장
		// 배열의 길이만큼 조건식 작성
		// 방에 있는 점수를 총 더하고
		// 배열의 길이만큼 나눈다 -> 평균
		
		//최고점수는 배열의 방번호를 삼항연산자를 통해? 
//==================================================================
		
		//하나로 만드는 방식
		
		//1번 학생숭와 점수 저장할 배열 선언
		//입력클래스 import
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생의 수 입력 : ");
		int stu = sc.nextInt();
		int[] studentCount = new int[stu];
		
		//2번 점수입력
		System.out.println("학생 점수 입력 : ");
		for(int i = 0; i < stu; i++) {
			System.out.println((i+1) + "학생의 점수 : ");
			studentCount[i] = sc.nextInt();
	
		}
		
		//3번 총합 계산 //메소드
		int total = 0;
		for(int score : studentCount) {
			total += score;

		}
		
		
		//4번 평균계산 //메소드
		double avg = (double)total /stu;
		
		
		//5번 최고점수와 해당 인덱스 계산 //메소드
		int maxScore = studentCount[0];
		int maxIndex = 0;
		for(int i = 1; i < studentCount.length; i++) {
			if(studentCount[i] > maxScore) {
				
				maxScore = studentCount[i];
				maxIndex = i;
			}
		}
		//메소드로 나뉜다
		System.out.println("결과");
		System.out.println("총합 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("최고점수 : " + maxScore + ", 인덱스번호 : " + maxIndex);
		
		
		
		
	}
}
